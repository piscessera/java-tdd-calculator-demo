import static org.junit.Assert.*;

import org.junit.Test;

public class CalculateOperatorPlusTests {
	CalculateOperator co = new CalculatePlusOperator();
	
	@Test
	public void check_plus_operator(){
		assertTrue(co.checkOperator("+"));
	}
	
	@Test
	public void check_plus_operator_error(){
		assertFalse(co.checkOperator("-"));
	}
	
	@Test
	public void process_1_1_then_return_2(){
		assertEquals(2, co.process(1, 1));
	}
	
	@Test
	public void process_1_2_then_return_3(){
		assertEquals(3, co.process(1, 2));
	}
}
