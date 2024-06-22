package decorator.dominoz;

public class Vegitarion extends PizzaDecorator {

	public Pizza pizza;
	

	public Vegitarion(Pizza pizza) {
		super();
		this.pizza = pizza;
	}

	@Override
	public String getDesc() {
		return pizza.getDesc() + ", vegetarion medium :: 50";
	}

	@Override
	public int getPrice() {
		return pizza.getPrice() + 50;
	}

}
