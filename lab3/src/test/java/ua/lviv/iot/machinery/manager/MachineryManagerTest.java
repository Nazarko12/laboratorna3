package ua.lviv.iot.machinery.manager;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.machinery.model.FuelType;
import ua.lviv.iot.machinery.model.Machinery;
import ua.lviv.iot.machinery.model.SortType;
import ua.lviv.iot.machinery.model.WheelType;

class MachineryManagerTest extends BaseMachineryManagerTest {

	private MachineryManager machineryManager;
	
	@BeforeEach
	public void setUp() {	
		machineryManager = new MachineryManager();
		machineryManager.addMachinery();
	}
	
	@Test
	public void testSortingAscending() {
		List<Machinery> listOfMachinerySortedByLosingFuelPerOneHour = null;
     	MachineryManagerUtils.sortByloseFuelPerOneHour(listOfMachinerySortedByLosingFuelPerOneHour, SortType.ASC );
		List<Machinery> listOfSortedMachineryByMileage = null;
		MachineryManagerUtils.sortByMileage(listOfSortedMachineryByMileage,SortType.ASC);
	}
	
	@Test
	public void testSearchByFuelType() {
		List<Machinery> listOfSortedMachinery = new LinkedList<Machinery>();
		List<Machinery> expectedList = new LinkedList<Machinery>();
		MachineryManager manager = new MachineryManager ();
		manager.searchByFuelType(listOfSortedMachinery, FuelType.GAS);
		Machinery something = new Machinery(2005, 10.7, 1800, 15000, WheelType.EIGHTxEIGHT, FuelType.GAS);
		expectedList.add(something);
	assertEquals(expectedList.get(0).getFuelType(), listOfSortedMachinery.get(0).getFuelType());
	};
	
	@Test
	public void testSearchByWheelType() {
		List<Machinery> listOfSortedMachinery = new LinkedList<Machinery>();
		List<Machinery> expectedList = new LinkedList<Machinery>();
		MachineryManager manager = new MachineryManager ();
		manager.searchByWheelType(listOfSortedMachinery, WheelType.EIGHTxEIGHT);
		Machinery something = new Machinery(2005, 10.7, 1800, 15000, WheelType.EIGHTxEIGHT, FuelType.GAS);
		expectedList.add(something);
	assertEquals(expectedList.get(0).getWheelType(), listOfSortedMachinery.get(0).getWheelType());
	};
	
}
