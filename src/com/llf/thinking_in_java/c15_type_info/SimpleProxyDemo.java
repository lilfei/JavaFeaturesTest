package com.llf.thinking_in_java.c15_type_info;

interface ISimpleProxyDemo {
	void doSomething();

	void somethingElse(String arg);
}

class RealObject implements ISimpleProxyDemo {

	@Override
	public void doSomething() {
		System.out.println("doSomething");
	}

	@Override
	public void somethingElse(String arg) {
		System.out.println("somethingElse " + arg);
	}

}

class SimpleDemo implements ISimpleProxyDemo {

	private ISimpleProxyDemo proxied;

	public SimpleDemo(ISimpleProxyDemo i) {
		this.proxied = i;
	}

	@Override
	public void doSomething() {
		System.out.println("simpleDemo doSomething");
		proxied.doSomething();
	}

	@Override
	public void somethingElse(String arg) {
		System.out.println("simpleDemo somethingElse " + arg);
		proxied.somethingElse(arg);
	}

}

/**
 * 代理的使用
 * 
 * @author llf
 * @date 2020年11月11日
 */
public class SimpleProxyDemo {

	public static void consumer(ISimpleProxyDemo i) {
		i.doSomething();
		i.somethingElse("bonobo");
	}

	public static void main(String[] args) {
		consumer(new RealObject());
		consumer(new SimpleDemo(new RealObject()));
	}

}
