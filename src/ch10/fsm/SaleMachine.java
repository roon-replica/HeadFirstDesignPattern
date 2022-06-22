package ch10.fsm;

import static ch10.fsm.MachineState.COIN_EMPTY;
import static ch10.fsm.MachineState.COIN_INSERTED;
import static ch10.fsm.MachineState.SALE;
import static ch10.fsm.MachineState.SOLD_OUT;

public class SaleMachine {
    private final int PRICE = 1000;

    private MachineState nowState;
    private int stock;

    public SaleMachine(MachineState initState, int stock) {
        nowState = initState;
        this.stock = stock;
    }

    public void insertCoin() {
        if (nowState != COIN_EMPTY) {
            System.out.println("invalid command.");
            return;
        }

        nowState = COIN_INSERTED;
        System.out.println("coin inserted. now state = " + nowState);
    }

    public int refund() {
        if (nowState != COIN_INSERTED) {
            System.out.println("invalid command");
            return 0;
        }

        nowState = COIN_EMPTY;
        System.out.println("refunded. now state = " + nowState);
        return PRICE;
    }

    public void lever() {
        if (nowState != COIN_INSERTED) {
            System.out.println("invalid command");
            return;
        }

        nowState = SALE;
        System.out.println("turned lever. now state= " + nowState);
    }

    public void sale() {
        if (nowState != SALE) {
            System.out.println("invalid command");
            return;
        }

        stock -= 1;
        System.out.printf("product saled. now stock = %d", stock);

        if (stock == 1) {
            nowState = SOLD_OUT;
        } else {
            nowState = COIN_EMPTY;
        }
        System.out.println("now state = " + nowState);
    }

    public boolean isSoldOut() {
        return stock == 0;
    }
}
