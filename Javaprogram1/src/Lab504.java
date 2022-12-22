import java.util.Scanner;
import javax.swing.*;
public class Lab504 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your name, seperated by a space. \n:");
		String fullname = scan.nextLine();
		//int  spacefullname = fullname.indexOf(' ',0);
		//String firstname = fullname.substring(0,spacefullname);
		System.out.print(abbreviatName(fullname));	
		//abbreviatName(fullname);
	}
	public static String abbreviatName (String fullName) {
		//for (int i = 0; i< fullname.length(); i++) {
			//if (fullname.charAt(i)==' ')R {
				String[] split = fullName.split(" ");
				return split[1].substring(0,1).toUpperCase()+"."
						+split[2].substring(0,1).toUpperCase()+"."+
						split[0].substring(0,1).toUpperCase()+split[0].substring(1);
				
			}		
}
