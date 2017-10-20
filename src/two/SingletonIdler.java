package two;
//ÀÁººÄ£Ê½
public class SingletonIdler {
	private static SingletonIdler instance;
	
	private SingletonIdler(){}
	
	public static synchronized SingletonIdler getInstance(){
		if(instance == null){
			instance = new SingletonIdler();
		}
		return instance;
	}
	
}
