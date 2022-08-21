package ch11_proxy.machine;

public class CoinInsertedState implements MachineState {
    SaleMachine saleMachine;

    public CoinInsertedState(SaleMachine saleMachine) {
        this.saleMachine = saleMachine;
    }

    @Override
    public void insertCoin() {
        printError();
        saleMachine.printNowState();
    }

    @Override
    public void refundCoin() {
        saleMachine.setState(saleMachine.noCoinState);

        System.out.println("refunded");
        saleMachine.printNowState();
    }

    @Override
    public void turnLever() {
        saleMachine.setState(saleMachine.saleState);
        System.out.println("turned lever");
        saleMachine.printNowState();
    }

    @Override
    public void sale() {
        printError();
        saleMachine.printNowState();
    }
}
