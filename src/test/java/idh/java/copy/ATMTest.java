package idh.java.copy;



import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.*;
import idh.java.ATM;
import idh.java.ATM.IllegalInputException;

public class ATMTest {
	
	@Test
	public void test1()throws IllegalInputException{
		assertArrayEquals(new int[]{1,0,0,0,0,0,0}, new ATM().convertToBills(500));
		assertArrayEquals(new int[]{0,1,1,0,1,0,0}, new ATM().convertToBills(320));
		assertArrayEquals(new int[]{0,2,0,0,0,0,0}, new ATM().convertToBills(400));
	}
	
	
	@Test
	public void test2()throws IllegalInputException{
		assertArrayEquals( new int []{0,0,0,0,0,0,0}, new ATM().convertToBills(-10));
		assertArrayEquals( new int []{0,0,0,0,0,0,0}, new ATM().convertToBills(-10));
		
	}
	
	@Test
	public void test3() {
		assertThrows(IllegalInputException.class, () -> {new ATM().convertToBills(7);});
	}
	
	
}
