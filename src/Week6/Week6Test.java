package Week6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Week6Test {
	@Test
	void test1() {
		String []word = new String[] {"SEND","MORE"};
		String target_word = "MONEY";
        Week6 obj = new Week6();
		boolean result= obj.isSolvable(word, target_word);
		assertEquals(result, true);
	}
	
	@Test
	void test2() {
		String []word = new String[] {"SIX","SEVEN","SEVEN"};	
		String target_word = "TWENTY";
        Week6 obj = new Week6();
		boolean result= obj.isSolvable(word, target_word);
		assertEquals(result, true);
	}
	
	@Test
	void test3() {
		String []word = new String[] {"THIS","IS","FUNNY"};
		String target_word = "TWENTY";
        Week6 obj = new Week6();
		boolean result= obj.isSolvable(word, target_word);
		assertEquals(result, false);
	}
}