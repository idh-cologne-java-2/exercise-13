package idh.java;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import idh.java.ATM.IllegalInputException;

public class TestATM {
	
	ATM atm;
	
	@BeforeEach
	void setUp() {
		atm = new ATM();
	}
	
	@Test
	void testConvertToBillsCorrectBehaviour() throws IllegalInputException {
		assertArrayEquals(new int[] {0,0,0,0,1,1,1}, atm.convertToBills(35));
		assertArrayEquals(new int[] {20,0,0,0,0,0,1}, atm.convertToBills(10005));
		assertArrayEquals(new int[] {0,0,0,1,1,1,0}, atm.convertToBills(80));
		assertArrayEquals(new int[] {0,0,1,0,1,0,0}, atm.convertToBills(120));
	}
	
	@Test
	void testConvertToBillsInputZero() {
		assertThrows(IllegalInputException.class,  () -> atm.convertToBills(7));
	}

	@Test
	void testConvertToBillsInputNegative() throws IllegalInputException {
		assertArrayEquals(new int[] {0,0,0,0,0,0,0}, atm.convertToBills(-5));
	}

}
