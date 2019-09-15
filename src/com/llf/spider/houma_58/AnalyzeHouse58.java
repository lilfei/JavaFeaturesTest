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
		
//		System.out.println("htmlStr: " + htmlStr);
		
		// 提取房源list
		Pattern listPattern = Pattern.compile("<ul class='house-list-wrap'>.*<!-- 分页 begin-->");
		Matcher listMatcher = listPattern.matcher(html);
		while (listMatcher.find()) {
			String houseList = listMatcher.group();
		}
		
		return html;
	}

	private static String readFile() {
		FileInputStream is;
		StringBuffer sb = new StringBuffer();
		try {
			is = new FileInputStream("fileOut.html");
			InputStreamReader reader = new InputStreamReader(is, "UTF-8");
			while(reader.ready()) {
				sb.append((char)reader.read());
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
		byte bt[] = new byte[1024];
		bt = result.getBytes();
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
