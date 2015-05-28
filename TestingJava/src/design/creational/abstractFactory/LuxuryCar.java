package design.creational.abstractFactory;

public class LuxuryCar extends Car{

	LuxuryCar(FactoryLocation location){
		super(CarType.Luxury,location);
	}
	
	@Override
	public void carConstruction() {
		// TODO Auto-generated method stub
		System.out.println("Constructing Luxury car....");
	}

}
