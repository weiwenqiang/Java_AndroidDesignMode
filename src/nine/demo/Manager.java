package nine.demo;

public class Manager extends Leader {

	@Override
	public int limit() {
		// TODO Auto-generated method stub
		return 5000;
	}

	@Override
	public void handle(int money) {
		System.out.println("������������"+money +"Ԫ");
	}

}
