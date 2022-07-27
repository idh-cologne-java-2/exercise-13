package src.main.java.idh.java;

import org.junit.Assert;
import org.junit.Test;

import idh.java.ATM.IllegalInputException;

public class TestATM {
ATM atm = new ATM();
	
	@Test
	public void testConvertToBills() {
		Assert.assertThrows(IllegalInputException.class, () -> { atm.convertToBills(1); } );
		
		try {
			Assert.assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0}, new ATM().convertToBills(-20));
			Assert.assertArrayEquals(new int[] {1, 0, 0, 0, 1, 0, 0}, new ATM().convertToBills(520));
			Assert.assertArrayEquals(new int[] {1, 1, 1, 0, 0, 0, 0}, new ATM().convertToBills(800));
			Assert.assertArrayEquals(new int[] {1, 2, 0, 1, 0, 0, 0}, new ATM().convertToBills(950));
		}
		catch (IllegalInputException e) {
			e.printStackTrace();
		}
	}

}
