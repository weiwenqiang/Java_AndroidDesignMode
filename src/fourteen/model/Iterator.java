package fourteen.model;

public interface Iterator<T> {
	/**
	 * 是否还有下一个元素
	 */
	boolean hasNext();
	
	/**
	 * 返回当前位置的元素并将位置移至下一位
	 */
	T next();
}
