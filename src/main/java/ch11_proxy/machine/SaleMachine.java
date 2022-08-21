package ch11_proxy.machine;

public class SaleMachine {
    MachineState noCoinState;
    MachineState coinInsertedState;
    MachineState saleState;
    MachineState soldOutState;

    MachineState winnerState;

    MachineState nowState;
    int saleCount;
    int stock;

    String location;

    int WINNER_BONUS_COUNT = 2;
    int BONUS_CYCLE_COUNT = 1;

    public SaleMachine(int stock) {
        noCoinState = new NoCoinState(this);
        coinInsertedState = new CoinInsertedState(this);
        saleState = new SaleState(this);
        soldOutState = new SoldOutState(this);
        winnerState = new WinnerState(this);

        this.stock = stock;

        if (stock > 0) nowState = noCoinState;
        else nowState = soldOutState;
    }

    public SaleMachine(String location, int stock){
        this.location = location;

        noCoinState = new NoCoinState(this);
        coinInsertedState = new CoinInsertedState(this);
        saleState = new SaleState(this);
        soldOutState = new SoldOutState(this);
        winnerState = new WinnerState(this);

        this.stock = stock;

        if (stock > 0) nowState = noCoinState;
        else nowState = soldOutState;
    }

    public void setState(MachineState machineState) {
        nowState = machineState;
    }

    public void insertCoin() {
        nowState.insertCoin();
    }

    public void refund() {
        nowState.refundCoin();
    }

    public void lever() {
        nowState.turnLever();
    }

    public void sale() {
        nowState.sale();
    }

    public boolean hasStock() {
        return stock != 0;
    }

    public void printNowState() {
        System.out.println("now state = " + nowState);
    }

    public void decreaseStock(){
        if(stock <= 0){
            System.out.println("something wrong...... stock not exist");
            return;
        }

        if(nowState instanceof WinnerState){
            stock = Math.max(stock - WINNER_BONUS_COUNT, 0);
        }else if(nowState instanceof SaleState){
            stock = Math.max(stock - 1 , 0);
        }else{
            //never
        }
    }
}
