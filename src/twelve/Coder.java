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
		System.out.println("Hi,"+name+", DevTechFrontier�������� ���ݣ�"+ arg);
	}

	@Override
	public String toString() {
		return "��ũ��" + name;
	}

	
}
