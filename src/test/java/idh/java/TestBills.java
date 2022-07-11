package idh.java;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import idh.java.ATM.IllegalInputException;

public class TestBills {
	
	ATM atm = new ATM();
	int amount;
	
	@BeforeAll
	static void setupBeforeClass() throws Exception {
		System.out.println("Starting Bills Tests ...");
		}
		
	
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Finished Bills Tests!");
	}

	@Test
	@DisplayName("Test negative input")
	void testNegativeAmount() throws IllegalInputException {
		amount = -15;
		assertArrayEquals(new int[] {0,0,0,0,0,0,0}, atm.convertToBills(amount));
	}
		
	@Test
	@DisplayName("Test krummen Input")
	void testKrummenAmount() throws IllegalInputException {
		amount = 159;
		assertThrows(IllegalInputException.class, () -> atm.convertToBills(amount));
	}
	
	@Test
	@DisplayName("Test standard Input")
	void testStandardAmount() throws IllegalInputException {
		amount = 885;
		assertArrayEquals(new int[] {1, 1, 1, 1, 1, 1, 1}, atm.convertToBills(amount));
	}
	
	
	

}
