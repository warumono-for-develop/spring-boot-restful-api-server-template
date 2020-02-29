FROM openjdk:8-jdk-alpine AS builder
COPY gradlew .
COPY gradle gradle
COPY build.gradle .
COPY settings.gradle .
COPY src src
RUN chmod +x ./gradlew
RUN ./gradlew bootJar

FROM openjdk:8-jdk-alpine
COPY --from=builder build/libs/*.jar app.jar
### ENVIRONMENT라는 이름의 argument를 받을 수 있도록 설정
#ARG PROFILE
### argument로 받은 PROFILE 값을 SPRING_PROFILES_ACTIVE에 적용
#ENV SPRING_PROFILES_ACTIVE=${PROFILE:-local}
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]
