package casperRentals;

public class SemiTruck extends Diesel {

	public SemiTruck(int range, Manufacturer manufacturer) {
		super(range, manufacturer);
		setCarType(CarType.SEMITRUCK);
		setBasePrice(20000);
		setVin(66);
		setLuxuryTax(3000);
		setLimitable(true);
		setRenewable(false);
		setCost(calculateCost());
	}
	
	public SemiTruck(int range, Manufacturer manufacturer, int numOfWheels, int numOfCylinders) {
		this(range, manufacturer);
		if (numOfWheels < 2)
			throw new IllegalArgumentException("Must have at least 2 wheels!");
		if (numOfCylinders < 1)
			throw new IllegalArgumentException("Must have at least 1 cylinder!");
		setNumOfWheels(numOfWheels);
		setNumOfCylinders(numOfCylinders);
		setLimitable(true);
		setRenewable(false);
	}
	
	public SemiTruck(int range, Manufacturer manufacturer, int numOfWheels, int numOfCylinders, Color color) {
		this(range, manufacturer, numOfWheels, numOfCylinders);
		setColor(color);
	}

}