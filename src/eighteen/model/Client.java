package eighteen.model;

public class Client {
	public static void main(String[] args) {
		//����һ����ʵ�������
		RealSubject real = new RealSubject();
		
		//ͨ����ʵ���������һ���������
		ProxySubject proxy = new ProxySubject(real);
		
		//���ô������ط���
		proxy.visit();
	}
}
