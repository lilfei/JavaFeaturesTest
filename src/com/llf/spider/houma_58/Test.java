package com.llf.spider.houma_58;

public class Test {

	public static void main(String[] args) {

		String url1 = "https://linfen.58.com/houma/ershoufang/pn1/?PGTID=0d30000c-0162-7a13-ce78-5b336677594d&ClickID=1";
		String url2 = "https://linfen.58.com/houma/ershoufang/pn3/?PGTID=0d30000c-0162-70a3-d4f0-0320ff38134f&ClickID=1";
		String url3 = "https://linfen.58.com/houma/ershoufang/pn4/?PGTID=0d30000c-0162-76d0-e0a8-ef0cda637098&ClickID=1";
		AnalyzeHouse58.regexMain(url1);
//		System.out.println(result);
//		for (int i = 0; i < 20; i++) {
//			UserAgent agent = RandomEnum.random(UserAgent.class);
//			System.out.println(agent.getIntValue() + "," + agent.getValue());
//		}
	}

}
