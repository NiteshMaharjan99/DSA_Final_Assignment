package Week1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;

public class Week1Test {
	@Test
	void test1() {
	 	LinkedList<Integer> a = new LinkedList<Integer>();

        a.add(1);
        a.add(5);
        a.add(3);
        a.add(6);
        a.add(10);

        LinkedList<Integer> b = new LinkedList<Integer>();

        b.add(3);
        b.add(5);
        b.add(7);
        b.add(12);

        LinkedList<Integer> c = new LinkedList<Integer>();

        c.add(1);
        c.add(2);
        c.add(5);
        c.add(6);
        c.add(9);

        LinkedList[] list = {a, b, c};
		Week1 obj = new Week1(list);
		int result = obj.queueItterator().length;
		assertEquals(result, 14);
	}
	
	@Test
	void test2() {
		 LinkedList<Integer> a = new LinkedList<Integer>();

	        a.add(5);
	        a.add(3);
	        a.add(6);
	        a.add(9);

	        LinkedList<Integer> b = new LinkedList<Integer>();

	        b.add(2);
	        b.add(4);
	        b.add(6);
	        b.add(10);

	        LinkedList<Integer> c = new LinkedList<Integer>();

	        c.add(2);
	        c.add(4);
	        c.add(6);
	        c.add(9);
	        c.add(12);

	        LinkedList[] list = {a, b, c};
			Week1 obj = new Week1(list);
			int result = obj.queueItterator().length;
			assertEquals(result, 13);
	}
}
