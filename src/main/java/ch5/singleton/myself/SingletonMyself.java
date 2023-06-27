package ch5.singleton.myself;

public class SingletonMyself {
    private static final SingletonMyself SingletonMyself = new SingletonMyself();

    private SingletonMyself() {
    }

    private SingletonMyself(String data){ // 근데.. 파라미터가 있는 객체는 어케 만들지?
    }

    public static SingletonMyself getInstance() {
        return SingletonMyself;
    }
}
