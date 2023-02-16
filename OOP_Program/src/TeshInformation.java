import javax.swing.JOptionPane;

public class TeshInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			// TODO Auto-generated method stub
			String name  = JOptionPane.showInputDialog("Input autor name : ");
			String email = JOptionPane.showInputDialog("Input autor email : ");
			String title = JOptionPane.showInputDialog("Input book title : ");
			int check  = JOptionPane.showConfirmDialog(null,"Do you confilm your e-mail? ");
			if(check == 0) {
			}
			JOptionPane.showMessageDialog(null,"Book title "+title+
					"\nAuthor name : "+name+"\nAuthor e-mail : " +email); 
		}

	

}
