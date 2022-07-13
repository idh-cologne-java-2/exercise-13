package idh.java;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import idh.java.ATM.IllegalInputException;

public class ATMTest {
	
	ATM atm = new ATM();

	@Test
	void großeScheineTest() throws IllegalInputException {
		assertArrayEquals(new int[] {1, 0, 0, 0, 0, 0, 0}, atm.convertToBills(500));
		assertArrayEquals(new int[] {0, 0, 1, 0, 0, 0, 0}, atm.convertToBills(100));
		assertArrayEquals(new int[] {0, 0, 0, 1, 1, 0, 0}, atm.convertToBills(70));
		assertArrayEquals(new int[] {0, 0, 0, 1, 1, 1, 1}, atm.convertToBills(85));
		
	}
	
	@Test
    void negativTest() throws ATM.IllegalInputException{
        assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0}, new ATM().convertToBills(-50));
    }
	
	@Test
    void teilenTest() throws ATM.IllegalInputException{
		assertThrows(ATM.IllegalInputException.class, () -> { atm.convertToBills(7); });
    }
}