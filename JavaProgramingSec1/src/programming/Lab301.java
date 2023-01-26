package programming;


import javax.swing.*;
import java.text.*;

public class Lab301 {
static final int pricePerson = 299;
	public static void main(String[] args) {
		int numberofcustomer = Integer.parseInt(
				JOptionPane.showInputDialog("How many customer per bill"));
		
		double totalPrice = pricePerson * numberofcustomer;
		int memberCard;
		do {
		     memberCard = JOptionPane.showConfirmDialog(null,
				"Total Price is "+totalPrice+"Baht."+
				"\nDo you have a member card?");
		} while (memberCard==2);
		double totalPricewithDiscount;
		if (memberCard==0) {
			totalPricewithDiscount = totalPrice*90/100;//totalPrice+(totalPrice*10/100)
			JOptionPane.showConfirmDialog(null, "Amount to be paid is "
					+ totalPricewithDiscount+" baht.");
		}
		else if (memberCard==1) {
			JOptionPane.showConfirmDialog(null,"Amount to be paid is "
					+ totalPrice+" baht ");
		}
		
	}

}
