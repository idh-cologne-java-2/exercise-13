package idh.java.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.Test;

import idh.java.ATM;
import idh.java.ATM.IllegalInputException;

public class ATMTests {
	
	ATM atm = new ATM();
	
	@Test
	public void convertToBillsTest1() throws IllegalInputException {
	
			assertArrayEquals(new int[] {1, 1, 1, 1, 1, 1, 1}, atm.convertToBills(885));
			assertArrayEquals(new int[] {0, 1, 0, 0, 1, 0, 0}, atm.convertToBills(220));
			assertArrayEquals(new int[] {0, 0, 1, 0, 0, 0, 0}, atm.convertToBills(100));
			assertArrayEquals(new int[] {0, 0, 0, 1, 1, 1, 1}, atm.convertToBills(85));
			assertArrayEquals(new int[] {0, 0, 0, 1, 1, 0, 0}, atm.convertToBills(70));
			assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 1}, atm.convertToBills(5));
	}
	
	@Test
	public void convertToBillsTest2() throws IllegalInputException {
		assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0}, atm.convertToBills(-5));
		assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0}, atm.convertToBills(-30));
	}
	
	@Test
	public void convertToBillsTest3() throws IllegalInputException {
		assertThrows(IllegalInputException.class, () -> { atm.convertToBills(16); });
	}
}
