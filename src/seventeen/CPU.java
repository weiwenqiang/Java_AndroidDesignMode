package seventeen;
/**
 * CPUͬ��
 */
public class CPU extends Colleague {
	private String dataVideo, dataSound;// ��Ƶ����Ƶ����

	public CPU(Mediator mediator) {
		super(mediator);
	}

	public String getDataVideo() {
		return dataVideo;
	}

	public String getDataSound() {
		return dataSound;
	}

	public void decodeData(String data) {
		// �ָ�������Ƶ����
		String[] tmp = data.split(",");

		// ����������Ƶ����
		dataVideo = tmp[0];
		dataSound = tmp[1];

		// �����н�������״̬�ı�
		mediator.changed(this);
	}
}
