import java.rmi.*;
import java.rmi.server.*;

public interface Method extends Remote{

	public String action(String command, Callback callback)throws RemoteException;
}
