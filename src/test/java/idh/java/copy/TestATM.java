package idh.java.copy;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import idh.java.ATM;
import idh.java.ATM.IllegalInputException;

public class TestATM {
	
	//convertToBills wurde public gemacht, da wegen dem import die Ordnerstruktur falsch war
	
	@Test
	void testCashout1() throws IllegalInputException {
		assertArrayEquals(new int[] {1, 0, 0, 0, 0, 0, 0}, new ATM().convertToBills(500));
		assertArrayEquals(new int[] {0, 0, 1, 0, 2, 0, 0}, new ATM().convertToBills(140));
		assertArrayEquals(new int[] {0, 0, 0, 0, 1, 1, 0}, new ATM().convertToBills(30));
	}
	
	@Test
	void testCashout2() throws IllegalInputException {
		int[] out = new int[] {0, 0, 0, 0, 0, 0, 0};
		assertArrayEquals(out, new ATM().convertToBills(-20));
	}
	
	@Test
	void testCashout3() {
		//assertThrows(Exception.class,() -> {new ATM().convertToBills(7);});
		
		//musste erst zugreifbar gemacht werden
		assertThrows(IllegalInputException.class,() -> {new ATM().convertToBills(7);});
	}

}
