package ch10.fsm.myself;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SaleMachineMain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        SaleMachine saleMachine = new SaleMachine(MachineState.COIN_EMPTY, 20);
        while (saleMachine.isSoldOut() == false) {
            String command = br.readLine();

            if (command.equals("insert")) {
                saleMachine.insertCoin();
            } else if (command.equals("lever")) {
                saleMachine.lever();
            } else if (command.equals("sale")) {
                saleMachine.sale();
            } else if (command.equals("refund")) {
                saleMachine.refund();
            } else {
                System.out.println("valid commands list are below. type one of them");
                System.out.println("> insert, lever, sale, refund");
            }
        }
    }
}
