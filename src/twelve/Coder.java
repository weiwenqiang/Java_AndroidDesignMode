package twelve;

import java.util.Observable;
import java.util.Observer;

public class Coder implements Observer {
	public String name;

	
	public Coder(String name) {
		this.name = name;
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("Hi,"+name+", DevTechFrontier更新啦， 内容："+ arg);
	}

	@Override
	public String toString() {
		return "码农：" + name;
	}

	
}
