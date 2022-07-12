package idh.java;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.Test;

public class ATMTest {
	
	ATM atm = new ATM();
	
	@Test
	void testwenigscheine() throws ATM.IllegalInputException {
		
		assertArrayEquals(new int[] {0,0,1,1,0,1,0}, atm.convertToBills(160));
		assertArrayEquals(new int[] {0,1,0,1,0,0,0}, atm.convertToBills(250));
		assertArrayEquals(new int[] {0,1,0,1,1,0,1}, atm.convertToBills(275));
		assertArrayEquals(new int[] {1,0,0,1,0,0,1}, atm.convertToBills(555));
		assertArrayEquals(new int[] {1,0,0,1,1,1,1}, atm.convertToBills(585));
	

}

	@Test
	void testnegativezahl() throws ATM.IllegalInputException {
		assertArrayEquals(new int[] {0,0,0,0,0,0,0}, new ATM().convertToBills(-70));
	
}
	@Test
	void testteilung() throws ATM.IllegalInputException {
	assertThrows(ATM.IllegalInputException.class, () -> { atm.convertToBills(19); });
	
}


}




