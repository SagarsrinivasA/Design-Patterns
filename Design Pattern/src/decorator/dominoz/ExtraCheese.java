package decorator.dominoz;

public class ExtraCheese extends PizzaDecorator {
	
	public Pizza pizza;
	
	public ExtraCheese(Pizza pizza) {
		super();
		this.pizza = pizza;
	}

	@Override
	public String getDesc() {
		return pizza.getDesc()+", ExtraCheese medium :: 45";
	}

	@Override
	public int getPrice() {
		return pizza.getPrice() + 45;
	}

}
