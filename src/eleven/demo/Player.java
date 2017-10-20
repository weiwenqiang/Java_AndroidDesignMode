package eleven.demo;

public class Player {
	public static void main(String[] args) {
		//首先要有俄罗斯方块游戏
		TetrisMachine machine = new TetrisMachine();
		
		//根据游戏我们构造4中命令
		LeftCommand leftCommand = new LeftCommand(machine);
		RightCommand rightCommand = new RightCommand(machine);
		FallCommand fallCommand = new FallCommand(machine);
		TransformCommand transformCommand = new TransformCommand(machine);
		
		//按钮可以执行不同的命令
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
