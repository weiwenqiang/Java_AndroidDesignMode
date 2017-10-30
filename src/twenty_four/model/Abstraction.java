package twenty_four.model;

public abstract class Abstraction {
	private Implementor mImplementor;

	/**
	 * ͨ��ʵ�ֲ��ֶ�������ù�����󲿷ֵĶ���
	 * @param mImplementor
	 */
	public Abstraction(Implementor mImplementor) {
		super();
		this.mImplementor = mImplementor;
	}
	
	/**
	 * ͨ������ʵ�ֲ��־���ķ���ʵ�־���Ĺ���
	 */
	public void operation(){
		mImplementor.operationImpl();
	}
}
