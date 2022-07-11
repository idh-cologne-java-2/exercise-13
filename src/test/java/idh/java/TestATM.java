package idh.java;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import idh.java.ATM.IllegalInputException;



public class TestATM {
	ATM atm = new ATM();
	
	@Test
	
	void testBillsSize() throws IllegalInputException {
		
		int [] result = {0,0,1,0,0,0,0};
		int [] result1 = {0,1,0,1,0,0,1};
		int [] result2 = {3,0,0,0,1,0,0};
		assertArrayEquals(result , atm.convertToBills(100));
		assertArrayEquals(result1 , atm.convertToBills(255));
		assertArrayEquals(result2 , atm.convertToBills(1520));
	}
	
	@Test
	
	void testNegative() throws IllegalInputException {
		
		assertArrayEquals(new int [] {0,0,0,0,0,0,0}, atm.convertToBills(-1));
	}
	
	@Test
	
	void testException() {
		
		assertThrows(IllegalInputException.class, () -> atm.convertToBills(13));
	}
}
