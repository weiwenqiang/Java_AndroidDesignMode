package fourteen.model;

public interface Aggregate<T> {
	void add(T obj);
	
	void remove(T obj);
	
	/**
	 * ��ȡ�����ĵ�����
	 */
	Iterator<T> iterator();
}
