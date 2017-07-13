
public class CalculateMinusOperator implements CalculateOperator {

	@Override
	public boolean checkOperator(String operator) {
		if ("-".equals(operator)) {
			return true;
		}
		return false;
	}

	@Override
	public int process(int num1, int num2) {
		return num1 - num2;
	}

}
