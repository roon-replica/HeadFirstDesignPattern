### 개요
- 데코레이터 패턴이 객체를 래퍼로 감쌌다면  
  어댑터 패턴은 실제와는 다른 인터페이스를 가진 것처럼 보이도록 객체를 감싼다?

- 객체지향에서 어댑터도 `전원 어댑터처럼` 한 인터페이스를 다른 인터페이스로 변환해주는 역할이라고 함

### 어댑터
- 기존 코드와 인터페이스가 맞지 않는 새로운 라이브러리가 있을 때..?  
  근데 기존 코드는 바꾸지 못하는 상황을 가정

- 어댑터는 `타켓 인터페이스`(Duck)를 구현하며 `adaptee`(Pigeon) 인스턴스를 가지고 있다!  
  이렇게 해서 Pigeon을 Duck처럼 쓸 수 있다! (=Duck 인터페이스로 turkey를 쓸 수 있다!)

- 어댑터 패턴은 특정 인터페이스를 클라이언트에서 요구하는 다른 인터페이스로 `변환`!  
  ~처럼 보이게 할 수 있다!


### 질문들
- 클라이언트측 코드를 새로운 인터페이스에 맞춰서 고치기 vs 모든 변경을 캡슐화할 클래스 하나 제공하기

- 어댑터 패턴 vs 퍼사드 패턴?  
  2개 이상의 어댑티를 감싸야 하는 상황?

- 두 인터페이스를 모두 지원하는 다중 어댑터?