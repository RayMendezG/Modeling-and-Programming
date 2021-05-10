public class PizzaAdapter extends Baguette {

	protected Pizza pizza;

	public PizzaAdapter(Pizza pizza) {
		this.pizza = pizza;
	}

	public String getDescription() {
		return pizza.getDough() + pizza.getCheese() + pizza.getMeat();
	}

	public double cost() {
		return pizza.cost();
	}
}