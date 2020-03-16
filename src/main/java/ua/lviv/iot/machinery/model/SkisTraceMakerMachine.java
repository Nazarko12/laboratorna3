package ua.lviv.iot.machinery.model;

public class SkisTraceMakerMachine extends Machinery {

	private double hightOfMachineInMeters;

	public SkisTraceMakerMachine(int yearOfProduction, double loseFuelPerOneHour, double weightOfMachineryInKg,
			int machieneMileage, WheelType wheelType, FuelType fuelType, double hightOfMachineInMeters) {
		super(yearOfProduction, loseFuelPerOneHour, weightOfMachineryInKg, machieneMileage, wheelType, fuelType);
		this.hightOfMachineInMeters = hightOfMachineInMeters;
	}

	public double getHightOfMachineInMeters() {
		return hightOfMachineInMeters;
	}

	public void setHightOfMachineInMeters(double hightOfMachineInMeters) {
		this.hightOfMachineInMeters = hightOfMachineInMeters;
	}

}