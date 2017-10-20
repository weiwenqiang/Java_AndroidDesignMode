package eighteen;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * 动态代理类
 */
public class DynamicProxy implements InvocationHandler {
	private Object obj;//被代理的类的引用
	
	public DynamicProxy(Object obj) {
		this.obj = obj;
	}
	
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		//调用被代理类对象的方法
		Object result = method.invoke(obj, args);
		return result;
	}


}
