package design.creational.abstractFactory;

public class ChinaCarFactory {
	static Car car;
	public static void buildCar(CarType model){
		switch(model){
		
		case HatchBack: car=new HatchBackCar(FactoryLocation.China); 
						car.carConstruction();
		break;
		
		case Luxury: car=new LuxuryCar(FactoryLocation.China); 
						car.carConstruction();
		break;
		
		case Sedan: car=new SedanCar(FactoryLocation.China); 
					car.carConstruction();
		break;
		
		default: break;
		}
	}
}
