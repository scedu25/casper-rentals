package casperRentals;

public class Diesel extends Automobile {

	private int numOfWheels, numOfCylinders;

	public Diesel(int range, Manufacturer manufacturer) {
		super(range, manufacturer);
		setCarType(CarType.DIESEL);
		setBasePrice(8000);
		setVin(54);
		setLuxuryTax(50);
		setLimitable(false);
		setRenewable(false);
		setCost(calculateCost());
	}
	
	public Diesel(int range, Manufacturer manufacturer, int numOfWheels, int numOfCylinders) {
		this(range, manufacturer);
		if (numOfWheels < 2)
			throw new IllegalArgumentException("Must have at least 2 wheels!");
		if (numOfCylinders < 1)
			throw new IllegalArgumentException("Must have at least 1 cylinder!");
		this.numOfWheels = numOfWheels;
		this.numOfCylinders = numOfCylinders;
	}
	
	public Diesel(int range, Manufacturer manufacturer, int numOfWheels, int numOfCylinders, Color color) {
		this(range, manufacturer, numOfWheels, numOfCylinders);
		setColor(color);
	}

	public int getNumOfWheels() {
		return numOfWheels;
	}

	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}

	public int getNumOfCylinders() {
		return numOfCylinders;
	}

	public void setNumOfCylinders(int numOfCylinders) {
		this.numOfCylinders = numOfCylinders;
	}
	
}
