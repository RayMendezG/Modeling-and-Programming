import java.util.Scanner;

/**
 * Class that tests the correct operation of our implmentation using 
 * Decorator and Adapter by doing a simuation of a restaurant menu.
 * @author Méndez García Raymundo
 * @author Palacios Crispín Samuel  
 */
public class TestClass {

	private static Pizza pizza;
	private static Baguette baguette;

	/**
	 * Creats a special pizza by using an adapter, then prints its 
	 * description and its cost. 
	 */
	private void asignSpecial() {
		pizza = new Special();
		Baguette pz = new PizzaAdapter(pizza);
		System.out.println(pz.getDescription() + ". Total: $" + pz.cost());
	}

	/**
	 * Creats a double cheese pizza by using an adapter, then prints its 
	 * description and its cost. 
	 */
	private void asignDoubleCheese() {
		pizza = new DoubleCheese();
		Baguette pz = new PizzaAdapter(pizza);
		System.out.println(pz.getDescription() + ". Total: $" + pz.cost());
	}

	/**
	 * Creats a just meat pizza by using an adapter, then prints its 
	 * description and its cost. 
	 */
	private void asignJustMeat() {
		pizza = new JustMeat();
		Baguette pz = new PizzaAdapter(pizza);
		System.out.println(pz.getDescription() + ". Total: $" + pz.cost());	}

	/**
	 * Creats an ultra thin pizza by using an adapter, then prints its 
	 * description and its cost. 
	 */
	private void asignUltraThin() {
		pizza = new UltraThin();
		Baguette pz = new PizzaAdapter(pizza);
		System.out.println(pz.getDescription() + ". Total: $" + pz.cost());
	}

	/**
	 * Creats an extra gross pizza by using an adapter, then prints its 
	 * description and its cost. 
	 */
	private void asignExtraGross() {
		pizza = new ExtraGross();
		Baguette pz = new PizzaAdapter(pizza);
		System.out.println(pz.getDescription() + ". Total: $" + pz.cost());
	}

	/**
	 * Creats a regular bread sandwich, then asked the user for
	 * the ingredients to add. 
	 */
	private void asignRegularSandwich() {
		baguette = new RegularSandwich();
		System.out.println("\nYou have selected regular bread.\n" +
			"Now, choose the ingredientes you want:\n" +
			baguette.ingredients());
	}

	/**
	 * Creats a garlic bread sandwich, then asked the user for
	 * the ingredients to add. 
	 */
	private void asignGarlicSandwich() {
		baguette = new GarlicSandwich();
		System.out.println("\nYou have selected garlic bread.\n" +
			"Now, choose the ingredientes you want:\n" +
			baguette.ingredients());
	}

	/**
	 * Creats a wholemeal bread sandwich, then asked the user for
	 * the ingredients to add. 
	 */
	private void asignWholemealSandwich() {
		baguette = new WholemealSandwich();
		System.out.println("\nYou have selected wholemeal bread.\n" +
			"Now, choose the ingredientes you want:\n" +
			baguette.ingredients());
	}

