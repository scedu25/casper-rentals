package casperRentals;

public abstract class Automobile extends Vehicle {

	public enum Color { BLACK, WHITE, SILVER, BLUE, RED, GREEN };
	public enum CarType { ELECTRIC, STANDARD, DIESEL, SEMITRUCK };
	public enum Manufacturer { TOYOTA, HONDA, FORD, HYUNDAI, BMW, MERCEDESBENZ, CHEVY, TESLA };
	
	private Color color;
	private CarType carType;
	private final Manufacturer manufacturer;
	private boolean limitable, renewable;
	
	public Automobile(int range, Manufacturer manufacturer) {
		super(range);
		this.color = Color.BLACK;
		this.manufacturer = manufacturer;
	}

	public CarType getCarType() {
		return carType;
	}

	public void setCarType(CarType carType) {
		this.carType = carType;
	}

	public Manufacturer getManufacturer() {
		return manufacturer;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public boolean isLimitable() {
		return limitable;
	}

	public void setLimitable(boolean limitable) {
		this.limitable = limitable;
	}

	public boolean isRenewable() {
		return renewable;
	}

	public void setRenewable(boolean renewable) {
		this.renewable = renewable;
	}

	@Override
	public String toString() {
		String retval;
		if (!isLimitable()) {
			retval = carType + " by " + manufacturer + " with VIN " + getVin() + " is available to rent in " + color + 
				". This beast has a range of " + getRange() + " and only costs $" + calculateCost();
		}
		else {
			retval = carType + " by " + manufacturer + " with VIN " + getVin() + " is available to rent in " + color + 
			". This monster has a range of " + getRange() + " and only costs $" + calculateCost() + " unless range exceeded";
		}
		return retval;
	}
	
}
