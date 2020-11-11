package com.llf.thinking_in_java.c15_type_info;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

class DynamicProxyHandler implements InvocationHandler {
	private Object proxied;

	public DynamicProxyHandler(Object proxied) {
		this.proxied = proxied;
	}

	/**
	 * 此处可以过滤你需要的方法
	 * 如方法名，参数等
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("proxy: " + proxy.getClass() + ", method: " + method + ", args: " + args);

		if (args != null) {
			for (Object arg : args) {
				System.out.println("arg: " + arg);
			}
		}
		return method.invoke(proxied, args);
	}
}

/**
 * 使用Proxy.newProxyInstance()动态代理
 * 可以在代理中过滤一些你想要的方法
 * @author llf
 * @date 2020年11月11日
 */
public class SimpleDynamicProxy {

	public static void consumer(ISimpleProxyDemo i) {
		i.doSomething();
		i.somethingElse("hahaha");
	}

	public static void main(String[] args) {
		RealObject real = new RealObject();
		consumer(real);
		ISimpleProxyDemo proxy = (ISimpleProxyDemo) Proxy.newProxyInstance(ISimpleProxyDemo.class.getClassLoader(), new Class[] { ISimpleProxyDemo.class }, new DynamicProxyHandler(real));
		consumer(proxy);
	}

}
