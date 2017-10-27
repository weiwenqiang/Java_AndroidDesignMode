package eighteen.demo;

import java.lang.reflect.Proxy;

public class Client {
	public static void main(String[] args) {
		//����һ��С��
		ILawsuit xiaomin = new XiaoMin();
		//����һ����̬����
		DynamicProxy proxy = new DynamicProxy(xiaomin);
		//��ȡ��������С���ClassLoader
		ClassLoader loader = xiaomin.getClass().getClassLoader();
		//��̬����һ����������ʦ
		ILawsuit lawyer = (ILawsuit) Proxy.newProxyInstance(loader, new Class[]{ILawsuit.class}, proxy);
		//������ʦ����
		lawyer.submit();
		lawyer.burden();
		lawyer.defend();
		lawyer.finish();
	}
}
