package nineteen;

import java.util.ArrayList;
import java.util.List;

public abstract class Dir {
	//����һ��List��Ա�����洢�ļ����µ�����Ԫ��
	protected List<Dir> dirs = new ArrayList<>();
	private String name;//��ǰ�ļ����ļ�����
	public Dir(String name) {
		super();
		this.name = name;
	}

	public abstract void addDir(Dir dir);
	
	public abstract void rmDir(Dir dir);
	
	public abstract void clear();
	
	public abstract void print();
	
	public abstract List<Dir> getFiles();
	
	public String getName(){
		return name;
	}
}
