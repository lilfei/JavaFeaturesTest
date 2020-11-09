package com.llf.thinking_in_java.c9_interface;

class A {

	interface B {
		void bf();
	}

	public class BImp implements B {

		@Override
		public void bf() {

		}

	}

	private class BImp2 implements B {

		@Override
		public void bf() {

		}

	}

	public interface C {
		void cf();
	}

	class CImp implements C {

		@Override
		public void cf() {

		}

	}

	private class CImp2 implements C {

		@Override
		public void cf() {

		}

	}

	// 只能被 A域内使用，
	private interface D {
		void df();
	}

	private class DImp implements D {

		@Override
		public void df() {

		}

	}

	public class DImp2 implements D {

		@Override
		public void df() {

		}

	}

	public D getD() {
		return new DImp2();
	}

	private D dRef;

	public void receiveD(D d) {
		dRef = d;
		dRef.df();
	}
}

interface E {
	interface G {
		void gf();
	}

	public interface H {
		void hf();
	}

	void ef();
}

/**
 * 接口嵌套
 * 
 * @author llf
 * @date 2020年11月9日
 */
public class P336 {

	public class BImp implements A.B {

		@Override
		public void bf() {

		}

	}

	class CImp implements A.C {

		@Override
		public void cf() {

		}

	}

	// 不可以实现一个私有接品
//	class DImp implements A.D{
//		
//	}

	class EImp implements E {

		@Override
		public void ef() {

		}

	}

	// 可以在接口上再嵌套接口
	class EGImp implements E.G {

		@Override
		public void gf() {

		}

	}

	class EImp2 implements E {

		@Override
		public void ef() {

		}

		class EG implements E.G {

			@Override
			public void gf() {

			}

		}
	}

	public static void main(String[] args) {
		A a = new A();
		A a2 = new A();
		a2.receiveD(a.getD());
	}

}
