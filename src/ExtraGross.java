public class ExtraGross extends Pizza {

	protected double cost = 7.09;

	public double cost() {
		return this.cost;
	}

	@Override
	public String getDough() {
		return "Soft dough ";
	} 

	@Override
	public String getCheese() {
		return "with cheddar, ";
	}

	@Override
	public String getMeat() {
		return "chicken and ham";
	}
}