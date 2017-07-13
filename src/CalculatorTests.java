import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * +, -, *, /
 * 
 * input 2 numbers
 * add operator: "+,-,*,/"
 *  	exception: InvalidOperatorException
 * output result
 *
 * 1 + 1 = 2
 * 1 - 1 = 0
 * 1 * 1 = 1
 * 1 * 2 = 2
 * 2 / 2 = 1
 * 2 / 0 = DivideByZeroException
 * 
 */

public class CalculatorTests {
	
	Calculator c = new Calculator();
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
	
	@Before
	public void setup(){
		System.out.println("Before");
	}
	
	@After
	public void after(){
		System.out.println("After");
	}

	@Test
	public void plus_1_1_then_return_2() {
		System.out.println("testcase");
		c.setFactory(new OperatorFactory());
		int result = c.plus(1,1);
		assertEquals(2 ,result);
	}
	
	@Test
	public void plus_1_2_then_return_3() {
		System.out.println("testcase");
		c.setFactory(new OperatorFactory());
		int result = c.plus(1,2);
		assertEquals(3 ,result);
	}

	@Test
	public void minus_1_2_then_return_minus3() {
		System.out.println("testcase");
		c.setFactory(new OperatorFactory());
		int result = c.minus(1,2);
		assertEquals(-1 ,result);
	}
	
	@Test
	public void plus_operator_with_1_2_then_return_3(){
		System.out.println("testcase");
		c.setFactory(new OperatorFactory());
		int result = c.operate("+", 1, 2);
		assertEquals(3, result);
	}
	
	@Test
	public void minus_operator_with_1_2_then_return_minus3(){
		System.out.println("testcase");
		c.setFactory(new OperatorFactory());
		int result = c.operate("-", 1, 2);
		assertEquals(-1, result);
	}
	
	@Test
	public void plus_operator_with_2_2_then_return_4(){
		System.out.println("testcase");
		c.setFactory(new OperatorFactory());
		int result = c.operate("+", 2, 2);
		assertEquals(4, result);
	}
	
	@Test(expected = InvalidOperatorException.class)
	public void check_operator_failed(){
		System.out.println("testcase");
		c.setFactory(new OperatorFactory());
		c.operate("xxxx", 0, 0);
	}
	
	@Test
	public void multiply_operator_with_2_3_then_return_6(){
		System.out.println("testcase");
		c.setFactory(new OperatorMultiply());
		int result = c.operate("*", 2, 3);
		assertEquals(6, result);
	}
	
	public class OperatorMultiply extends OperatorFactory{

		@Override
		public CalculateOperator getOperator(String operator) {
			return new CalculateOperator() {
				
				@Override
				public int process(int num1, int num2) {
					
					//calcuate xxxx
					
					return num1 * num2;
				}
				
				@Override
				public boolean checkOperator(String operator) {
					return true;
				}
			};
		}
		
	}
}









