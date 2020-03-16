package ua.lviv.iot.machinery.model;

public class SkiLiftMakerMachine extends Machinery {

	private double sizeOfMachine;

	public SkiLiftMakerMachine(int yearOfProduction, double loseFuelPerOneHour, double weightOfMachineryInKg,
			int machieneMileage, WheelType wheelType, FuelType fuelType, double sizeOfMachine) {
		super(yearOfProduction, loseFuelPerOneHour, weightOfMachineryInKg, machieneMileage, wheelType, fuelType);
		this.sizeOfMachine = sizeOfMachine;
	}

	public double getSizeOfMachine() {
		return sizeOfMachine;
	}

	public void setSizeOfMachine(double sizeOfMachine) {
		this.sizeOfMachine = sizeOfMachine;
	}

}
