package design.creational.abstractFactory;

public class TestCarFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactoryLocation location = FactoryLocation.India;
		
		switch(location){
		case India: IndiaCarFactory.buildCar(CarType.HatchBack);
		break;
		
		default:break;
		}
	}

}
