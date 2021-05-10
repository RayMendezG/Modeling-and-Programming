public class DoubleCheese extends Pizza {

	protected double cost = 5.89;

	public double cost() {
		return this.cost;
	}

	@Override
	public String getDough() {
		return "Soft gross dough ";
	} 

	@Override
	public String getCheese() {
		return "with cheddar and manchego, ";
	}

	@Override
	public String getMeat() {
		return "whitout any meat";
	}
}