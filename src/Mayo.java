public class Mayo extends IngredientDecorator {

	protected Baguette baguette; 

	public Mayo(Baguette baguette) {
		this.baguette = baguette;
	}

	@Override
	public String getDescription() {
		return baguette.getDescription() + " + mayo $" + 0.05;
	}

	@Override
	public double cost() {
		return 0.05 + baguette.cost();
	}
}