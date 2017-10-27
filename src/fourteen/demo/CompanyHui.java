package fourteen.demo;

import java.util.ArrayList;
import java.util.List;

public class CompanyHui implements Company {
	private Employee[] array = new Employee[3];

	public CompanyHui() {
		array[0] = new Employee("�Ը�", 108, "��", "����Գ");
		array[1] = new Employee("С��", 98, "��", "����Գ");
		array[2] = new Employee("С��", 88, "��", "����Գ");
	}

	public Employee[] getArray() {
		return array;
	}

	@Override
	public Iterator iterator() {
		return new HuiIterator(array);
	}

}
