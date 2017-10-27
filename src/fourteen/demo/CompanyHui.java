package fourteen.demo;

import java.util.ArrayList;
import java.util.List;

public class CompanyHui implements Company {
	private Employee[] array = new Employee[3];

	public CompanyHui() {
		array[0] = new Employee("»Ô¸ç", 108, "ÄĞ", "³ÌĞòÔ³");
		array[1] = new Employee("Ğ¡ºì", 98, "ÄĞ", "³ÌĞòÔ³");
		array[2] = new Employee("Ğ¡»Ô", 88, "ÄĞ", "³ÌĞòÔ³");
	}

	public Employee[] getArray() {
		return array;
	}

	@Override
	public Iterator iterator() {
		return new HuiIterator(array);
	}

}
