package fourteen.demo;

import java.util.List;

public class Boss {
	public static void main(String[] args) {
//		CompanyMin min = new CompanyMin();
//		List<Employee> minList = min.getList();
//		for(int i = 0; i < minList.size(); i++){
//			System.out.println(minList.get(i).toString());
//		}
//		
//		CompanyHui hui = new CompanyHui();
//		Employee[] huiList = hui.getArray();
//		for(int i = 0; i < huiList.length; i++){
//			System.out.println(huiList[i]);
//		}
		
		CompanyMin min = new CompanyMin();
		check(min.iterator());
		CompanyHui hui = new CompanyHui();
		check(hui.iterator());
	}
	
	private static void check(Iterator iterator){
		while(iterator.hasNext()){
			System.out.println(iterator.next().toString());
		}
	}
}
