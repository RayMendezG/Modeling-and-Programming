public class Special extends Pizza {

	protected double cost = 8.49;

	public double cost() {
		return this.cost;
	}

	@Override
	public String getDough() {
		return "Crunchy dough ";
	} 

	@Override
	public String getCheese() {
		return "with manchego cheese, cheddar, ";
	}

	@Override
	public String getMeat() {
		return "chicken, and sausage";
	}
}