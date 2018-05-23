package casperRentals;

public class Yacht extends Boat {

	public Yacht(int range) {
		super(range);
		setBoatType(BoatType.YACHT);
		setBasePrice(985000);
		setVin(8047);
		setLuxuryTax(60000);
		setCost(calculateCost());
	}
	
}
