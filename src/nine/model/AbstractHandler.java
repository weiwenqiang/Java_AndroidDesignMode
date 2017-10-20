package nine.model;

public abstract class AbstractHandler {
	//��һ�ڵ��ϵĴ����߶���
	protected AbstractHandler nextHandler;
	
	public final void handleRequest(AbstractRequest request){
		//�жϵ�ǰ�����߶���Ĵ������Ƿ��������ߵĴ�����һ��
		if(getHandleLevel() == request.getRequestLevel()){
			//һ�����ɸô��������
			handle(request);
		}else{
			//���򽫸��������ת������һ���ڵ��ϵ��������
			if(nextHandler != null){
				nextHandler.handleRequest(request);
			}else{
				//�����д����߶�������ܴ��������ʱ���
				System.out.println("All of handler can not handle the request.");
			}
		}
	}
	
	/**
	 * ��ȡ�����߶���Ĵ�����
	 */
	protected abstract int getHandleLevel();
	
	/**
	 * ÿ�������߶���ľ��崦��ʽ
	 */
	protected abstract void handle(AbstractRequest request);
}
