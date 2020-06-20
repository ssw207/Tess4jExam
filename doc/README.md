# Tess4j 를 활용한 이미지중 특정역역 추출하기

## 개발환경
- Intellij ultimate
- java 1.11 open jdk
- Spring Boot 2.1.7
- Graddle 6.11
- Tess4j 4.5
- Windows 10 Pro
- Docker 
  - Centos7
  - Dockerfile
  
## 설치

### 프로젝트 세팅
- Gradle 프로젝트 생성
- 의존성추가
  - SpringBoot 2.1.7
  - Tees4j 4.5
 
### 도커 테스트환경 구축
#### 1.도커설치
- Docker Desktop 설치
- Ceontos 이미지 생성
  - Dockerfile 생성
    - yum install -y wget
  - docker build -t centos7 ./
- 이미지 시작
  - docker run -it -p 80:80 --name centos7 -v C:\Users\ssw89\docker\docker-compose\centos7\volumes:/etc/local centos7
  - docker start centos7
  - docker compose
    - https://www.44bits.io/ko/post/almost-perfect-development-environment-with-docker-and-docker-compose#docker-compose.yml-%ED%8C%8C%EC%9D%BC
- 이미지 접속
  - docker attach centos7
  
#### 2. 리눅스세팅
- java 설치
  - volume으로 설정한 경로에 jdk파일을 넣는다.
  - java 폴더 생성
    - mkdir -p /usr/local/java
  - 호스트의 jdk파일 복사
    - cp ./jdk-7u80-linux-x64.tar /usr/local/java
  - java 폴더이동
    - cd /usr/local/java
  - 압축해제
    - gunzip jdk-7u80-linux-x64.tar.gz
    - tar -xvf jdk-7u80-linux-x64.tar
  -  jdk 바로가기 생성 
     - ln -s jdk1.7.0_80 jdk
  - 환경변수 파일 열기
    - vi /etc/profile
  -  환경변수 추가
      - JAVA_HOME=/usr/local/java/jdk
      - CLASSPATH=.:$JAVA_HOME/lib/tools.jar
      - PATH=$PATH:$JAVA_HOME/bin
      - export JAVA_HOME CLASSPATH PATH
  - 환경변수 재적용
    - source /etc/profile
  - 적용확인
    - javac -version
- 톰켓 설치
- 