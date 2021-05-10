public abstract class Baguette {

	protected String ingredientsList = "1.Chicken $0.50\n2.Ham $0.35\n3.Pepperoni 0.40\n4.Tomato $0.12\n5.Lettuce $0.10\n6.Onion $0.10\n7.Ketchup 0.05\n8.Mayo $0.05\n9.Mustard $0.05\n0.Finish order.";


	protected String description = "";

	public String getDescription() {
		return description;
	}

	public abstract double cost();

	public String ingredients() {
		return ingredientsList;
	}
}