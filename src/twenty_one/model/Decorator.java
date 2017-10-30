package twenty_one.model;

public abstract class Decorator extends Component {
	private Component component;//持有一个Component对象的引用

	public Decorator(Component component) {
		super();
		this.component = component;
	}

	@Override
	public void operate() {
		component.operate();
	}
}
