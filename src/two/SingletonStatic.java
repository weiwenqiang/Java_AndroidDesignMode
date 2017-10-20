package two;

public class SingletonStatic {
	private SingletonStatic(){}
	public static SingletonStatic getInstance(){
		return SingletonHolder.sInstance;
	}
	/**
	 * ��̬�ڲ���
	 */
	private static class SingletonHolder{
		private static final SingletonStatic sInstance = new SingletonStatic();
	}
}
