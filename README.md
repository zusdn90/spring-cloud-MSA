# Spring-Cloud-MSA 구성 실습
Spring Cloud MicroService Architechture

### 0. 개요
- Spring Cloud가 제공하는 서비스를 이용하여 Micro Service Architecture 구성 실습

### 1. 실습 환경
- Java 8~11
- SpringBoot 2.x
- Spring Cloud
- Intellij Ultimate

### 2. 서버 구성
- API Gateway 서버
- Conifg 서버
- Eureka 서버(Service Discovery)
- Micro Service(Member, Content)

### 3. 각 서버별 기능
- Conifg Server : 시스템의 환경 설정을 중앙화 하고 실시간으로 설정을 변경 및 반영한다.
- Eureka Server : 마이크로서비스들의 정보를 레지스트리에 등록할 수 있도록 하고 마이크로서비스의 동적인 탐색과 로드밸런싱을 제공한다.
- Zuul Api Gateway Server : 모든 마이크로서비스에 대한 요청을 먼저 받아들이고 라우팅하는 프록시 API Gateway 기능을 수행한다.
