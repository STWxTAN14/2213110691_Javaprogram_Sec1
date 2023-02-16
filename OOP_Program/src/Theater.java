
public class Theater extends Movie{
	private int theaterNo;
	
	public Theater(String id , String name, Director director ,int theatorNo ) {
		super(id,name,director);
		this.theaterNo = theatorNo;
	}
	public Theater() {
		super();
		this.theaterNo = 0;
	}
	public String getTheaterName() {
		if(theaterNo >=1 && theaterNo<=11) {
			return "Basic Theator";
		}
		else if (theaterNo<=14) {
			return "Sweet Theater";
		}
		else if (theaterNo==15) {
			return "Premiun Theator";
		}
		else {
			return null;
		}
	}
	public String tostring() {
		return getTheaterName()+":"+super.toString();
	}
	

}
