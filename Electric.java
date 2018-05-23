package casperRentals;

public class Electric extends Automobile {

	private int numOfBatteries;
	
	public Electric(int range, Manufacturer manufacturer) {
		super(range, manufacturer);
		setCarType(CarType.ELECTRIC);
		setBasePrice(15000);
		setVin(76);
		setLuxuryTax(153);
		setLimitable(true);
		setRenewable(true);
		setCost(calculateCost());
	}
	
	public Electric(int range, Manufacturer manufacturer, int numOfBatteries) {
		this(range, manufacturer);
		if (numOfBatteries < 1)
			throw new IllegalArgumentException("Must have at least 1 battery!");
		this.numOfBatteries = numOfBatteries;
	}
	
	public Electric(int range, Manufacturer manufacturer, int numOfBatteries, Color color) {
		this(range, manufacturer, numOfBatteries);
		setColor(color);
	}
	
	public int getNumOfBatteries() {
		return numOfBatteries;
	}
	public void setNumOfBatteries(int numOfBatteries) {
		this.numOfBatteries = numOfBatteries;
	}
	
}
