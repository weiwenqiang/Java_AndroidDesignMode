package twenty_four.demo;

public abstract class Coffee {
	protected CoffeeAdditives impl;

	public Coffee(CoffeeAdditives impl) {
		super();
		this.impl = impl;
	}
	/**
	 * 咖啡具体是什么样的由子类决定
	 */
	public abstract void makeCoffee();
}
