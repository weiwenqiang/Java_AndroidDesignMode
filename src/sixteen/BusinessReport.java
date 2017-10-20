package sixteen;

import java.util.LinkedList;
import java.util.List;

public class BusinessReport {
	List<Staff> mStaffs = new LinkedList<Staff>();

	public BusinessReport() {
		mStaffs.add(new Manager("������"));
		mStaffs.add(new Engineer("����ʦ-Shawn.Xiong"));
		mStaffs.add(new Engineer("����ʦ-Kael"));
		mStaffs.add(new Engineer("����ʦ-Chaossss"));
		mStaffs.add(new Engineer("����ʦ-Tiiime"));
	}
	
	public void showReport(Visitor visitor){
		for(Staff staff : mStaffs){
			staff.accept(visitor);
		}
	}
}
