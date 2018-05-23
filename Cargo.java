package casperRentals;

public class Cargo extends Boat {

	public Cargo(int range) {
		super(range);
		setBoatType(BoatType.CARGO);
		setBasePrice(750000);
		setVin(542);
		setLuxuryTax(8500);
		setCost(calculateCost());
	}
	
}
