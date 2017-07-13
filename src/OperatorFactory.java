
public class OperatorFactory {

	public CalculateOperator getOperator(String operator) {
		if ("+".equals(operator)) {
			return new CalculatePlusOperator();
		} else if("-".equals(operator)) {
			return new CalculateMinusOperator();
		}
		
		throw new InvalidOperatorException();
	}

}
