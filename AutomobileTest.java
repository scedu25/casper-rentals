package casperRentals;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import casperRentals.Automobile.CarType;
import casperRentals.Automobile.Color;
import casperRentals.Automobile.Manufacturer;

class AutomobileTest {
	
	Automobile standard, electric, diesel;
	Diesel semiTruck;

	@BeforeEach
	void setUp() throws Exception {
		standard = new Standard(250, Manufacturer.TOYOTA);
		electric = new Electric(250, Manufacturer.TESLA);
		diesel = new Diesel(250, Manufacturer.CHEVY);
		semiTruck = new SemiTruck(250, Manufacturer.FORD);
	}

	@Test
	void testStandardCarType() {
		assertEquals(standard.getCarType(), CarType.STANDARD);
	}
	
	@Test
	void testElectricCarType() {
		assertEquals(electric.getCarType(), CarType.ELECTRIC);
	}
	
	@Test
	void testDieselCarType() {
		assertEquals(diesel.getCarType(), CarType.DIESEL);
	}
	
	@Test
	void testSemiTruckCarType() {
		assertEquals(semiTruck.getCarType(), CarType.SEMITRUCK);
	}
	
	@Test
	void testStandardColor() {
		assertEquals(standard.getColor(), Color.BLACK);
	}
	
	@Test
	void testElectricColor() {
		assertEquals(electric.getColor(), Color.BLACK);
	}
	
	@Test
	void testDieselColor() {
		assertEquals(diesel.getColor(), Color.BLACK);
	}
	
	@Test
	void testSemiTruckColor() {
		assertEquals(semiTruck.getColor(), Color.BLACK);
	}
	
	@Test
	void testLimitableRule() {
		assertTrue(electric.isLimitable());
		assertTrue(semiTruck.isLimitable());
		assertFalse(standard.isLimitable());
		assertFalse(diesel.isLimitable());
	}
	
	@Test
	void testRenewableRule() {
		assertTrue(electric.isRenewable());
		assertFalse(semiTruck.isRenewable());
		assertFalse(standard.isRenewable());
		assertFalse(diesel.isRenewable());
	}
	
	@Test
	void testSemiTruck() {
		semiTruck = new SemiTruck(250, Manufacturer.FORD, 8, 4, Color.BLUE);
		assertEquals(semiTruck.getNumOfWheels(), 8);
		assertEquals(semiTruck.getNumOfCylinders(), 4);
		assertTrue(semiTruck.isLimitable());
		assertFalse(semiTruck.isRenewable());
		assertEquals(semiTruck.getColor(), Color.BLUE);
	}

}
