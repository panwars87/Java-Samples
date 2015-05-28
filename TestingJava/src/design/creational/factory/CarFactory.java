package design.creational.factory;

public class CarFactory {
	static Car car;
	public static void buildCar(CarType model){
		switch(model){
		
		case HatchBack: car=new HatchBackCar(); 
						car.carConstruction();
		break;
		
		case Luxury: car=new LuxuryCar(); 
						car.carConstruction();
		break;
		
		case Sedan: car=new SedanCar(); 
					car.carConstruction();
		break;
		
		default: break;
		}
	}
}
