package nine.demo;

public class Director extends Leader {

	@Override
	public int limit() {
		// TODO Auto-generated method stub
		return 10000;
	}

	@Override
	public void handle(int money) {
		System.out.println("������������"+money +"Ԫ");
	}

}
