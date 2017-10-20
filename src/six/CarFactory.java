package six;

public abstract class CarFactory {
	//������̥
	public abstract ITire createTire();
	//����������
	public abstract IEngine createEngine();
	//�����ƶ�ϵͳ
	public abstract IBrake createBrake();
}
