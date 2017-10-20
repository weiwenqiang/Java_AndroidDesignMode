package ten;

import java.util.Stack;

public class Calculator {
	//����һ��Stackջ�洢������������صĽ�����
	private Stack<ArithmeticExpression> mExpStack = new Stack<ArithmeticExpression>();
	
	public Calculator(String expression){
		//��������ArithmeticExpression���͵���ʱ�������洢������������ߵ����ֽ�����
		ArithmeticExpression exp1, exp2;
		//���ݿո�ָ���ʽ�ַ���
		String[] elements = expression.split(" ");
		/**
		 * ѭ���������ʽԪ������
		 */
		for(int i=0; i< elements.length; i++){
			//�ж��������
			switch(elements[i].charAt(0)){
			case '+':
				//��ջ�еĽ�����������Ϊ���������ߵĽ�����
				exp1 = mExpStack.pop();
				
				//ͬʱ��������������±���һ��Ԫ�ع���Ϊһ�����ֽ�����
				exp2 = new NumExpression(Integer.valueOf(elements[++i]));
				
				//ͨ�������������ֽ���������ӷ����������
				mExpStack.push(new AdditionExpression(exp1, exp2));
				break;
			case '-':
				//��ջ�еĽ�����������Ϊ���������ߵĽ�����
				exp1 = mExpStack.pop();
				
				//ͬʱ��������������±���һ��Ԫ�ع���Ϊһ�����ֽ�����
				exp2 = new NumExpression(Integer.valueOf(elements[++i]));
				
				//ͨ�������������ֽ���������ӷ����������
				mExpStack.push(new SubtractionExpression(exp1, exp2));
				break;
			default://���Ϊ����
				/**
				 * ��������������Ϊ����
				 * �������֣�ֱ�ӹ������ֽ�������ѹ��ջ
				 */
				mExpStack.push(new NumExpression(Integer.valueOf(elements[i])));
				break;
			}
		}
	}
	
	public int calculate(){
		return mExpStack.pop().interpreter();
	}
}
