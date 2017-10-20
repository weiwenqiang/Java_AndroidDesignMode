package eleven.demo;

public class Player {
	public static void main(String[] args) {
		//����Ҫ�ж���˹������Ϸ
		TetrisMachine machine = new TetrisMachine();
		
		//������Ϸ���ǹ���4������
		LeftCommand leftCommand = new LeftCommand(machine);
		RightCommand rightCommand = new RightCommand(machine);
		FallCommand fallCommand = new FallCommand(machine);
		TransformCommand transformCommand = new TransformCommand(machine);
		
		//��ť����ִ�в�ͬ������
		Buttons buttons = new Buttons();
		buttons.setLeftCommand(leftCommand);
		buttons.setRightCommand(rightCommand);
		buttons.setFallCommand(fallCommand);
		buttons.setTransformCommand(transformCommand);
		
		buttons.toLeft();
		buttons.toRight();
		buttons.fall();
		buttons.transform();
	}
}
