package Week7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Week7Test {
	@Test
	void test1() {
		
		int[][] A = { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
        
		int result = Week7.uniquePathsWithObstacles(A);
		assertEquals(result, 2);
	}
	
	@Test
	void test2() {
		
		int[][] A = { { 0, 1, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
        
		int result = Week7.uniquePathsWithObstacles(A);
		assertEquals(result, 1);
	}
	
	@Test
	void test3() {
		
		int[][] A = { { 0, 1, 0 }, { 0, 1, 0 }, { 1, 0, 0 } };
        
		int result = Week7.uniquePathsWithObstacles(A);
		assertEquals(result, 0);
	}
}
