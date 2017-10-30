package twenty_one.model;

public class ConcreteDecoratorB extends Decorator {

	public ConcreteDecoratorB(Component component) {
		super(component);
	}

	@Override
	public void operate() {
		operateA();
		super.operate();
		operateB();
	}
	
	public void operateA(){
		System.out.println("Bʵ��-װ�η���A");
	}
	
	public void operateB(){
		System.out.println("Bʵ��-װ�η���B");
	}
}
