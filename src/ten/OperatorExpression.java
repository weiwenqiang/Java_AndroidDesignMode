package ten;

public abstract class OperatorExpression extends ArithmeticExpression {

	//����������Ա�����洢����������ߵ����ֽ�����
	protected ArithmeticExpression exp1, exp2;
	
	public OperatorExpression(ArithmeticExpression exp1, ArithmeticExpression exp2){
		this.exp1 = exp1;
		this.exp2 = exp2;
	}
	
}
