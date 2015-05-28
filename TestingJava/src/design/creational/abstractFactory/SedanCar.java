package design.creational.abstractFactory;

public class SedanCar extends Car{

	SedanCar(FactoryLocation location){
		super(CarType.Sedan,location);
	}
	
	@Override
	public void carConstruction() {
		// TODO Auto-generated method stub
		System.out.println("Constructing Sedan car....");
	}

}
