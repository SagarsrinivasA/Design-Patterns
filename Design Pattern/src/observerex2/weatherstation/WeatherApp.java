package observerex2.weatherstation;

public class WeatherApp {

	public static void main(String[] args) {
		// create weather object
		WeatherStation obj = new WeatherStation();
		
		// create displays to be show weather
		Observer onePlusPhone = new PhoneDisplay();
		Observer onePlusTV = new TVDisplay();
		
		obj.addObserver(onePlusTV);
		obj.addObserver(onePlusPhone);
		
		obj.setWeather("its 7 in the morning... Feels Sunny");
	
		obj.setWeather("its 12 in the afternoon... Feels very hot");
		
		
	}

}
