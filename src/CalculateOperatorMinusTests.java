import static org.junit.Assert.*;

import org.junit.Test;

public class CalculateOperatorMinusTests {
	CalculateOperator co = new CalculateMinusOperator();

	@Test
	public void check_minus_operator() {
		assertTrue(co.checkOperator("-"));
	}

	@Test
	public void check_minus_operator_error() {
		assertFalse(co.checkOperator("+"));
	}

	@Test
	public void process_1_1_then_return_0() {
		assertEquals(0, co.process(1, 1));
	}

	@Test
	public void process_1_2_then_return_minus1() {
		assertEquals(-1, co.process(1, 2));
	}

}
