package nine.model;

public abstract class AbstractRequest {
	private Object obj;//�������
	
	public AbstractRequest(Object obj){
		this.obj = obj;
	}
	
	/**
	 * ��ȡ��������ݶ���
	 */
	public Object getContent(){
		return obj;
	}
	
	public abstract int getRequestLevel();
}
