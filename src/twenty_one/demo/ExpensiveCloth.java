package twenty_one.demo;

public class ExpensiveCloth extends PersonCloth {

	public ExpensiveCloth(Person mPerson) {
		super(mPerson);
	}

	private void dressShirt(){
		System.out.println("´©¼þ¶ÌÐä");
	}
	
	private void dressLeather(){
		System.out.println("´©¼þÆ¤ÒÂ");
	}
	
	private void dressJean(){
		System.out.println("´©¼þÅ£×Ð¿ã");
	}

	@Override
	public void dressed() {
		super.dressed();
		dressShirt();
		dressLeather();
		dressJean();
	}
	
	
}
