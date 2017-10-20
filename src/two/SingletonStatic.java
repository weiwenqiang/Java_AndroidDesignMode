package two;

public class SingletonStatic {
	private SingletonStatic(){}
	public static SingletonStatic getInstance(){
		return SingletonHolder.sInstance;
	}
	/**
	 * ¾²Ì¬ÄÚ²¿Àà
	 */
	private static class SingletonHolder{
		private static final SingletonStatic sInstance = new SingletonStatic();
	}
}
