package design.creational.factory;

public class LuxuryCar extends Car{

	LuxuryCar(){
		super(CarType.Luxury);
	}
	
	@Override
	public void carConstruction() {
		// TODO Auto-generated method stub
		System.out.println("Constructing Luxury car....");
	}

}
