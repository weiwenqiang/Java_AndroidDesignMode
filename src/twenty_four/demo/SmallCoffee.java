package twenty_four.demo;

public class SmallCoffee extends Coffee {

	public SmallCoffee(CoffeeAdditives impl) {
		super(impl);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeCoffee() {
		System.out.println("Ð¡±­µÄ" + impl + "¿§·È");
	}

}
