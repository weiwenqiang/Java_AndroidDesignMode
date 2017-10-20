package ten;

public class AdditionExpression extends OperatorExpression {

	public AdditionExpression(ArithmeticExpression exp1,
			ArithmeticExpression exp2) {
		super(exp1, exp2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int interpreter() {
		// TODO Auto-generated method stub
		return exp1.interpreter() + exp2.interpreter();
	}

}
