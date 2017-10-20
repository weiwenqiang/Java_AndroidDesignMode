package nineteen;

import java.util.ArrayList;
import java.util.List;

public abstract class Dir {
	//声明一个List成员变量存储文件夹下的所有元素
	protected List<Dir> dirs = new ArrayList<>();
	private String name;//当前文件或文件夹名
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
