import java.util.ArrayList;
import java.util.List;

public class Calculator {

	private OperatorFactory factory;

	public Calculator() {
		super();
	}

	public void setFactory(OperatorFactory factory) {
		this.factory = factory;
	}

	public int operate(String operator, int num1, int num2) {
		CalculateOperator co = factory.getOperator(operator);
		
		if (co.checkOperator(operator)) {
			return co.process(num1, num2);
		}
		
		throw new InvalidOperatorException();
	}

	public int minus(int i, int j) {
		return i - j;
	}

	public int plus(int i, int j) {
		return i + j;
	}

}
