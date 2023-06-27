package ch5.singleton.lazy_initialization_holder;

public class SingletonUsingLazyHolder {
    private SingletonUsingLazyHolder() {
    }

    // Bill Pugh란 사람이 만든 방식임 (findbug co-author)
    // 간단히 말하면 Java spec에 따라 nested static class의 초기화는 thread-safe해서 이렇게 할 수 있는거임
    // 클래스 로더같은거 잘 안봐서 잘 모름.. 자세히 알아봐야함
    private static class LazyHolder {
        static final SingletonUsingLazyHolder INSTANCE = new SingletonUsingLazyHolder();
    }

    public static SingletonUsingLazyHolder getInstance() {
        return LazyHolder.INSTANCE;
    }
}
