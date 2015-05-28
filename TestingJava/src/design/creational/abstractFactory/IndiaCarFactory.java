package design.creational.abstractFactory;

public class IndiaCarFactory {
	static Car car;
	public static void buildCar(CarType model){
		switch(model){
		
		case HatchBack: car=new HatchBackCar(FactoryLocation.India); 
						car.carConstruction();
		break;
		
		case Luxury: car=new LuxuryCar(FactoryLocation.India); 
						car.carConstruction();
		break;
		
		case Sedan: car=new SedanCar(FactoryLocation.India); 
					car.carConstruction();
		break;
		
		default: break;
		}
	}
}
