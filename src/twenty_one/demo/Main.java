package twenty_one.demo;

public class Main {
	public static void main(String[] args) {
		Person person = new Boy();
		
		PersonCloth clothCheap = new CheapCloth(person);
		clothCheap.dressed();
		
		PersonCloth clothExpensive = new ExpensiveCloth(person);
		clothExpensive.dressed();
	}
}
