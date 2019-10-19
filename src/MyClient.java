import java.rmi.*;
import java.io.*;
import java.util.Scanner;

public class MyClient{

	public static void main(String args[]){
		try{
			Scanner scanner = new Scanner(System.in);
			Method stub=(Method)Naming.lookup("rmi://35.39.165.63:5000/lab6");
			String command;
			String result;

			Callback callback = new CallbackRemote();

			while (true) {
				System.out.println("Please enter a command: ");
				command = scanner.nextLine();
				result = stub.action(command, callback);
				if (result.equals("closing connection")) {
					break;
				} else {
					System.out.println(result);
				}
			}
			scanner.close();
		}catch(Exception e){System.out.println(e);}
	}
}
