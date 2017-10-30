package five.model;

public class Client {
	public static void main(String[] args) {
		Factory factory = new ConcreteFactory();
		Product p = factory.createProduct(ConcreteProductB.class);
		p.method();
	}
}
