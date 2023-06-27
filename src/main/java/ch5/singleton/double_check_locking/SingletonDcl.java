package ch5.singleton.double_check_locking;

public class SingletonDcl {
    // volatile
    // - 멀티스레드 환경에서 visibility, atomicity 보장..?
    // - 변수에 쓰고나면 딴 스레드에도 즉시 보이게 된다고 함
    // - 변수에 쓸 때 읽어야할텐데 이러한 읽고나서 쓰는 연산을 atomic하게 해준다고 함..
    // -- 근데 synchronized 썼는데도 volatile 써야하나?
    // volatile 안써도 싱글톤은 됨. 근데 성능이 좀 안좋아질수도 있겠다. synchronized 블록에 떠 자주 들어가게 될듯
    private volatile static SingletonDcl instance;

    private SingletonDcl() {
    }

    public static SingletonDcl getInstance() { // double checked locking 방법. double check해서 성능 저하 좀 줄이는거 같음. 기능적으로는 double check할 필요는 없는듯
        if (instance == null) {
            synchronized (SingletonDcl.class) {
                if (instance == null) {
                    instance = new SingletonDcl();
                }
            }
        }
        return instance;
    }
}
