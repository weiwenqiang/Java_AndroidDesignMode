package eighteen.model;

public class ProxySubject extends Subject {
	private RealSubject mSubject;//������ʵ���������
	
	
	public ProxySubject(RealSubject mSubject) {
		super();
		this.mSubject = mSubject;
	}


	@Override
	public void visit() {
		//ͨ����ʵ�������õĶ��������ʵ�����е��߼�����
		mSubject.visit();
	}

}
