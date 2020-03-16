package ua.lviv.iot.machinery.manager;

import java.util.LinkedList;
import java.util.List;

import ua.lviv.iot.machinery.model.FuelType;
import ua.lviv.iot.machinery.model.SkiLiftMakerMachine;
import ua.lviv.iot.machinery.model.WheelType;

public abstract class BaseMachineryManagerTest {

	protected List<SkiLiftMakerMachine> skiLiftMakerMachine;

	public void createSkiLiftMakerMachine() {
		skiLiftMakerMachine = new LinkedList<SkiLiftMakerMachine>();
		skiLiftMakerMachine.add(new SkiLiftMakerMachine(2005, 10.7, 1800, 15000, WheelType.EIGHTxEIGHT, FuelType.GAS, 100.0));
	}
}
