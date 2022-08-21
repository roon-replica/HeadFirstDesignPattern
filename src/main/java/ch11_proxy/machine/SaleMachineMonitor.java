package ch11_proxy.machine;

public class SaleMachineMonitor {
    SaleMachine machine;

    public SaleMachineMonitor(SaleMachine machine) {
        this.machine = machine;
    }

    public void report() {
        System.out.println("machine location: " + machine.location);
        System.out.println("machine stock: " + machine.stock);
        System.out.println("machine state: " + machine.nowState);
    }

}
