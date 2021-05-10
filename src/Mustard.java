public class Mustard extends IngredientDecorator {

	protected Baguette baguette; 

	public Mustard(Baguette baguette) {
		this.baguette = baguette;
	}

	@Override
	public String getDescription() {
		return baguette.getDescription() + " + mustard $" + 0.05;
	}

	@Override
	public double cost() {
		return 0.05 + baguette.cost();
	}
}