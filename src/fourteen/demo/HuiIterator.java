package fourteen.demo;

import java.util.List;

public class HuiIterator implements Iterator {
	private Employee[] array;
	private int position;


	public HuiIterator(Employee[] array) {
		super();
		this.array = array;
	}

	@Override
	public boolean hasNext() {
		return !(position > array.length - 1 || array[position] == null);
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		Employee e = array[position];
		position++;
		return e;
	}

}
