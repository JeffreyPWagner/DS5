import java.rmi.*;
import java.rmi.server.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MethodRemote extends UnicastRemoteObject implements Method{

	MethodRemote()throws RemoteException{
		super();
	}

	public String action(String command, Callback callback) throws RemoteException{
		if (command.equalsIgnoreCase("time")) {
			SimpleDateFormat dateFormatter = new SimpleDateFormat("E MMM dd HH:mm:ss z yyyy");
			callback.action(command);
			return dateFormatter.format(Calendar.getInstance().getTime());
		} else if (command.equals("")) {
			return "closing connection";
		} else {
			callback.action(command);
			return command.toUpperCase();
		}


	}
}
