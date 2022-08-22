package ch11_proxy.rmi.client;

import ch11_proxy.rmi.server.MyRemote;
import ch11_proxy.rmi_example.Hello;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry(2003);
            MyRemote stub = (MyRemote) registry.lookup("MyRemote");

            String response = stub.sayHello();
            System.out.println("response: " + response);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
