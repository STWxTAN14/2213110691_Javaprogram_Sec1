import java.util.*;
public class Lab401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Full Name : ");
		String inputName = scan.nextLine();
		int space = inputName.indexOf(' ',0);
		if (space == -1) {
			System.out.print("Incorrect Name");
		}
		else {
			String firstname = inputName.substring(0,space);
			String lastname = inputName.substring(space+1);
			System.out.print("First Name : " + firstname.toUpperCase() +
			                "\nLast Name : " + lastname.toLowerCase()   );
		}
	}
}