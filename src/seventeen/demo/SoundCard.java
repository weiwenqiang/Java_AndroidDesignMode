package seventeen.demo;
/**
 * ����ͬ��
 */
public class SoundCard extends Colleague {

	public SoundCard(Mediator mediator) {
		super(mediator);
	}

	public void soundPlay(String data){
		System.out.println("��Ƶ��"+data);
	}
}
