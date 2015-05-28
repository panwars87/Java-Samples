package design.creational.factory;

public class TestCarFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarFactory.buildCar(CarType.HatchBack);
		CarFactory.buildCar(CarType.Luxury);
		CarFactory.buildCar(CarType.Sedan);
	}

}
