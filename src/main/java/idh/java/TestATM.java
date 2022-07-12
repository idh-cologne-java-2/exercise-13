package idh.java;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.Test;

public class TestATM {
	
	ATM atm = new ATM();
	
	@Test
	public void testConvertToBills() throws ATM.IllegalInputException{
		assertArrayEquals(new int[] {1,1,0,0,0,0,0}, atm.convertToBills(40));
		assertArrayEquals(new int[] {0,0,0,0,0,1,0}, atm.convertToBills(100));
		assertArrayEquals(new int[] {1,1,0,0,1,0,1}, atm.convertToBills(150));
		assertArrayEquals(new int[] {0,1,1,1,0,0,1}, atm.convertToBills(575));
	}

	@Test
    void testNegativeNumber() throws ATM.IllegalInputException{
        assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0}, new ATM().convertToBills(-1));
    }
	
	@Test
    void testNoFive() throws ATM.IllegalInputException{
		assertThrows(ATM.IllegalInputException.class, () -> { atm.convertToBills(23); });
    }
}
