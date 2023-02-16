package file;
import java.util.Scanner;
import java.io.*;
public class ATMBanking {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter account number : ");
		String accountnumber = scan.next();
		System.out.print("Enter password : ");
		String password = scan.next();
		System.out.println();
		ATMChecking bank = new ATMChecking(accountnumber,password,money);
		bank.show();
	}

}
