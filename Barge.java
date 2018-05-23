package casperRentals;

public class Barge extends Boat {

	public Barge(int range) {
		super(range);
		setBoatType(BoatType.BARGE);
		setBasePrice(500000);
		setVin(893);
		setLuxuryTax(5000);
		setCost(calculateCost());
	}
	
}
