package twenty_four.demo;

public class LargeCoffee extends Coffee {

	public LargeCoffee(CoffeeAdditives impl) {
		super(impl);
	}

	@Override
	public void makeCoffee() {
		System.out.println("´ó±­µÄ" + impl + "¿§·È");
	}

}
