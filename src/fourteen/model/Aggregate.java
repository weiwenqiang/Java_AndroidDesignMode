package fourteen.model;

public interface Aggregate<T> {
	void add(T obj);
	
	void remove(T obj);
	
	/**
	 * 获取容器的迭代器
	 */
	Iterator<T> iterator();
}