	/**
	 * By the aid of the switch case structure, we deployed in console the menu 
	 * of a resturant.
	 * If the user chooses one of the three baguettes, it will be use another switch case
	 * structure to deplpoy another menu, which will show the ingredients that the 
	 * final user will be able to choose.  
	 */
	public static void main(String[] args) {

		/** Variable that will have the final price of a baguette order.*/
		double finalPrice = 0.00;

		/** Variable created with the purpose of using the methods in TestClass.*/
		TestClass testClass = new TestClass();

		/** Will save the option given by the user, wether is baguette or pizza.*/
		Scanner sc = new Scanner(System.in);
		/** The option before mentionaded but in int.*/
		int option;

		/** Will save the option given by the final user to select an ingredient.*/
		Scanner scIngredient = new Scanner(System.in);
		/** The option before mentionated, but in int.*/
		int optionIngredient;

		do {

			System.out.println("\n---------------------------------------\n" +
				"Welcome, what would you like to order?\n" +
				"1.Baguette with regular bread.\n" +
				"2.Baguette with garlic bread.\n" +
				"3.Baguette with wholemeal bread.\n" +
				"4.Double Cheese pizza.\n" +
				"5.Just Meat pizza.\n" +
				"6.Ultra Thin pizza.\n" +
				"7.Extra Gross pizza.\n" +
				"8.Special pizza.\n" +
				"0.Leave store.");
			
			String userOption = sc.nextLine();
			option = Integer.parseInt(userOption);

			switch (option) {
				case 1:
					finalPrice = 1.00;
					testClass.asignRegularSandwich();
					do { 
						String ingredientOption = scIngredient.nextLine();
						optionIngredient = Integer.parseInt(ingredientOption);

						switch (optionIngredient) {
							case 1:
								baguette = new Chicken(baguette);
								finalPrice += 0.50;
								System.out.println("\nYou have added chicken. + 0.50");
								break;

							case 2:
								baguette = new Ham(baguette);
								finalPrice += 0.35;
								System.out.println("\nYou have added ham. + 0.35");
								break;

							case 3:
								baguette = new Pepperoni(baguette);
								finalPrice += 0.40;
								System.out.println("\nYou have added pepperoni. + 0.40");
								break;

							case 4:
								baguette = new Tomato(baguette);
								finalPrice += 0.12;
								System.out.println("\nYou have added tomato. + 0.12");
								break;

							case 5:
								baguette = new Lettuce(baguette);
								finalPrice += 0.10;
								System.out.println("\nYou have added lettuce. + 0.10");
								break;

							case 6:
								baguette = new Onion(baguette);
								finalPrice += 0.10;
								System.out.println("\nYou have added onion. + 0.10");
								break;

							case 7:
								baguette = new Ketchup(baguette);
								finalPrice += 0.05;
								System.out.println("\nYou have added ketchup. + 0.05");
								break;

							case 8:
								baguette = new Mayo(baguette);
								finalPrice += 0.05;
								System.out.println("\nYou have added mayonnaise. + 0.05");
								break;

							case 9:
								baguette = new Mustard(baguette);
								finalPrice += 0.05;
								System.out.println("\nYou have added mustard. + 0.05");
								break;

							default:
								System.out.println("Please choose a valid option.");
								break;							
						}

					} while (optionIngredient != 0);
					System.out.println("\nThis is your order: " + baguette.getDescription() + "\n" +
						"The total amount to pay is: " + finalPrice);
					break;

				case 2:
					finalPrice = 1.10;
					testClass.asignGarlicSandwich();
					do { 
						String ingredientOption = scIngredient.nextLine();
						optionIngredient = Integer.parseInt(ingredientOption);

						switch (optionIngredient) {
							case 1:
								baguette = new Chicken(baguette);
								finalPrice += 0.50;
								System.out.println("\nYou have added chicken. + 0.50");
								break;

							case 2:
								baguette = new Ham(baguette);
								finalPrice += 0.35;
								System.out.println("\nYou have added ham. + 0.35");
								break;

							case 3:
								baguette = new Pepperoni(baguette);
								finalPrice += 0.40;
								System.out.println("\nYou have added pepperoni. + 0.40");
								break;

							case 4:
								baguette = new Tomato(baguette);
								finalPrice += 0.12;
								System.out.println("\nYou have added tomato. + 0.12");
								break;

							case 5:
								baguette = new Lettuce(baguette);
								finalPrice += 0.10;
								System.out.println("\nYou have added lettuce. + 0.10");
								break;

							case 6:
								baguette = new Onion(baguette);
								finalPrice += 0.10;
								System.out.println("\nYou have added onion. + 0.10");
								break;

							case 7:
								baguette = new Ketchup(baguette);
								finalPrice += 0.05;
								System.out.println("\nYou have added ketchup. + 0.05");
								break;

							case 8:
								baguette = new Mayo(baguette);
								finalPrice += 0.05;
								System.out.println("\nYou have added mayonnaise. + 0.05");
								break;

							case 9:
								baguette = new Mustard(baguette);
								finalPrice += 0.05;
								System.out.println("\nYou have added mustard. + 0.05");
								break;

							default:
								System.out.println("Please choose a valid option.");
								break;							
						}

					} while (optionIngredient != 0);
					System.out.println("\nThis is your order: " + baguette.getDescription() + "\n" +
						"The total amount to pay is: " + finalPrice);
					break;

				case 3:
					finalPrice = 1.20;
					testClass.asignWholemealSandwich();
					do { 
						String ingredientOption = scIngredient.nextLine();
						optionIngredient = Integer.parseInt(ingredientOption);

						switch (optionIngredient) {
							case 1:
								baguette = new Chicken(baguette);
								finalPrice += 0.50;
								System.out.println("\nYou have added chicken. + 0.50");
								break;

							case 2:
								baguette = new Ham(baguette);
								finalPrice += 0.35;
								System.out.println("\nYou have added ham. + 0.35");
								break;

							case 3:
								baguette = new Pepperoni(baguette);
								finalPrice += 0.40;
								System.out.println("\nYou have added pepperoni. + 0.40");
								break;

							case 4:
								baguette = new Tomato(baguette);
								finalPrice += 0.12;
								System.out.println("\nYou have added tomato. + 0.12");
								break;

							case 5:
								baguette = new Lettuce(baguette);
								finalPrice += 0.10;
								System.out.println("\nYou have added lettuce. + 0.10");
								break;

							case 6:
								baguette = new Onion(baguette);
								finalPrice += 0.10;
								System.out.println("\nYou have added onion. + 0.10");
								break;

							case 7:
								baguette = new Ketchup(baguette);
								finalPrice += 0.05;
								System.out.println("\nYou have added ketchup. + 0.05");
								break;

							case 8:
								baguette = new Mayo(baguette);
								finalPrice += 0.05;
								System.out.println("\nYou have added mayonnaise. + 0.05");
								break;

							case 9:
								baguette = new Mustard(baguette);
								finalPrice += 0.05;
								System.out.println("\nYou have added mustard. + 0.05");
								break;

							default:
								System.out.println("Please choose a valid option.");
								break;							
						}

					} while (optionIngredient != 0);
					System.out.println("\nThis is your order: " + baguette.getDescription() + "\n" +
						"The total amount to pay is: " + finalPrice);
					break;

				case 4:
					System.out.println("\nYou have selected Double Cheese pizza:");
					testClass.asignDoubleCheese();
					break;

				case 5:
					System.out.println("\nYou have selected Just Meat pizza:");
					testClass.asignJustMeat();
					break;

				case 6:
					System.out.println("\nYou have selected Ultra Thin pizza:");
					testClass.asignUltraThin();
					break;

				case 7: 
					System.out.println("\nYou have selected Extra Gross pizza:");
					testClass.asignExtraGross();
					break;

				case 8:
					System.out.println("\nYou have selected Special pizza:");
					testClass.asignSpecial();
					break;

				case 0:
					break;

				default :
					System.out.println("\nPlease choose a valid option.");
					break;
			}
		} while (option != 0);
	}
}