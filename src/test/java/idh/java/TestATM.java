package idh.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestATM {

    ATM atm = new ATM();

    @Test
    void groestenScheine() throws ATM.IllegalInputException {
        assertArrayEquals(new int[] {0,0,0,0,1,1,0}, atm.convertToBills(30));
        assertArrayEquals(new int[] {1,0,0,0,0,0,0}, atm.convertToBills(500));
        assertArrayEquals(new int[] {1,0,0,0,1,1,0}, atm.convertToBills(530));
    }

    @Test
    void testnichtnull() throws ATM.IllegalInputException{
        assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0}, new ATM().convertToBills(-800));
    }

    @Test
    void testteilbar() throws ATM.IllegalInputException {
        assertThrows(ATM.IllegalInputException.class, () -> { atm.convertToBills(7); });
    }
}
