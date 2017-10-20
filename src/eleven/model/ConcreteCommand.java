package eleven.model;

public class ConcreteCommand implements Command {
	private Receiver receiver;//����һ���Խ����߶��������
	
	public ConcreteCommand(Receiver receiver){
		this.receiver = receiver;
	}
	
	@Override
	public void execute() {
		//���ý����ߵ���ط�����ִ�о����߼�
		receiver.action();
	}

}
