package ch10.fsm.statepattern;

public class WinnerState implements MachineState {
    SaleMachine saleMachine;

    public WinnerState(SaleMachine saleMachine) {
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
        if (saleMachine.stock >= saleMachine.WINNER_BONUS_COUNT) {
            System.out.println("보너스에 당첨되었습니다");
        } else {
            System.out.println("보너스에 당첨은 되었는데, 재고 부족으로 1개만 드립니다.");
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
