package ch10.fsm.statepattern;

public interface MachineState {
    void insertCoin();
    void refundCoin();
    void turnLever();
    void sale();

    default void printError(){
        System.out.println("잘못된 요청");
    }
}
