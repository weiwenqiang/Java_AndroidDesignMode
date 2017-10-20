package nineteen;

import java.util.ArrayList;
import java.util.List;
/**
 * 具体枝干节点
 */
public class Composite extends Component{
	//存储节点的容器
	private List<Component> components = new ArrayList<Component>();

	public Composite(String name) {
		super(name);
	}

	@Override
	public void doSomething() {
		System.out.println(name);
		if(null != components){
			for(Component c : components){
				c.doSomething();
			}
		}
	}

	public void addChild(Component child){
		components.add(child);
	}
	
	public void removeChild(Component child){
		components.remove(child);
	}
	
	public Component getChildren(int index){
		return components.get(index);
	}
}
