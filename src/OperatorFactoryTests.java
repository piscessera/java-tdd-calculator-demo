import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class OperatorFactoryTests {

	@Test
	public void check_operator_plus() {
		OperatorFactory factory = new OperatorFactory();
		assertTrue((factory.getOperator("+") instanceof CalculatePlusOperator));
	}

	@Test
	public void check_operator_minus() {
		OperatorFactory factory = new OperatorFactory();
		assertTrue((factory.getOperator("-") instanceof CalculateMinusOperator));
	}

}
