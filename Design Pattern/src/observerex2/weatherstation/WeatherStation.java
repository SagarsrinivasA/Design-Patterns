package observerex2.weatherstation;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {

	public final List<Observer> observers = new ArrayList();
	public String weather;

	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		int index = observers.indexOf(observer);
		observers.remove(index);
	}

	@Override
	public void notifyObserver() {

		for (Observer obj : observers) {
			obj.update(weather);
		}
	}

	public void setWeather(String newWeather) {

		this.weather = newWeather;
		notifyObserver();

	}

}
