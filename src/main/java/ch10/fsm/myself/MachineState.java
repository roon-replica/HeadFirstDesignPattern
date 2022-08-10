package ch10.fsm.myself;

public enum MachineState {
    COIN_EMPTY(0), COIN_INSERTED(1), SALE(2), SOLD_OUT(3);

    private int stateValue;

    MachineState(int stateValue) {
        this.stateValue = stateValue;
    }
}
