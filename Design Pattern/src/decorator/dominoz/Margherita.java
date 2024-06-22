package decorator.dominoz;

public class Margherita implements Pizza {

	@Override
	public String getDesc() {
		return "Medium Size :: 195";
	}

	@Override
	public int getPrice() {

		return 195;
	}

}
