<!-- SHIELDS -->



[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![MIT License][license-shield]][license-url]



<!-- LOGO -->



<p align="center">
  <a href="https://github.com/warumono-for-develop/spring-boot-restful-api-server-template">
    <img src="https://github.com/warumono-for-develop/default/blob/master/logos/warumono-logo-492x500.png?raw=true" alt="Logo" width="292" height="300">
  </a>

  <h1 align="center">Spring Boot RESTFul API Server Template</h1>

  <p align="center">
    Spring Boot Application for GitHub + Docker + Jenkins CI / CD
    <br />
    <a href="https://github.com/warumono-for-develop/spring-boot-restful-api-server-template"><strong>Explore the docs »</strong></a>
    <br />
    <br />
    <a href="https://github.com/warumono-for-develop/spring-boot-restful-api-server-template">View Tutorial</a>
    ·
    <a href="https://github.com/warumono-for-develop/spring-boot-restful-api-server-template/issues">Report Bug</a>
    ·
    <a href="https://github.com/warumono-for-develop/spring-boot-restful-api-server-template/issues">Request Feature</a>
    <br />
  </p>
  <p align="center">
    <br />
    With Reference to
    <br />
    <a href="https://github.com/warumono-for-develop/docker-installation-tutorial">Docker Installation Tutorial</a>
    ·
    <a href="https://github.com/warumono-for-develop/jenkins-installation-tutorial">Jenkins Installation Tutorial</a>
  </p>
</p>



<!-- TABLE OF CONTENTS -->



## Table of Contents

* [About the Tutorial](#about-the-tutorial)
  * [Official Website](#official-website)
  * [Built With](#built-with)
* [Getting Started](#getting-started)
* [Usage](#usage)
  * [Step 1 빌드 테스트](#step-1)
  * [Step 2 API 테스트](#step-2)
* [Roadmap](#roadmap)
* [Contributing](#contributing)
* [License](#license)
* [Contact](#contact)



<!-- ABOUT THE PROJECT -->



## About The Application

[CI/CD](https://www.redhat.com/ko/topics/devops/what-is-ci-cd) 작업 환경에 필요한 어플리케이션

### Official Website

공식 사이트 또는 관련 정보를 미리 숙지하고 사용할 것을 권장

* [Spring Boot](https://spring.io/projects/spring-boot)

* [Gradle](https://gradle.org/)

### Built with

#### Required

- [x] [Spring Boot](https://jenkins.io/)

  2.2.5.RELEASE

- [x] [Gradle](https://gradle.org/)

  6.0.1



<!-- GETTING STARTED -->



## Getting Started

*사용자가 사용하는 프로그램 버전과 환경 등에 따라 설명글의 진행 절차와 결과가 다소 다르거나 생략 또는 추가 작업이 있을 수 있음*

*설명글에 사용되는 용어 및 단어 등은 되도록 공식적(?)으로 사용되는 것으로 표기하였으나 오탈자 및 잘못된 용어 또는 정보가 있을 수 있음*



<!-- USAGE EXAMPLES -->



## Usage

사용자의 요청에 따라 서버에서 임의의 고정 값 및 일시 그리고 파라메터 값을 받아 그대로 전달하는 간단한 어플리케이션

#### Step 1

##### 빌드 테스트

정상적으로 빌드한 후, 구동에 문제가 없음을 테스트

#### Step 2

##### API 테스트

###### Request

curl http://**_`{your-aws-ec2-ip}`_**:**_`{your-application-port}`_**/ping[?param=**_`{your-parameter-value}`_**]

|변수|설명|비고|
|---|---|---|
|your-aws-ec2-ip|AWS EC2 Public IP 또는 도메인||
|your-application-port|어플리케이션 접근 PORT||
|your-parameter-value|서버로 요청하는 파라메터 param 의 값|필수 값 아님|

```sh
your-terminal> curl http://54.180.113.162:8080/ping?param=1
```

또는, 웹 브라우져 등의 URL 입력 창에 http://{your-aws-ec2-ip}:{your-application-port}/ping[?param=your-parameter-value] 입력

###### Response

JSON 형식

|변수|타입|고정값여부|비고|
|---|---|-------|---|
|ping|String|고정값|pong|
|response|String|고정값|Hello Client!|
|your-param|String||사용자가 파라메터 param 으로 전송 요청한 값을 그대로 전달|
|timestamp|String||서버기준 사용자의 요청 일시|

```sh
{
  "ping": "pong",
  "response": "Hello Client!",
  "your-param": "1",
  "timestamp": "2020-03-01T01:23:45.678"
}
```


<!-- ROADMAP -->



## Roadmap

See the [open issues](https://github.com/warumono-for-develop/spring-boot-restful-api-server-template/issues) for a list of proposed features (and known issues).



<!-- CONTRIBUTING -->



## Contributing

Contributions are what make the open source community such an amazing place to be learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. Fork the Project

2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)

3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)

4. Push to the Branch (`git push origin feature/AmazingFeature`)

5. Open a Pull Request



<!-- LICENSE -->



## License

Distributed under the MIT License. See [`LICENSE`][license-url] for more information.



<!-- CONTACT -->



## Contact

**warumono** - warumono.for.develop@gmail.com

Project link: [https://github.com/warumono-for-develop/spring-boot-restful-api-server-template](https://github.com/warumono-for-develop/jenkins-installation-tutorial)



<!-- MARKDOWN LINKS & IMAGES -->



<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/warumono-for-develop/spring-boot-restful-api-server-template.svg?style=flat-square
[contributors-url]: https://github.com/warumono-for-develop/spring-boot-restful-api-server-template/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/warumono-for-develop/spring-boot-restful-api-server-template.svg?style=flat-square
[forks-url]: https://github.com/warumono-for-develop/spring-boot-restful-api-server-template/network/members
[stars-shield]: https://img.shields.io/github/stars/warumono-for-develop/spring-boot-restful-api-server-template.svg?style=flat-square
[stars-url]: https://github.com/warumono-for-develop/spring-boot-restful-api-server-template/stargazers
[issues-shield]: https://img.shields.io/github/issues/warumono-for-develop/spring-boot-restful-api-server-template.svg?style=flat-square
[issues-url]: https://github.com/warumono-for-develop/spring-boot-restful-api-server-template/issues
[license-shield]: https://img.shields.io/github/license/warumono-for-develop/spring-boot-restful-api-server-template.svg?style=flat-square
[license-url]: https://github.com/warumono-for-develop/spring-boot-restful-api-server-template/blob/master/LICENSE
[product-screenshot]: images/screenshot.png
