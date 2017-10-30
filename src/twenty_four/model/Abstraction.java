package twenty_four.model;

public abstract class Abstraction {
	private Implementor mImplementor;

	/**
	 * 通过实现部分对象的引用构造抽象部分的对象
	 * @param mImplementor
	 */
	public Abstraction(Implementor mImplementor) {
		super();
		this.mImplementor = mImplementor;
	}
	
	/**
	 * 通过调用实现部分具体的方法实现具体的功能
	 */
	public void operation(){
		mImplementor.operationImpl();
	}
}
