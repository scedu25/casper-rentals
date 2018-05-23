package casperRentals;

import java.util.Date;

import casperRentals.Automobile.Color;
import casperRentals.Automobile.Manufacturer;

public class Rentals {

	public static void main(String[] args) {
		Automobile electric = new Electric(300, Manufacturer.TESLA, 3, Color.RED);
		Automobile standard = new Standard(350, Manufacturer.TOYOTA, new Date(), 4, Color.GREEN);
		Automobile diesel = new Diesel(500, Manufacturer.FORD, 4, 4);
		Automobile semi = new SemiTruck(550, Manufacturer.CHEVY, 8, 8, Color.BLUE);
		Boat yacht = new Yacht(450);
		
		System.out.println(electric);
		System.out.println(standard);
		System.out.println(diesel);
		System.out.println(semi);
		System.out.println(yacht);
	}

}
