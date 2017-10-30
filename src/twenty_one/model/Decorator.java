package twenty_one.model;

public abstract class Decorator extends Component {
	private Component component;//����һ��Component���������

	public Decorator(Component component) {
		super();
		this.component = component;
	}

	@Override
	public void operate() {
		component.operate();
	}
}
