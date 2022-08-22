package ch11_proxy.rmi_example;

import java.rmi.Remote;
import java.rmi.RemoteException;

// for the remote interface
public interface Hello extends Remote {
    String sayHello() throws RemoteException;
}
