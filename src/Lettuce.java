public class Lettuce extends IngredientDecorator {

	protected Baguette baguette; 

	public Lettuce(Baguette baguette) {
		this.baguette = baguette;
	}

	@Override
	public String getDescription() {
		return baguette.getDescription() + " + lettuce $" + 0.10;
	}

	@Override
	public double cost() {
		return 0.10 + baguette.cost();
	}
}