package file;
import java.util.*;
import java.io.*;
public class EmployeeInfo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		String choice;
		System.out.print("Insert pr Read data(from File)? : ");
		choice = console.next().toLowerCase();
		while(!choice.equals("insert")&& !choice.equals("read")) {
			System.out.print("Please text insert or read data? : ");
			choice = console.next().toLowerCase();
		}
		SaveandOpen file = new SaveandOpen(); //call SaveandOpen() class
		if(choice.equals("insert")) {
			file.insert();
		}
		else {
			System.out.print("\nEnter department: ");
			choice = console.next();
			file.setDept(choice); //call setDept() method from Employee() class
			file.read(); //call read() method from SaveandOpen() class
		}
	}

}
