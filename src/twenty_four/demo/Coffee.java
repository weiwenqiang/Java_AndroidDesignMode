package twenty_four.demo;

public abstract class Coffee {
	protected CoffeeAdditives impl;

	public Coffee(CoffeeAdditives impl) {
		super();
		this.impl = impl;
	}
	/**
	 * ���Ⱦ�����ʲô�������������
	 */
	public abstract void makeCoffee();
}
