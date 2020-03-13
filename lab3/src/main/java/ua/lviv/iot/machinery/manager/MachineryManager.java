package ua.lviv.iot.machinery.manager;

import java.util.LinkedList;
import java.util.List;

import ua.lviv.iot.machinery.model.FuelType;
import ua.lviv.iot.machinery.model.Machinery;
import ua.lviv.iot.machinery.model.SortType;
import ua.lviv.iot.machinery.model.WheelType;

public class MachineryManager {
	List<Machinery> listOfMachinery = new LinkedList<Machinery>();
	{
		listOfMachinery.add(new Machinery(2001, 12.5, 2000, 12500, WheelType.FOURxFOUR, FuelType.PETROL));
		listOfMachinery.add(new Machinery(1995, 7.5, 3600, 8000, WheelType.SIXxSIX, FuelType.DIESEL));
		listOfMachinery.add(new Machinery(2005, 10.7, 1800, 15000, WheelType.EIGHTxEIGHT, FuelType.GAS));
	}
	public void addMachinery() {
		
	}
	
	public List<Machinery> searchByFuelType(List<Machinery> listOfSortedMachinery, FuelType fuelType) {
		for (Machinery list:listOfMachinery) {
			if (fuelType == list.getFuelType()) {
				listOfSortedMachinery.add(list);
			}		
		}
		MachineryManagerUtils.sortByMileage(listOfSortedMachinery, SortType.ASC);
		return listOfSortedMachinery;
	}
	
	public List<Machinery> searchByWheelType(List<Machinery> listOfSortedMachinery,WheelType wheelType) {
		for (Machinery list:listOfMachinery) {
			if (wheelType == list.getWheelType()) {
				listOfSortedMachinery.add(list);
			}		
		}
		MachineryManagerUtils.sortByMileage(listOfSortedMachinery, SortType.ASC);
		return listOfSortedMachinery;
	}
	
}
