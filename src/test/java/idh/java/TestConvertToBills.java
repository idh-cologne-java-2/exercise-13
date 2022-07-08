package idh.java;

//import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import idh.java.ATM.IllegalInputException;

public class TestConvertToBills {
	
	ATM r = new ATM();
	int[] m = new int[7];
	boolean b = false;
	

	@Test
	void test1() throws IllegalInputException {
		//Bei einer durch fünf teilbaren Eingabe wird eine Stückelung erzeugt,
		//die möglichst wenig Scheine verbraucht
		//(d.h. es werden immer möglichst große Scheine ausgegeben).
		//Testen Sie dies mit einer Reihe von möglichen Eingaben.
		
		m = r.convertToBills(535);
		b = m[0] == 1 && m[1] == 0 && m[2] == 0 && m[3] == 0 && m[4] == 1 && m[5] == 1 && m[6] == 1;
		assertTrue(b);
		m = r.convertToBills(950);
		b = m[0] == 1 && m[1] == 2 && m[2] == 0 && m[3] == 1 && m[4] == 0 && m[5] == 0 && m[6] == 0;
		assertTrue(b);
		m = r.convertToBills(315);
		b = m[0] == 0 && m[1] == 1 && m[2] == 1 && m[3] == 0 && m[4] == 0 && m[5] == 1 && m[6] == 1;
		assertTrue(b);
		
//		assertEquals(e[0], r.convertToBills(a[0]));
//		assertEquals(e[1], r.convertToBills(a[1]));
//		assertEquals(e[2], r.convertToBills(a[2]));
	}
	
	@Test
	void test2() throws IllegalInputException {
		//Bei Eingabe einer negativen Zahl wird ein Array mit Nullen zurückgegeben.
		m = r.convertToBills(-15);
		b = m[0] == 0 && m[1] == 0 && m[2] == 0 && m[3] == 0 && m[4] == 0 && m[5] == 0 && m[6] == 0;
		assertTrue(b);
	}
	
	@Test
	void test3() {
		//Bei Eingabe einer Zahl die nicht durch fünf teilbar ist,
		//wird eine Exception der Klasse IllegalInputException geworfen.
		assertThrows(IllegalInputException.class, () -> { r.convertToBills(27); });		
	}
}
