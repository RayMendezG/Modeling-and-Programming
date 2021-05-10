public class Pepperoni extends IngredientDecorator {

	protected Baguette baguette; 

	public Pepperoni(Baguette baguette) {
		this.baguette = baguette;
	}

	@Override
	public String getDescription() {
		return baguette.getDescription() + " + pepperoni $" + 0.40;
	}

	@Override
	public double cost() {
		return 0.40 + baguette.cost();
	}
}