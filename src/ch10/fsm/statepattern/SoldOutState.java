package ch10.fsm.statepattern;

public class SoldOutState implements MachineState {
    SaleMachine saleMachine;

    public SoldOutState(SaleMachine saleMachine){
        this.saleMachine = saleMachine;
    }

    @Override
    public void insertCoin() {
        printError();
        saleMachine.printNowState();
    }

    @Override
    public void refundCoin() {
        printError();
        saleMachine.printNowState();
    }

    @Override
    public void turnLever() {
        printError();
        saleMachine.printNowState();
    }

    @Override
    public void sale() {
        printError();
        saleMachine.printNowState();
    }
}
