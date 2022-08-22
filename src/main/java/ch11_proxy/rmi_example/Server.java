package ch11_proxy.rmi_example;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

// implements the remote interface Hello
public class Server implements Hello {
    @Override
    public String sayHello(){
        return "hello world";
    }

    public static void main(String[] args) {
        try {
            // Create and export a remote object
            var server = new Server();
            var stub = (Hello) UnicastRemoteObject.exportObject(server, 0);

            // Register the remote object with a Java RMI registry
            // caller가 원격 객체에 대한 메서드 호출을 하려면, 우선 그 원격 객체의 stub을 얻어야 함
            // 원격객체가 서버에 등록되면, callers can look up the object by name. 그 원격객체의 레퍼런스를 얻어서 이용 가능해짐
            //Registry registry = LocateRegistry.getRegistry(2001);
            Registry registry = LocateRegistry.createRegistry(2003);
            registry.bind("Hello", stub);

            System.err.println("server ready");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
