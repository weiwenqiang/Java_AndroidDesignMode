package twenty_one.model;

public class ConcreteDecoratorA extends Decorator {

	public ConcreteDecoratorA(Component component) {
		super(component);
	}

	@Override
	public void operate() {
		operateA();
		super.operate();
		operateB();
	}
	
	public void operateA(){
		System.out.println("Aʵ��-װ�η���A");
	}
	
	public void operateB(){
		System.out.println("Aʵ��-װ�η���B");
	}
}
