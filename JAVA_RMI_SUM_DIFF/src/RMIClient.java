import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class RMIClient {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter First Number: ");
		int a = scanner.nextInt();
		
		System.out.println("Enter Second Number: ");
		int b = scanner.nextInt();
		
		try {
			Rem rem_obj = (Rem)Naming.lookup("localhost://8080/AddSub");
			System.out.println("Sum = " + rem_obj.sumNum(a, b));
			System.out.println("Difference = " + rem_obj.diffNum(a, b));
			System.out.println("Completed RMI Program");
		}
		 catch (RemoteException re) {
				System.out.println(re);
			} catch (MalformedURLException mfe) {
				System.out.println(mfe);
			}catch(NotBoundException nbe) {
				System.out.println(nbe);
			}

	}

}
