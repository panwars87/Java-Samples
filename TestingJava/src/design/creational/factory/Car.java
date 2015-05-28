package design.creational.factory;

public abstract class Car {
	private CarType model;
	
	Car(CarType model){
		this.model=model;
	}
	
	public abstract void carConstruction();

	public CarType getModel() {
		return model;
	}

	public void setModel(CarType model) {
		this.model = model;
	}
}
