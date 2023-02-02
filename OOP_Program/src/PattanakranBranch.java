public class PattanakranBranch extends Product {
	private int payUnit() {
		return super.getUnit() /2;
	}
	private int freeUnit() {
		return super.getUnit() - this.payUnit();
	}
	public int getTotalprice() {
		return this.payUnit() *100;
	}
	@Override
	public String toString() {
		return "You but "+ payUnit()+"units, get free "+freeUnit()+
				" units("+getTotalprice()+")";
	}
	
	
	
	
	
	
}
