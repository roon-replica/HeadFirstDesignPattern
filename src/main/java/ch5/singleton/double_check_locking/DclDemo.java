package ch5.singleton.double_check_locking;

import java.util.HashSet;
import java.util.Set;

public class DclDemo {
    private static final Set<Integer> instanceIdSet = new HashSet<>();

    public static void main(String[] args) {
        for (int i = 0; i < 5555; i++) {
            new Multithread().start();
        }
    }

    static class Multithread extends Thread {
        @Override
        public void run() {
            try {
                var instanceHashcode = SingletonDcl.getInstance().hashCode();
                instanceIdSet.add(instanceHashcode);

                if (instanceIdSet.size() >= 2) {
                    throw new Exception("never happen! because of double checked locking.");
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("set size:" + instanceIdSet.size());
            }
        }
    }
}
