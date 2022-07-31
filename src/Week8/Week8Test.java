package Week8;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Week8Test {
	@Test
	void test1() {
		
		String []grid = new String[] {"@*a*#","###*#","b*A*B"};
        Week8 obj = new Week8();
		int result = obj.shortestPathAllKeys(grid);
		assertEquals(result, 8);
	}
	
	@Test
	void test2() {
		String []grid = new String[] {"@..aA","..B#.","....b"};
		Week8 obj = new Week8();
		int result = obj.shortestPathAllKeys(grid);
		assertEquals(result, 6);
	}
	
	@Test
	void test3() {
		String []grid = new String[] {"@Aa"};
		Week8 obj = new Week8();
		int result = obj.shortestPathAllKeys(grid);
		assertEquals(result, -1);
	}
}

