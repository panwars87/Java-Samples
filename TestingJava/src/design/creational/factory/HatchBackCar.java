package design.creational.factory;

public class HatchBackCar extends Car{

	HatchBackCar(){
		super(CarType.HatchBack);
	}
	
	@Override
	public void carConstruction() {
		// TODO Auto-generated method stub
		System.out.println("Constructing HatchBack car....");
	}

}
