package com.llf.javaTest.proxyTest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;

public class ProxyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class clazzProxy1 = Proxy.getProxyClass(Collection.class.getClassLoader(), Collection.class);
		System.out.println(clazzProxy1.getName());

		System.out.println("===== constructor begin =====");
		Constructor[] constructors = clazzProxy1.getConstructors();
		for (Constructor constructor : constructors) {
			String name = constructor.getName();
			StringBuilder sb = new StringBuilder(name);
			sb.append("(");
			Class[] classParams = constructor.getParameterTypes();
			for (Class classParam : classParams) {
				sb.append(classParam.getName()).append(",");
			}
			if(classParams != null && classParams.length != 0) {
				sb.deleteCharAt(sb.length() - 1);
			}
			sb.append(")");
			System.out.println(sb.toString());
		}
		System.out.println("====== constructor end ======");
		
		System.out.println("===== method begin =====");
		Method[] methods = clazzProxy1.getMethods();
		for (Method method : methods) {
			String name = method.getName();
			StringBuilder sb = new StringBuilder(name);
			sb.append("(");
			Class[] classParams = method.getParameterTypes();
			for (Class classParam : classParams) {
				sb.append(classParam.getName()).append(",");
			}
			if(classParams != null && classParams.length != 0) {
				sb.deleteCharAt(sb.length() - 1);
			}
			sb.append(")");
			System.out.println(sb.toString());
		}
		System.out.println("====== method end ======");
	}

}
