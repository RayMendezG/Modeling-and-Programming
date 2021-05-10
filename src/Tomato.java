public class Tomato extends IngredientDecorator {

	protected Baguette baguette; 

	public Tomato(Baguette baguette) {
		this.baguette = baguette;
	}

	@Override
	public String getDescription() {
		return baguette.getDescription() + " + tomato $" + 0.12;
	}

	@Override
	public double cost() {
		return 0.12 + baguette.cost();
	}
}