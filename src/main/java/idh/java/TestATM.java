package idh.java;

import org.junit.Test;


import idh.java.ATM.IllegalInputException;
public class TestATM {

	ATM atm = new ATM();
	@Test
	public void testConvertToBills() {
		Assert.assertThrows(IllegalInputException.class, () -> { atm.convertToBills(1); } );
		
		try {
			Assert.assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0}, new ATM().convertToBills(110));
			Assert.assertArrayEquals(new int[] {1, 0, 1, 0, 0, 0, 0}, new ATM().convertToBills(800));
			Assert.assertArrayEquals(new int[] {1, 1, 0, 0, 1, 0, 0}, new ATM().convertToBills(630));
			Assert.assertArrayEquals(new int[] {1, 0, 0, 0, 0, 0, 0}, new ATM().convertToBills(-40));
		}
		catch (IllegalInputException e) {
			e.printStackTrace();
		}
	}
	
}