# spring-cloud-msa
### Antifragile(변화에 바로적응, 비용저렴)
1. auto scaling
2. microservices
3. chaos engineering
4. continuous deployments

### 확장 가능한 아키텍쳐
- 수평적 확장에 유연
- 확장된 서버로 시스템 부하 분산, 가용성 보장
- 시스템, 서비스 어플리케이션 단위의 패키지(컨테이너 기반)
- 모니터링

### 탄력적 아키텍쳐
- 서비스 생성 - 통합 - 배포, 비즈니스 환경 변화에 대응 시간 단축
- 분활된 서비스 구조
- 무상태 통신 프로토콜
- 서비스의 추가와 삭제 자동으로 감지
- 변경된 서비스 요청에 따라 사용자 요청 처리(동적 처리)

### 장애 격리(Fault isolation)
- 특정 서비스에 오류가 발생해도 다른 서비스에 영향을 주지 않음

### cloud native application
- CI/CD
    - 지속적인 통합(Continuous Integeration)
    - 지속적인 배포(Continuous Delivery/Deployment)
- DevOps
- Microservices
- Containers

### 클라우드 네이티브 애플리케이션을 개발하며 고려할 12가지 항목
1. base code
2. dependency isolation
3. configurations
4. linkable backing services
5. stages of creation
6. stateless processes
7. port binding
8. concurrency
9. disposability
10. development & production parity
11. logs
12. admin processes for eventual processes
+3항목
13. API first
14. Telemetry
15. Authentication and authorization

### Monolith Architecture
- 모든 업무 로직이 하나의 애플리케이션 형태로 패키지되어 서비스
- 애플리케이션에서 사용하는 데이터가 한곳에 모여 참조되어 서비스되는 형태

### Microservice
- an approach to developing a single application as a suite of small services
- business capabilities and independently deployalbe by fully automated deployment
- a bare minimum of centralized management of these services which may be written in different programming languages and use different data storage technologies

### Microservice의 특징
1. challenges
2. small well chosen deployable units
3. bounded context
4. restful
5. configuration management
6. cloud enabled
7. dynamic scale up and scale down
8. ci/cd
9. visibility

### MSA 표준 구성
<img width="752" alt="msa-표준-구성" src="https://user-images.githubusercontent.com/54053001/225342768-430354e4-96d8-4ea8-b369-9eaba0a4eb03.png">

### Spring Cloud
- Centralized configuration management : Spring Cloud Config Server
- Location transparency : Naming Server(Eureka)
- Load Distribution(Load Balancing) : Ribbon(Client Side), Spring Cloud Gateway
- Easier Rest Clients : FeignClient
- Visibility and monitoring : Zipkin Distributed Tracing, Netflix API gateway
- Fault Tolerance : Hystrix
