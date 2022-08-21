package ch11_proxy.machine;

public interface MachineState {
    void insertCoin();
    void refundCoin();
    void turnLever();
    void sale();

    default void printError(){
        System.out.println("잘못된 요청");
    }
}
