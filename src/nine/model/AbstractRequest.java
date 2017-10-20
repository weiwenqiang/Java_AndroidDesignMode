package nine.model;

public abstract class AbstractRequest {
	private Object obj;//处理对象
	
	public AbstractRequest(Object obj){
		this.obj = obj;
	}
	
	/**
	 * 获取处理的内容对象
	 */
	public Object getContent(){
		return obj;
	}
	
	public abstract int getRequestLevel();
}
