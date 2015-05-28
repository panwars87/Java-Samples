package design.creational.abstractFactory;

public abstract class Car {
	private CarType model;
	private FactoryLocation fLocation;
	
	Car(CarType model,FactoryLocation location){
		this.model=model;
		this.fLocation=location;
	}
	
	public FactoryLocation getfLocation() {
		return fLocation;
	}

	public void setfLocation(FactoryLocation fLocation) {
		this.fLocation = fLocation;
	}
	
	public abstract void carConstruction();

	public CarType getModel() {
		return model;
	}

	public void setModel(CarType model) {
		this.model = model;
	}
}
