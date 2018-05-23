package casperRentals;

import java.util.Date;

public class Standard extends Automobile {

	private Date emissionTestDate;
	private int numOfSeats;
	
	public Standard(int range, Manufacturer manufacturer) {
		super(range, manufacturer);
		setCarType(CarType.STANDARD);
		setBasePrice(3000);
		setVin(12);
		setLuxuryTax(0);
		setLimitable(false);
		setRenewable(false);
		setCost(calculateCost());
	}
	
	public Standard(int range, Manufacturer manufacturer, Date emissionTestDate, int numOfSeats) {
		this(range, manufacturer);
		if (numOfSeats < 1)
			throw new IllegalArgumentException("Must have at least 1 driver seat!");
		this.emissionTestDate = emissionTestDate;
		this.numOfSeats = numOfSeats;
	}
	
	public Standard(int range, Manufacturer manufacturer, Date emissionTestDate, int numOfSeats, Color color) {
		this(range, manufacturer, emissionTestDate, numOfSeats);
		setColor(color);
	}
	
	public Date getEmissionTestDate() {
		return emissionTestDate;
	}
	public void setEmissionTestDate(Date emissionTestDate) {
		this.emissionTestDate = emissionTestDate;
	}
	public int getNumOfSeats() {
		return numOfSeats;
	}
	public void setNumOfSeats(int numOfSeats) {
		this.numOfSeats = numOfSeats;
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
}
