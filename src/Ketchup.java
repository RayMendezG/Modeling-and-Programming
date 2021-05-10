public class Ketchup extends IngredientDecorator {

	protected Baguette baguette; 

	public Ketchup(Baguette baguette) {
		this.baguette = baguette;
	}

	@Override
	public String getDescription() {
		return baguette.getDescription() + " + ketchup $" + 0.05;
	}

	@Override
	public double cost() {
		return 0.05 + baguette.cost();
	}
}