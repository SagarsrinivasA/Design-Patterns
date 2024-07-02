package factory;

public class TwoWheelerFactory implements VehicleFactory {

	@Override
	public Vehicle createVehicle() {
		// TODO Auto-generated method stub
		return new TwoWheeler();
	}

}
