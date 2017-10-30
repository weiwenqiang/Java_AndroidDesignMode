package twenty_one.demo;

public class ExpensiveCloth extends PersonCloth {

	public ExpensiveCloth(Person mPerson) {
		super(mPerson);
	}

	private void dressShirt(){
		System.out.println("��������");
	}
	
	private void dressLeather(){
		System.out.println("����Ƥ��");
	}
	
	private void dressJean(){
		System.out.println("����ţ�п�");
	}

	@Override
	public void dressed() {
		super.dressed();
		dressShirt();
		dressLeather();
		dressJean();
	}
	
	
}
