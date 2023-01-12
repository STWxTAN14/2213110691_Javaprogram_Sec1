import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestGui extends JFrame {
	private static final int WIDTH = 900;
	private static final int HIGHT = 700;
	private JLabel lblleng,lblwidth,lblarea,lblperimeter;
	
	//Constructor
	public TestGui () {
		setTitle("Area and Perimeter ");
		setSize(WIDTH,HIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		lblleng = new JLabel("Enter the  length :");
		lblwidth = new JLabel("Enter the width  :");
		lblarea = new JLabel("area   :");
		lblperimeter = new JLabel("perimeter:");
		//GridLayout
		GridLayout L = new GridLayout(4,1);
		setLayout(L);
		//add Components
		add(lblleng);
		add(lblleng);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestGui prog = new TestGui();

	}

}
