package design.creational.abstractFactory;

public class USACarFactory {
	static Car car;
	public static void buildCar(CarType model){
		switch(model){
		
		case HatchBack: car=new HatchBackCar(FactoryLocation.USA); 
						car.carConstruction();
		break;
		
		case Luxury: car=new LuxuryCar(FactoryLocation.USA); 
						car.carConstruction();
		break;
		
		case Sedan: car=new SedanCar(FactoryLocation.USA); 
					car.carConstruction();
		break;
		
		default: break;
		}
	}
}
