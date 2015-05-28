package design.creational.abstractFactory;

public class HatchBackCar extends Car{

	HatchBackCar(FactoryLocation location){
		super(CarType.HatchBack,location);
	}
	
	@Override
	public void carConstruction() {
		// TODO Auto-generated method stub
		System.out.println("Constructing HatchBack car....");
	}

}
