package design.creational.factory;

public class SedanCar extends Car{

	SedanCar(){
		super(CarType.Sedan);
	}
	
	@Override
	public void carConstruction() {
		// TODO Auto-generated method stub
		System.out.println("Constructing Sedan car....");
	}

}
