package eleven.demo;

public class LeftCommand implements Command {
	//����һ�������߶���˹������Ϸ�����Ӧ��
	private TetrisMachine machine;
	
	public LeftCommand(TetrisMachine machine){
		this.machine = machine;
	}
	
	@Override
	public void execute() {
		//������Ϸ����ľ��巽��ִ�в���
		machine.toLeft();
	}

}
