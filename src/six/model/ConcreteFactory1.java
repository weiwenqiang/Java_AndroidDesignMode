package six.model;

public class ConcreteFactory1 extends AbstractFactory {

	@Override
	public AbstractProductA createProductA() {
		// TODO Auto-generated method stub
		return new ConcreteProductA1();
	}

	@Override
	public AbstractProductB createProductB() {
		// TODO Auto-generated method stub
		return new ConcreteProductB1();
	}

}
