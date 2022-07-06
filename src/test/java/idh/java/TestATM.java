package idh.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
		assertEquals(new int[] {0,0,0,0,1,1,1}, atm.convertToBills(35));
	}
}
