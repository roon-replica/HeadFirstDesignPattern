package ch11_proxy.rmi.server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    private static final long serialVersionUID = 1L;

    public MyRemoteImpl() throws RemoteException {
    }

    @Override
    public String sayHello() throws RemoteException {
        return "server says, 'hey'";
    }

    public static void main(String[] args) throws RemoteException, MalformedURLException {
        MyRemote service = new MyRemoteImpl();
        Naming.rebind("RemoteHello", service);

    }
}
