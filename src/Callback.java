import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Callback extends Remote {
    public void action(String command) throws RemoteException;
}
