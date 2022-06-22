package ch10.fsm.myself;

import static ch10.fsm.myself.MachineState.COIN_EMPTY;
import static ch10.fsm.myself.MachineState.COIN_INSERTED;
import static ch10.fsm.myself.MachineState.SALE;
import static ch10.fsm.myself.MachineState.SOLD_OUT;

public class SaleMachine {
    private final int PRICE = 1000;

    private MachineState nowState;
    private int stock;
    private int count;

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
        count++;

        if (count % 10 == 0) {
            if (stock == 0) {
                System.out.printf("보너스 알맹이에 당첨되긴 했는데 재고가 소진되었습니다.\n");
            } else {
                System.out.printf("보너스 알맹이에 당첨되었습니다.\n");
                stock -= 1;
            }
        }

        if (stock == 0) {
            nowState = SOLD_OUT;
        } else {
            nowState = COIN_EMPTY;
        }

        System.out.printf("product saled. now stock = %d, now state = %s", stock, nowState.name());
    }

    public boolean isSoldOut() {
        return stock == 0;
    }
}
