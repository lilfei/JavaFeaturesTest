package com.llf.thinking_in_java.c15_type_info;

class Candy {
	static {
		System.out.println("Loading Candy");
	}
}

class Gum {
	static {
		System.out.println("Loading Gum");
	}
}

class Cookie {
	static {
		System.out.println("Loading Cookie");
	}
}

public class P557 {

	public static void main(String[] args) {
		System.out.println("inside main");
		new Candy();
		System.out.println("After creating Candy");
		try {
			/**
			 * 第一行代码在源码上使用效果暂时与第三行代码相同 
			 * className路径要写全,不写全会找不到
			 * class.isInstance(obj)效果上与instanceof相近
			 */
			
			Class.forName("com.llf.thinking_in_java.c15_type_info.Gum");
//			Class.forName("com.llf.thinking_in_java.c15_type_info.Gum", true, ClassLoader.getSystemClassLoader());
//			Class.forName("com.llf.thinking_in_java.c15_type_info.Gum", true, P557.class.getClassLoader());
		} catch (ClassNotFoundException e) {
			System.out.println("Coundn`t find Gum");
		}
		System.out.println("After creating Gum");
		new Cookie();
		System.out.println("After creating Cookie");
	}

}
