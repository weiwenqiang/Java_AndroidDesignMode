package fourteen.demo;

import java.util.List;

public class MinIterator implements Iterator {
	private List<Employee> list;
	private int position;

	public MinIterator(List<Employee> list) {
		super();
		this.list = list;
	}

	@Override
	public boolean hasNext() {
		return !(position > list.size() - 1 || list.get(position) == null);
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		Employee e = list.get(position);
		position++;
		return e;
	}

}
