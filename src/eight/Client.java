package eight;

public class Client {
	public static void main(String[] args) {
		TvController tvController = new TvController();
		//���ÿ���״̬
		tvController.powerOn();
		//��һƵ��
		tvController.nextChannel();
		//��������
		tvController.turnUp();
		//���ùػ�״̬
		tvController.powerOff();
		//������������ʱ������Ч
		tvController.turnUp();
	}
}
