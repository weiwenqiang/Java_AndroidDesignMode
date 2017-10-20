package seventeen;
/**
 * �����н���
 */
public class MainBoard extends Mediator {
	private CDDevice cdDevice;//�����豸
	private CPU cpu;//CPU
	private SoundCard soundCard;//�����豸
	private GraphicsCard graphicsCard;//�Կ��豸
	@Override
	public void changed(Colleague c) {
		if(c == cdDevice){
			//����ǹ�����ȡ������
			handleCD((CDDevice) c);
		}else if(c == cpu){
			//���CPU��ȡ������
			handleCPU((CPU)c);
		}
	}
	/**
	 * ���������ȡ���ݺ��������豸�Ľ���
	 */
	private void handleCD(CDDevice cdDevice){
		cpu.decodeData(cdDevice.read());
	}
	
	/**
	 * ����CPU��ȡ���ݺ��������豸�Ľ���
	 */
	private void handleCPU(CPU cpu){
		soundCard.soundPlay(cpu.getDataSound());
		graphicsCard.videoPlay(cpu.getDataVideo());
	}

	public void setCDDevice(CDDevice cdDevice){
		this.cdDevice = cdDevice;
	}
	
	public void setCPU(CPU cpu){
		this.cpu = cpu;
	}
	
	public void setSoundCard(SoundCard soundCard){
		this.soundCard = soundCard;
	}
	
	public void setGraphicsCard(GraphicsCard graphicsCard) {
		this.graphicsCard = graphicsCard;
	}
}
