package idh.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import idh.java.ATM.IllegalInputException;

public class TestConvertToBills {
	
	ATM r = new ATM();
	int [][] e = {{1,0,0,0,1,1,1},{1,2,0,1,0,0,0},{0,1,1,0,0,1,1},{0,0,0,0,0,0,0}};
	int [] a = {535, 950, 315, -15, 27};
	
	//a = 535, e = {1,0,0,0,1,1,1}
	//a = 950, e = {1,2,0,1,0,0,0}
	//a = 315, e = {0,1,1,0,0,1,1}
	//a = -15, e = {0,0,0,0,0,0,0}
	//a = 27 , e = null

	@Test
	void test1() throws IllegalInputException {
		//Bei einer durch fünf teilbaren Eingabe wird eine Stückelung erzeugt,
		//die möglichst wenig Scheine verbraucht
		//(d.h. es werden immer möglichst große Scheine ausgegeben).
		//Testen Sie dies mit einer Reihe von möglichen Eingaben.
		
		assertEquals(e[0], r.convertToBills(a[0]));
		assertEquals(e[1], r.convertToBills(a[1]));
		assertEquals(e[2], r.convertToBills(a[2]));
	}
	
	@Test
	void test2() throws IllegalInputException {
		//Bei Eingabe einer negativen Zahl wird ein Array mit Nullen zurückgegeben.
		assertEquals(e[3], r.convertToBills(a[3]));
	}
	
	@Test
	void test3() {
		//Bei Eingabe einer Zahl die nicht durch fünf teilbar ist,
		//wird eine Exception der Klasse IllegalInputException geworfen.
		assertThrows(IllegalInputException.class, () -> { r.convertToBills(a[4]); });		
	}
}
