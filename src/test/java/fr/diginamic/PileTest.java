package fr.diginamic;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PileTest {
	Pile<Integer> pile;
	Pile<String> pile2;

	@Before
	public void init() {
		pile = new Pile<Integer>();
		pile2 = new Pile<String>();
	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void createNewPileTest() throws Exception {
		int size = 10;
		pile2 = new Pile<String>(size);
		for (int i = 0; i <= size; i++) {
			pile2.push("a");
		}
		assertEquals(size, pile2.size());
	}
	@Test
	public void pushTest() {
		String a = "1";
		pile2.push(a);
		assertEquals(0,pile2.find(a));
	}
	@Test
	public void popTest() {
		String a = "1";
		pile2.push(a);
		pile2.pop();
		assertEquals(-1,pile2.find(a));
	}
	@Test
	public void popAllTest() {
		String a = "1";
		pile2.push(a);
		pile2.push(a);
		pile2.push(a);
		pile2.popAll();
		assertEquals(0,pile2.size());
	}
	@Test
	public void peekTest() {
		pile2.push("a");
		pile2.push("b");
		pile2.push("c");
		assertEquals("c",pile2.peek());
	}
}
