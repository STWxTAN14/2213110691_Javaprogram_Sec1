
public class Cylinder extends Circle{
	public double height;
	
	public Cylinder(double radius,double height) {
		super(radius, null);
		this.height = height;
		
		
	}
	public double getHeight() {
		return this.height;
	}
	public double getVolume() {
		return super.getArea()*this.height; 
	}
	public double getArea() {
		return 2*Math.PI*(height+getRadius());
	}
	public String tostring() {
		return "cy = "+getHeight()+","+super.toString();
	}
}
