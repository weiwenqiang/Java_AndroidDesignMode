package twelve;

import java.util.Observable;

public class DevTechFrontier extends Observable {
	public void postNewPublication(String content){
		//��ʶ״̬�������ݷ����ı�
		setChanged();
		//֪ͨ���й۲���
		notifyObservers(content);
	}
}
