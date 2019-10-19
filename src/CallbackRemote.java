import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CallbackRemote extends UnicastRemoteObject implements Callback {
    CallbackRemote()throws RemoteException {
        super();
    }

    public void action(String command) throws RemoteException {
        if (command.equalsIgnoreCase("time")) {
            SimpleDateFormat dateFormatter = new SimpleDateFormat("E MMM dd HH:mm:ss z yyyy");
            System.out.println("Callback: " + dateFormatter.format(Calendar.getInstance().getTime()));
        } else {
            System.out.println("Callback: " + command.toUpperCase());
        }
    }
}
