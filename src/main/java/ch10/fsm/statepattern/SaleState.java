package ch10.fsm.statepattern;

public class SaleState implements MachineState {
    SaleMachine saleMachine;

    public SaleState(SaleMachine saleMachine) {
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
        saleMachine.count++;

        if (saleMachine.count % saleMachine.BONUS_CYCLE_COUNT == 0) {
            saleMachine.setState(saleMachine.winnerState);
            saleMachine.sale();
            return;
        }

        saleMachine.decreaseStock();

        if (saleMachine.hasStock()) {
            saleMachine.setState(saleMachine.noCoinState);
        } else {
            saleMachine.setState(saleMachine.soldOutState);
        }

        saleMachine.printNowState();
    }
}
