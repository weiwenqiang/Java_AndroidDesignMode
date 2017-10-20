package eleven.demo;

public class TransformCommand implements Command {
	private TetrisMachine machine;
	
	public TransformCommand(TetrisMachine machine){
		this.machine = machine;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		machine.transform();
	}

}
