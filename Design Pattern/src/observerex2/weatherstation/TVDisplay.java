package observerex2.weatherstation;

public class TVDisplay implements Observer {

	public String weather;

	@Override
	public void update(String weather) {
		this.weather = weather;
		display();
	}

	public void display() {
		System.err.println("TV display :: weather updated ::" + weather);
	}

}
