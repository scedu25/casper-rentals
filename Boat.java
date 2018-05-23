package casperRentals;

public abstract class Boat extends Vehicle {
	
	public enum BoatType { YACHT, SPEED, BARGE, CARGO };

	private BoatType boatType;
	
	public Boat(int range) {
		super(range);
		setRange(range * 7);
	}
	
	public BoatType getBoatType() {
		return boatType;
	}
	
	public void setBoatType(BoatType boatType) {
		this.boatType = boatType;
	}

	@Override
	public String toString() {
		String retval = boatType + " with VIN " + getVin() + " is available to rent. This beauty has a range of " 
							+ getRange() + " and only costs $" + calculateCost();
		return retval;
	}
	
}
