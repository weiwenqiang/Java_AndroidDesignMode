package five.model;

public abstract class Factory {
	/**
	 * ���󹤳�����
	 * ��������ʲô������ȥʵ��
	 */
	public abstract <T extends Product> T createProduct(Class<T> clz);
}
