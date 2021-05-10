public class Ham extends IngredientDecorator {

	protected Baguette baguette; 

	public Ham(Baguette baguette) {
		this.baguette = baguette;
	}

	@Override
	public String getDescription() {
		return baguette.getDescription() + " + ham $" + 0.35;
	}

	@Override
	public double cost() {
		return 0.35 + baguette.cost();
	}
}