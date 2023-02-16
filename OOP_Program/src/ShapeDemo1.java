import java.util.*;
public class ShapeDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings({ "resource", "unused" })
		Scanner scan = new Scanner(System.in);
		System.out.print("Input radius : ");
		double radius = scan.nextDouble();
		System.out.print("Input height : ");
		double height = scan.nextDouble();
		
		Circle circle1 = new Circle(radius ,null);
		Cylinder cylinder1 = new Cylinder(height,(Double) null);
		System.out.println("Circle ["+circle1.toString()+"]");
		System.out.println("Circle [area = "+circle1.getArea()+"]");
		System.out.println();
		System.out.println("Cylinder ["+cylinder1.toString()+"]");
		System.out.println("Cylinder [area = "+cylinder1.getArea()+"]");
		System.out.println("Cylinder [volume = "+cylinder1.getVolume()+"]");
		
	}

}
