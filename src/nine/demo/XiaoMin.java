package nine.demo;

public class XiaoMin {
	public static void main(String[] args) {
		GroupLeader groupLeader = new GroupLeader();
		Director director = new Director();
		Manager manager = new Manager();
		Boss boss = new Boss();
		//������һ���쵼�����߶���
		groupLeader.nextHandler = director;
		director.nextHandler = manager;
		manager.nextHandler = boss;
		
		//����������
		groupLeader.handleRequest(50000);
	}
}
