package ch10.fsm.statepattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        SaleMachine saleMachine = new SaleMachine(20);

        while(saleMachine.hasStock()){
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
