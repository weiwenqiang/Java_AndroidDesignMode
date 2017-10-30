package twenty_one.model;

public class Client {
	public static void main(String[] args) {
		// ���챻װ�ε��������
		Component component = new ConcreteComponent();

		// �������������װ���߶���A�����ã���ʱ�ڸ������������װ����A�Ĺ��ܷ���
		Decorator decorator = new ConcreteDecoratorA(component);
		decorator.operate();

		// �������������װ���߶���B�����ã���ʱ�ڸ������������װ����A�Ĺ��ܷ���
		Decorator decoratorB = new ConcreteDecoratorB(component);
		decoratorB.operate();
	}
}
