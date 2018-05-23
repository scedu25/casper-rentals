package casperRentals;

public class Speed extends Boat {
	
	public Speed(int range) {
		super(range);
		setBoatType(BoatType.SPEED);
		setBasePrice(35000);
		setVin(123);
		setLuxuryTax(2200);
		setCost(calculateCost());
	}

}
