package casperRentals;

public abstract class Vehicle {
	
	private int range, vin, basePrice, luxuryTax, cost;
	
	public Vehicle(int range) {
		this.range = range;
		vin = 0;
		basePrice = 0;
		luxuryTax = 0;
		cost = 0;
	}

	public int calculateCost() {
		cost = (basePrice * vin) / range + luxuryTax;
		return cost;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public int getVin() {
		return vin;
	}

	public void setVin(int vin) {
		this.vin = vin;
	}

	public int getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(int basePrice) {
		this.basePrice = basePrice;
	}

	public int getLuxuryTax() {
		return luxuryTax;
	}

	public void setLuxuryTax(int luxuryTax) {
		this.luxuryTax = luxuryTax;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
}
