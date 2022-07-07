package idh.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import idh.java.ATM.IllegalInputException;

class TestATM {
	ATM atm = new ATM();
	
	@Test
	void testConvertToBills() {
		assertThrows(IllegalInputException.class, () -> {
			atm.convertToBills(1);
		});
		try {
			assertArrayEquals(new int[] {0,0,0,0,0,0,0}, atm.convertToBills(-1));
			assertArrayEquals(new int[] {2,0,0,0,0,0,1}, atm.convertToBills(1005));
			assertArrayEquals(new int[] {1,2,0,0,1,0,0}, atm.convertToBills(920));
			assertArrayEquals(new int[] {1,1,1,1,1,1,1}, atm.convertToBills(885));
		} catch (IllegalInputException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
