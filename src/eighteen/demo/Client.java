package eighteen.demo;

import java.lang.reflect.Proxy;

public class Client {
	public static void main(String[] args) {
		//构造一个小民
		ILawsuit xiaomin = new XiaoMin();
		//构造一个动态代理
		DynamicProxy proxy = new DynamicProxy(xiaomin);
		//获取被代理类小民的ClassLoader
		ClassLoader loader = xiaomin.getClass().getClassLoader();
		//动态构造一个代理者律师
		ILawsuit lawyer = (ILawsuit) Proxy.newProxyInstance(loader, new Class[]{ILawsuit.class}, proxy);
		//代理律师工作
		lawyer.submit();
		lawyer.burden();
		lawyer.defend();
		lawyer.finish();
	}
}
