import javax.swing.*;


public class Lab502 {
	static String email;
	public static void main(String[] args) {
		inputEmail();//call inputEmail method ,method is not return value
	}
	
	public static void inputEmail() {
		String ans = "";
		do {
	
	email = JOptionPane.showInputDialog("Input your email :");
	checkEmailError(email);
	ans = JOptionPane.showInputDialog("Continue[y||Y to continue] : ");
		}while (ans.equalsIgnoreCase("y"));
	}
	public static void checkEmailError(String chkemail) {
		while (email.startsWith("@") || chkemail.contains(" ")) {
			chkemail = JOptionPane.showInputDialog("Input your e-mail,again:");
		
	}
		chkemail = chkemail.toLowerCase();
		boolean checkEmail = chkemail.endsWith("@gmail.com") || chkemail.endsWith("@hotmail.com");
		JOptionPane.showMessageDialog(null,
				(checkEmail) ? "Your e-mail is " + chkemail : "Your e-mail is not hotmail or gmail dot com");
	}
}
