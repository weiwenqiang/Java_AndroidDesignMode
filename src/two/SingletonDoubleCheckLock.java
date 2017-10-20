package two;
//Ë«ÖØËøµ¥Àý
public class SingletonDoubleCheckLock {
	private static SingletonDoubleCheckLock sInstance = null;
	private SingletonDoubleCheckLock(){
		
	}
	
	public void doSomething(){
		System.out.println("do sth.");
	}
	
	public static SingletonDoubleCheckLock getInstance(){
		if(sInstance == null){
			synchronized (SingletonDoubleCheckLock.class) {
				if(sInstance ==null){
					sInstance = new SingletonDoubleCheckLock();
				}
			}
		}
		return sInstance;
	}
}
