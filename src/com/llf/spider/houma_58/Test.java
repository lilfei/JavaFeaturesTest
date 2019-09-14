package com.llf.spider.houma_58;

import com.llf.spider.test1.ConnectionUtil;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url1 = "https://linfen.58.com/houma/ershoufang/pn1/?PGTID=0d30000c-0162-7a13-ce78-5b336677594d&ClickID=1";
		String url2 = "https://linfen.58.com/houma/ershoufang/pn2/?PGTID=0d30000c-0162-7781-834b-84fd713fb93b&ClickID=1";
		String rul3 = "https://linfen.58.com/houma/ershoufang/pn3/?PGTID=0d30000c-0162-7a13-ce78-5b336677594d&ClickID=1";
		String result = ConnectionUtil.Connect(url1);
		System.out.println(result);
	
	}

}
