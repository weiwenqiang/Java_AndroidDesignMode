package nine.demo;

public class GroupLeader extends Leader {

	@Override
	public int limit() {
		// TODO Auto-generated method stub
		return 1000;
	}

	@Override
	public void handle(int money) {
		System.out.println("�鳤��������" + money + "Ԫ");
	}
}
