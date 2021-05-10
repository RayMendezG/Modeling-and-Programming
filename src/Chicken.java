public class Chicken extends IngredientDecorator {

	protected Baguette baguette; 

	public Chicken(Baguette baguette) {
		this.baguette = baguette;
	}

	@Override
	public String getDescription() {
		return baguette.getDescription() + " + chicken $" + 0.50;
	}

	@Override
	public double cost() {
		return 0.50 + baguette.cost();
	}
}