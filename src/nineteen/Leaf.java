package nineteen;
/**
 * ����Ҷ�ӽڵ�
 */
public class Leaf extends Component {

	public Leaf(String name) {
		super(name);
	}

	@Override
	public void doSomething() {
		System.out.println(name);
	}

	@Override
	public void addChild(Component child) {
		throw new UnsupportedOperationException("Ҷ��û���ӽڵ�");
	}

	@Override
	public void removeChild(Component child) {
		throw new UnsupportedOperationException("Ҷ��û���ӽڵ�");
	}

	@Override
	public Component getChildren(int index) {
		throw new UnsupportedOperationException("Ҷ��û���ӽڵ�");
	}

}
