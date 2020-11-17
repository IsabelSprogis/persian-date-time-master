 package MultiToDiv;

import static org.junit.Assert.*;
import java.lang.*;

import org.junit.Test;

public class TestMultiToDiv {

		@Test
	public void testNotEquals() {
		int ano=2020;
		double expected =2 ;
		assertNotEquals(MultiplicationToDivision.simpleToJulianDays(ano), expected);
	}
	
	/*@Test
	public void test2() {
		int ano=0;
		double expected =1947981.0;
		double delta = 2.00;
		assertEquals(MultiplicationToDivision.simpleToJulianDays(ano), expected, delta);
		
	}*/
	
	@Test
	public void testNaoNulo() {
		int ano=2020;
		assertNotNull(MultiplicationToDivision.simpleToJulianDays(ano));
	}
	
	@Test
	public void testAno0Equals() {
		int ano=0;
		long expected = 1947981;
		assertEquals(MultiplicationToDivision.simpleToJulianDays(ano), expected);	
	}
	
	@Test
	public void testAno2820Equals() {
		int ano=2820;
		long expected = 2977963;
		assertEquals(MultiplicationToDivision.simpleToJulianDays(ano), expected);	
	}
	
	
	/*@Test
	public void testAno1029983Equals() {
		int ano=1029983;
		long expected = 378141236;
		assertEquals(MultiplicationToDivision.simpleToJulianDays(ano), expected);	
	} */
	
	@Test
	public void testAno1029984Equals() {
		int ano=1029984;
		long expected = 378141601;
		assertEquals(MultiplicationToDivision.simpleToJulianDays(ano), expected);	
	}
	
	/*
	@Test
	public void testMatarDivisao() {
		//ano=1 -> 1/(2820*1029983) = 1/2.904.552.060 = 4,774290e^10‬
		//ano=1 -> (1/2820)/1029983 -> 1*1029983/2820 = 365,242198
		//se 1029983x/2820 = 1, x= 2820/1029983, logo x = 0,0027379092664636212442341281361‬
		//simpleToJulianDays(1) console da 1948346
		double ano = 0.0027379092664636212442341281361;
		double expected = 1774858.15880981;
		double delta = 2.0000000;
		assertEquals(MultiplicationToDivision.simpleToJulianDays(ano), expected, delta);
		} */

}
