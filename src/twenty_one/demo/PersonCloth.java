package twenty_one.demo;

public abstract class PersonCloth extends Person {
	protected Person mPerson;

	public PersonCloth(Person mPerson) {
		super();
		this.mPerson = mPerson;
	}

	@Override
	public void dressed() {
		mPerson.dressed();
	}
}
