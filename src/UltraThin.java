public class UltraThin extends Pizza {

	protected double cost = 7.09;

	public double cost() {
		return this.cost;
	}

	@Override
	public String getDough() {
		return "Crunchy dough ";
	} 

	@Override
	public String getCheese() {
		return "with manchego cheese ";
	}

	@Override
	public String getMeat() {
		return "and chicken";
	}
}