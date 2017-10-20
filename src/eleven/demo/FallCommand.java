package eleven.demo;

public class FallCommand implements Command {
	private TetrisMachine machine;
	
	public FallCommand(TetrisMachine machine){
		this.machine = machine;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		machine.fastToBottom();
	}

}
