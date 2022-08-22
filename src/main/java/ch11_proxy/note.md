- ch11 변경 요구사항
  - ch10에서 작성한 뽑기 기계를 원격으로 모니터링하고 싶다

### 참고
- [oracle - rmi tutorial](https://docs.oracle.com/javase/7/docs/technotes/guides/rmi/hello/hello-world.html)
  - javac -d destDir Hello.java Server.java Client.java
  - rmiregistry 2001 &
  - java -classpath /Users/think-roon/IdeaProjects/HeadFirstDesignPattern/src/main/java/ch11_proxy/rmi_example/destDir/  -Djava.rmi.server.codebase=file:/Users/think-roon/IdeaProjects/HeadFirstDesignPattern/src/main/java/ch11_proxy/rmi_example/destDir/ ch11_proxy.rmi_example.Server &
  - java -classpath /Users/think-roon/IdeaProjects/HeadFirstDesignPattern/src/main/java/ch11_proxy/rmi_example/destDir ch11_proxy.rmi_example.Client

  - 도중에 port already in use뜨면.. 
    - lsof -i :{port number}로 해당 포트에서 실행 중인 프로세스 확인하고
    - kill -9 {PID}로 죽이고 서버 재실행 명령!

### 원격 프록시
- 기초
  - 클라이언트(클라이언트 객체, 클라이언트 보조 객체 = 통신용, 프록시) <-> 서버(서비스 객체, 서비스 보조 객체=통신용, 프록시)

  - 원격 프록시는 원격 객체의 로컬 대변자 역할
    - 원격 객체: 다른 JVM의 heap에 있는 객체
    - 로컬 대변자: 로컬 대변자의 어떤 메서드를 호출하면 원격 객체에게 그 메서드 호출을 전달해 주는 객체? = Proxy


- RMI (Remote Method Invocation)
  - RMI는 우리 대신 클라이언트와 서비스 보조 객체를 만들어준다고 함!
  - **RMI를 사용하면 다른 JVM에 있는 객체를 찾아서 그 메서드를 호출할 수 있다고 함..**
    - RMI는 통신을 처리해주는 클라이언트, 서비스 보조 객체를 만들어 준다고 함
    - 클라이언트 보조 객체는 stub, 서버(서비스) 보조 객체는 skeleton이라고 부른다고 함
  - 원격 서비스 만들기
    1. 클라이언트를 위한 원격 메서드 호출 인터페이스 만들기 -> java.rmi.Remote 확장
    2. 실제 원격 메서드 구현(서비스 구현)
    3. RMI 레지스트리? 실행
    4. 원격 서비스 실행

### 생각들
- 프록시는 '대신 해주다', '~하는 것처럼 행동한다'라는게 프록시의 행동을 잘 표현하는 듯

- 자바에 내장된 원격 호출 기능이 뭐지? 그냥 java.net 이나 java.nio 패키지에 있는 기능들 말하는건가?

- 클라이언트가 원격 객체를 찾아서 접근할 때 쓰는 lookup 서비스가 뭔지 잘 모름

- RMI 레지스트리 잘 모름
  - 전화번호부랑 비슷하다는데... 클라이언트가 이 레지스트리로부터 프록시를 받아간다고 함..

- 네트워크로 전달하려면 무조건 직렬화해줘야 하나?
  - 많이 쓰이는 타입같은건 알아서 직렬화해주는거 같고, 본인이 만든 타입같은건 네트워크로 보내려면 serializable 형식으로 선언해줘야 하는듯
  