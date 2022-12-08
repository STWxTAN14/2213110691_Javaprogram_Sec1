import javax.swing.*;
import java.text.*;
import java.util.Random;
public class Lab303 {
	public static void main(String[] args) {
	Random rand = new Random();
	DecimalFormat comma = new DecimalFormat("###,###");
	int balance = rand.nextInt(9) * 100000;
	int money =Integer.parseInt(JOptionPane.showInputDialog("You balance : "+comma.format(balance)+
			"\nInputmoney to withdraw:"));
	int C = money/1000;
	int B = money%1000/500;
	int A = money%1000%500/100;	
	if (money>balance) {
		JOptionPane.showMessageDialog(null, "Error:Cannot withdraw more than balance ","ERROR",
				 JOptionPane.ERROR_MESSAGE);
		
	}
	else if (money>balance) {
		JOptionPane.showMessageDialog(null,
				"Error: Cannot withdraw more than " + 
		comma.format(balance) , "ERROR",JOptionPane.ERROR_MESSAGE);
	}
	else if (money%100!=0) {
		int DD = money%100;
		JOptionPane.showMessageDialog(null,
				"Error: Cannot withdraw more than "+DD+"bath","Error"
		,JOptionPane.ERROR_MESSAGE);
	}
	else {
		JOptionPane.showMessageDialog(null,"You withdraw"+comma.format(money)+"baht."+"\n1000 = "+C+"\n500 ="+B+"\n100 = "+A);
	}

	}

}
