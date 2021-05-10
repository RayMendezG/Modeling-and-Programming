public class JustMeat extends Pizza {

	protected double cost = 6.39;

	public double cost() {
		return this.cost;
	}

	@Override
	public String getDough() {
		return "Soft gross dough ";
	} 

	@Override
	public String getCheese() {
		return "without cheese ";
	}

	@Override
	public String getMeat() {
		return "and with our three kinds of meat, sausage, ham and chicken";
	}
}