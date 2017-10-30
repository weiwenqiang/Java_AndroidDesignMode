package six.model;

public class ConcreteFactory2 extends AbstractFactory {

	@Override
	public AbstractProductA createProductA() {
		// TODO Auto-generated method stub
		return new ConcreteProductA2();
	}

	@Override
	public AbstractProductB createProductB() {
		// TODO Auto-generated method stub
		return new ConcreteProductB2();
	}

}
