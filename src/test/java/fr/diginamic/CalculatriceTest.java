package fr.diginamic;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatriceTest {
	Calculatrice calculatrice;
	@Before
	public void initialition() {
		calculatrice = new CalculatriceImpl();
	}
	@Test
	public void premierTest() throws Exception {
		assertEquals(1, 1);
	}
	@Test
	public void additionTest() throws Exception {
		double a = 1;
		double b = 3;
		double retour = calculatrice.addition(a, b);
		assertEquals(retour, 4.0, 0.0);
	}
	@Test
	public void soustractionTest() throws Exception {
		double a = 3;
		double b = 1;
		double retour = calculatrice.soustraction(a, b);
		assertEquals(retour, 2.0, 0.0);
	}
	@Test
	public void multiplicationTest() throws Exception {
		double a = 1;
		double b = 3;
		double retour = calculatrice.multiplication(a, b);
		assertEquals(retour, 3.0, 0.0);
	}
	@Test
	public void divisonTest() throws Exception {
		double a = 4;
		double b = 2;
		double retour = calculatrice.division(a, b);
		assertEquals(retour, 2.0, 0.0);
	}@Test(expected = ArithmeticException.class)
	public void divisonParZeroTest() throws Exception {
		double a = 12;
		double b = 0;
		double retour = calculatrice.division(a, b);
		assertEquals(retour, 2.0, 0.0);
	}
}
