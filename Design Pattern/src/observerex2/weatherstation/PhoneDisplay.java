package observerex2.weatherstation;

public class PhoneDisplay implements Observer {

	public String weather;

	@Override
	public void update(String weather) {
		this.weather = weather;
		display();
	}

	public void display() {
		System.out.println("Phone Display :: weather updated ::-" + weather);
	}

}
