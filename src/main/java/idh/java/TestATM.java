package idh.java;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import idh.java.ATM.IllegalInputException;

public class TestATM {
	
	ATM atm = new ATM();
	
    @Test
    void testGroßeScheine() throws IllegalInputException {
        assertArrayEquals(new int[] {0,0,0,1,1,1,1}, atm.convertToBills(85));
        assertArrayEquals(new int[] {0,1,1,1,1,1,0}, atm.convertToBills(380));
        assertArrayEquals(new int[] {1,0,0,1,0,0,1}, atm.convertToBills(555));
    }
    
    @Test
    void testNegativ() throws IllegalInputException{
        assertArrayEquals(new int[] {0,0,0,0,0,0,0}, atm.convertToBills(-1));
    }
    
    @Test
    void testTeilbar() {
        assertThrows(IllegalInputException.class, () -> { atm.convertToBills(1); });
    }
    
}
