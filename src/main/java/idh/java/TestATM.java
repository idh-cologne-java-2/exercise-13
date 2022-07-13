package idh.java;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

import idh.java.ATM.IllegalInputException;

public class TestATM {

	@Test
	void test1() throws IllegalInputException {
		assertArrayEquals(new int[] {1, 1, 1, 0, 0, 0, 0}, new ATM().convertToBills(800));
		assertArrayEquals(new int[] {0, 1, 0, 1, 0, 1, 0}, new ATM().convertToBills(260));
		assertArrayEquals(new int[] {0, 0, 0, 1, 0, 0, 1}, new ATM().convertToBills(55));
	}
	
	@Test
	void test2() throws IllegalInputException {
		assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0}, new ATM().convertToBills(-800));
	}
	
	@Test
	void test3() throws IllegalInputException {
		assertThrows(IllegalInputException.class,() -> {new ATM().convertToBills(13);});
	}
}