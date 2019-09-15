package com.llf.spider.houma_58;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.llf.spider.test1.ConnectionUtil;

public class AnalyzeHouse58 {

	public static String regexMain(String url) {
//		String result = ConnectionUtil.Connect(url);
		String result = "123";
		return getHouseInfo(result);
	}

	private static String getHouseInfo(String result) {
//		writeFile(result);

		String html = readFile();

		// Jsoup解析html
		Document doc = Jsoup.parse(html);

		int i = 0;

		// 获取list列表
		Elements listEle = doc.getElementsByClass("house-list-wrap");
		for (Element ele : listEle) {
			// 获取每个单独数据
			Elements listLi = ele.getElementsByTag("li");
			for (Element e : listLi) {
				// 解析数据内容
				i++;
				System.out.println("====================================================== " + i);
//				System.out.println(e.text());
				Elements pic = e.getElementsByClass("pic");
				System.out.println("pic： " + pic.text());

				Elements listInfos = e.getElementsByClass("list-info");
//				System.out.println("listInfo: " + listInfos.text());
				for (Element listInfo : listInfos) {
					Elements title = listInfo.getElementsByClass("title");
					System.out.println("标题: " + title.text());

					Elements baseInfos = listInfo.getElementsByClass("baseinfo");
					for (Element baseInfo : baseInfos) {
						System.out.println("具体信息： " + baseInfo.text());
					}

					Elements jjrinfo = listInfo.getElementsByClass("jjrinfo");
					System.out.println("房源： " + jjrinfo.text());
				}

				Elements price = e.getElementsByClass("price");
				System.out.println("价格: " + price.text());

				Elements time = e.getElementsByClass("time");
				System.out.println("更新时间: " + time.text());
			}
		}

		return "";
	}

	private static String readFile() {
		FileInputStream is;
		StringBuffer sb = new StringBuffer();
		try {
			is = new FileInputStream("fileOut.html");
			InputStreamReader reader = new InputStreamReader(is, "UTF-8");
			while (reader.ready()) {
				sb.append((char) reader.read());
			}
			reader.close();
			is.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}

	private static void writeFile(String result) {
		System.out.println(result);
		File file = new File("fileOut.html");
//		byte bt[] = new byte[1024];
//		bt = result.getBytes();
		try {
			FileOutputStream os = new FileOutputStream(file);
			OutputStreamWriter writer = new OutputStreamWriter(os, "UTF-8");
			writer.append(result);
			writer.close();
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
