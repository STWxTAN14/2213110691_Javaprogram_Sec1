package javaweek2;
import java.util.*;
import java.text.*;
import javax.swing.JOptionPane;
public class Javaweek2 {
	static final double TAX_RATE=.0625;
	public static void main(String[] args) {				 
	String cdld = JOptionPane.showInputDialog("This progream calsulates the total cost of a CD order "
			+ "\nPlease enter the ID of the CD");
	String cdTitle = JOptionPane.showInputDialog("Please enter the title of the CD ");
	String cdQuantitystr = JOptionPane.showInputDialog("Please enter the price of the CD in U.S. dollars ");
	int cdQuantity = Integer.parseInt(cdQuantitystr);
	double cdPrice = Double.parseDouble(cdQuantitystr);
	double cdSubtotal = cdPrice*cdQuantity;
	double cdTotal = cdSubtotal * (1+TAX_RATE);
	
	JOptionPane.showInputDialog(null,"Summary of the transaction :  "
			+ "\nCD ID:"+cdld+
			"\nCD Title: "+cdTitle+"\nCD Unit Price:"+cdQuantitystr+"\nCD Quantity:"+cdQuantity+
			"\n"+
			"\nSubtotal:"+cdSubtotal+
			"\nTax rate :"+TAX_RATE*100 +
			"\nTotal:"+cdTotal+
			"\n"+
			"\nEnd of Program");			
			
	
	
	
	}

}
