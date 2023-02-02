import javax.swing.*;
public class Shop100Baht {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product sold = new Product();
		
		sold.setUnit(
				Integer.parseInt(JOptionPane.showInputDialog("Input the number of product :")));
		
		JOptionPane.showMessageDialog(null,sold);
		
		
		
		
	}

}
