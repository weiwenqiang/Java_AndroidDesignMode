package eleven.model;

public class Invoker {
	private Command command;//����һ������Ӧ������������
	
	public Invoker(Command command){
		this.command = command;
	}
	
	public void action(){
		//���þ����������ط�����ִ�о�������
		command.execute();
	}
}
