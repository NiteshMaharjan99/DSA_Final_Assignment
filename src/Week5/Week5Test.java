package Week5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Week5Test {
	@Test
	void test1() {
		
		String target = "frog";
        String[] set = { "programming","for","developers"};
        
		int result = Week5.checkSubset(target, set);
		assertEquals(result, 2);
	}
	
	@Test
	void test2() {
		
		String target = "game";
        String[] set = { "programming","for","developers"};
        
		int result = Week5.checkSubset(target, set);
		assertEquals(result, 3);
	}
}
