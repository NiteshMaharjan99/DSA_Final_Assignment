package Week4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Week4Test {
	@Test
	void test1() {
		
		int array[] = { 5, 2, 6 };
        
		int result = Week4.findTotalContainers(array);
		assertEquals(result, 6);
	}
	
	@Test
	void test2() {
		
		int array[] = { 2, 1, 5 };
		
        
		int result = Week4.findTotalContainers(array);
		assertEquals(result, 6);
	}
}
