package twenty_one.demo;

public class CheapCloth extends PersonCloth {

	public CheapCloth(Person mPerson) {
		super(mPerson);
	}

	private void dressShorts(){
		System.out.println("��������");
	}
	
	@Override
	public void dressed() {
		super.dressed();
		dressShorts();
	}
	
	
}
