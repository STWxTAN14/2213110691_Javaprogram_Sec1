import java.util.*;
public class ShapeDemo2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		Cylinder[] cylinder = new Cylinder[5];
		
		for (int i= 0; i<cylinder.length; i++) {
			
			System.out.print("Input radius " + (i+1) + " :");
			double radius = scan.nextDouble();
			System.out.print("Input height " + (i+1) + ": ");
			double height  = scan.nextDouble();
			
			cylinder[1] = new Cylinder(radius ,height);
			System.out.println();
		}
		
		int count = 1;
		for (Cylinder cd : cylinder) {
			System.out.println("Cylinder "+ count + ", volume=" +cd.getVolume());
			count ++;
			
		}
	
	}

}
