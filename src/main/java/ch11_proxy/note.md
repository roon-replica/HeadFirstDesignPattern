- ch11 변경 요구사항
  - ch10에서 작성한 뽑기 기계를 원격으로 모니터링하고 싶다


### 원격 프록시
- 원격 프록시는 원격 객체의 로컬 대변자 역할을 한다고 함.
  - 원격 객체: 다른 JVM의 heap에 있는 객체
  - 로컬 대변자: 로컬 대변자의 어떤 메서드를 호출하면 원격 객체에게 그 메서드 호출을 전달해 주는 객체?

- 자바의 원격 메서드 호출 = RMI (Remote Method Invocation)
  - RMI를 사용하면 다른 JVM에 있는 객체를 찾아서 그 메서드를 호출할 수 있다고 함..
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

