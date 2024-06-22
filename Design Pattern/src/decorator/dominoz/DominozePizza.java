package decorator.dominoz;

import java.text.DecimalFormat;

public class DominozePizza {

	public static void main(String[] args) {

		// creating base object
		Pizza pizza = new Margherita();

		// creating object of toppings
		pizza = new ExtraCheese(pizza);
		pizza = new Vegitarion(pizza);

		// calculate the price of margherita with extra cheese and vagetarion toppings
		// on it

		System.out.println("Description :" + pizza.getDesc());
		DecimalFormat dformat = new DecimalFormat("#.##");
		System.out.println("Price of Margherita with extra cheese and vegis :: " + dformat.format(pizza.getPrice()));
	}

}
