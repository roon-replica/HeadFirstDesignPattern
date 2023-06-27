package ch5.singleton.problematic;

import java.util.HashSet;
import java.util.Set;

public class ProblematicSingletonDemo {
    private static final Set<Integer> instanceIdSet = new HashSet<>();

    public static void main(String[] args) {

        // 여러번 실행하면 가끔 인스턴스 2개 생성됨ㅋ
        for (int i = 0; i < 30; i++) {
            new Multithread().start();
        }
    }

    static class Multithread extends Thread {
        @Override
        public void run() {
            try {
                var instanceHashcode = ProblematicSingleton.getInstance().hashCode();
                System.out.printf("thread_id: %d, instance_hashcode=%s \n", Thread.currentThread().getId(), instanceHashcode);
                instanceIdSet.add(instanceHashcode);

                if (instanceIdSet.size() >= 2) {
                    throw new Exception("no singleton!!!, set size=" + instanceIdSet.size());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
