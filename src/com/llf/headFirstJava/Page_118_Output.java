package com.llf.headFirstJava;

public class Page_118_Output {

	public static void main(String[] args) {
		Page_118_Output o = new Page_118_Output();
		o.go();

	}

	void go() {
		int y = 7;
		for(int x=1;x<8;x++) {
			y++;
			if(x>4) {
				System.out.print(++y + " ");
			}
			if(y>14) {
				System.out.print("x = " + x);
				break;
			}
		}
	}
}
