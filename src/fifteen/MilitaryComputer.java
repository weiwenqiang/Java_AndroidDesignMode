package fifteen;

public class MilitaryComputer extends AbstractComputer {

	@Override
	protected void checkHardware() {
		super.checkHardware();
		System.out.println("���Ӳ������ǽ");
	}

	@Override
	protected void login() {
		super.login();
		System.out.println("����ָ��ʶ��ȸ��ӵ��û���֤");
		
	}
	
}
