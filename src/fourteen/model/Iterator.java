package fourteen.model;

public interface Iterator<T> {
	/**
	 * �Ƿ�����һ��Ԫ��
	 */
	boolean hasNext();
	
	/**
	 * ���ص�ǰλ�õ�Ԫ�ز���λ��������һλ
	 */
	T next();
}
