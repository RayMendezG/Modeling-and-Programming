public class Onion extends IngredientDecorator {

	protected Baguette baguette; 

	public Onion(Baguette baguette) {
		this.baguette = baguette;
	}

	@Override
	public String getDescription() {
		return baguette.getDescription() + " + onion $" + 0.10;
	}

	@Override
	public double cost() {
		return 0.10 + baguette.cost();
	}
}