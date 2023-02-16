import java.util.*;
import javax.swing.*;
public class ShapeDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		Cylinder[] cylinder = new Cylinder[5];
			for (int i = 0; i<cylinder.length; i++) {
				
				@SuppressWarnings("unused")
				double radius = Double.parseDouble(JOptionPane.showInputDialog("Input radius " + (i+1) + ":"));
				@SuppressWarnings("unused")
				double height = Double.parseDouble(JOptionPane.showInputDialog("Input radius " + (i+1) + ":"));
				cylinder[i] = new Cylinder(radius, height);
			}
			int count = 1;
			String text = "";
			
			for (Cylinder cd : cylinder) {
				text = text + "Cylinder " + count+",volume="+cd.getVolume()+"\n";
				count++;
			}
			JOptionPane.showMessageDialog(null, text);
	}

}
