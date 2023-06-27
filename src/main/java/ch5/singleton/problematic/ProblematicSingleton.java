package ch5.singleton.problematic;

// 고전적인 싱글톤 객체 생성 방식. 문제 많다고 함. 아마 동시성 이슈
public class ProblematicSingleton {
    private static ProblematicSingleton INSTANCE;

    private ProblematicSingleton() {
    }

    public static ProblematicSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ProblematicSingleton();
        }
        return INSTANCE;
    }
}
