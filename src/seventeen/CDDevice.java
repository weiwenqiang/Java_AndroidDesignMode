package seventeen;
/**
 * ����ͬ��
 */
public class CDDevice extends Colleague {
	private String data;//��Ƶ����
	
	public CDDevice(Mediator mediator) {
		super(mediator);
	}

	public String read(){
		return data;
	}
	
	public void load(){
		//ʵ���������Ƶ��������Ƶ���ݶ���һ����������
		data = "��Ƶ����,��Ƶ����";
		
		//֪ͨ�н��� Ҳ�����������ݸı�
		mediator.changed(this);
	}
}
