package ch11_proxy.machine;

public class NoCoinState implements MachineState {
    SaleMachine saleMachine;

    public NoCoinState(SaleMachine saleMachine){
        this.saleMachine = saleMachine;
    }

    @Override
    public void insertCoin() {
        saleMachine.setState(saleMachine.coinInsertedState);

        System.out.println("coin inserted ");
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
