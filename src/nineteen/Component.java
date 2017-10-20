package nineteen;
/**
 * 抽象根节点
 */
public abstract class Component {
	protected String name;//节点名

	public Component(String name) {
		super();
		this.name = name;
	}
	
	public abstract void doSomething();
	
	public abstract void addChild(Component child);
	
	public abstract void removeChild(Component child);
	
	public abstract Component getChildren(int index);
}
