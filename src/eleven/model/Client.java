package eleven.model;

public class Client {
	public static void main(String[] args) {
		//����һ�������߶���
		Receiver receiver = new Receiver();
		
		//���ݽ����߶�����һ���������
		Command command = new ConcreteCommand(receiver);
		
		//���ݾ���Ķ�����һ���������
		Invoker invoker = new Invoker(command);
		
		//ִ�����󷽷�
		invoker.action();
	}
}
