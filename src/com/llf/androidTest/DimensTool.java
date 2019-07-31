package com.llf.androidTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DimensTool {

	/** 源文件 单位统一dp */
	// C:\MyFile\JNTV\app\src\main\res\values\dimens.xml
//	static String oldFilePath = "D:/dimens.xml"; // sw540
	static String oldFilePath = "C:/MyFile/JNTV/app/src/main/res/values/dimens.xml";
	/** 新生成文件路径 */
//	static String filePath1080 = "D:/values-sw1080dp/dimens.xml";
	static String filePath1080 = "C:/MyFile/JNTV/app/src/main/res/values-sw1080dp/dimens.xml";
	
//	static String filePath811 = "D:/values-sw811dp/dimens.xml";
	static String filePath811 = "C:/MyFile/JNTV/app/src/main/res/values-sw811dp/dimens.xml";
	
//	static String filePath720 = "D:/values-sw720dp/dimens.xml";
	static String filePath720 = "C:/MyFile/JNTV/app/src/main/res/values-sw720dp/dimens.xml";
	
//	static String filePath540 = "D:/values-sw540dp/dimens.xml";
	static String filePath540 = "C:/MyFile/JNTV/app/src/main/res/values-sw540dp/dimens.xml";
	
//	static String filePath480 = "D:/values-sw480dp/dimens.xml"; 
	static String filePath480 = "C:/MyFile/JNTV/app/src/main/res/values-sw480dp/dimens.xml"; 

	/** 缩小倍数 */
	// 参数设定
	static double change1080 = 148d / 300d;
	static double change811 = 148d / 225d;
	static double change720 = 148d / 198d; // 除数
	static double change540 = 148d / 148d;
	static double change480 = 148d / 130d;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 生成1-1920px
		// String allPx= getAllPx();
		// DeleteFolder(oldFilePath);
		// writeFile(oldFilePath, allPx);
		// String st = convertStreamToString(oldFilePath, change811);
		// DeleteFolder(filePath720);
		writeFile(filePath1080, convertStreamToString(oldFilePath, change1080));
		writeFile(filePath811, convertStreamToString(oldFilePath, change811));
		writeFile(filePath720, convertStreamToString(oldFilePath, change720));
		writeFile(filePath540, convertStreamToString(oldFilePath, change540));
		writeFile(filePath480, convertStreamToString(oldFilePath, change480));
		
		// DeleteFolder(filePath672);
		// writeFile(filePath672, st);
		// String st1 = convertStreamToString(oldFilePath, 1f);
		// DeleteFolder(filePath1080);
		// writeFile(filePath1080, st1);
	}

	/** 读取文件 生成缩放后字符串 */
	public static String convertStreamToString(String filepath, double f) {
		StringBuilder sb = new StringBuilder();
		try {
			BufferedReader bf = new BufferedReader(new FileReader(filepath));
			String line = null;
			System.out.println("q1");
			String endmark = "dp</dimen>";
			String startmark = ">";
			while ((line = bf.readLine()) != null) {
				if (line.contains(endmark)) {
					int end = line.lastIndexOf(endmark);
					int start = line.indexOf(startmark);
					String stdp = line.substring(start + 1, end);
					double dp = Double.valueOf(stdp);
					int newpx = (int) Math.round(dp / f);
					String s = String.valueOf(dp);
					String ss = String.valueOf(newpx);
					String ll = line.toString();
					System.out.println(ll);
					String newline = line.substring(0, start + 1) + ss + endmark;

					// String newline = line.replace(s, ss);
					sb.append(newline + "\r\n");
					System.out.println(sb.toString());
				} else {
					sb.append(line + "\r\n");
				}
			}
			System.out.println(sb.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}

	/**
	 * 根据路径删除指定的目录或文件，无论存在与否
	 *
	 * @param sPath 要删除的目录或文件
	 * @return 删除成功返回 true，否则返回 false。
	 */
	public static boolean DeleteFolder(String sPath) {
		File file = new File(sPath);
		// // 判断目录或文件是否存在
		if (!file.exists()) { // 不存在返回 false
			return true;
		} else {
			// 判断是否为文件
			if (file.isFile()) { // 为文件时调用删除文件方法
				return deleteFile(sPath);
			} else { // 为目录时调用删除目录方法
				// return deleteDirectory(sPath);
			}
		}
		return false;
	}

	/** 存为新文件 */
	public static void writeFile(String filepath, String st) {
		try {
			FileWriter fw = new FileWriter(filepath);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(st);
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 生成全部文件
	 * 
	 * @return
	 */
	public static String getAllPx() {
		StringBuilder sb = new StringBuilder();
		try {
			sb.append("<resources>" + "\r\n");
			sb.append("<dimen name=\"screen_width\">1920dp</dimen>" + "\r\n");
			sb.append("<dimen name=\"screen_height\">1080dp</dimen>" + "\r\n");
			for (int i = 1; i <= 1920; i++) {
				System.out.println("i=" + i);
				sb.append("<dimen name=\"dp" + i + "\">" + i + "dp</dimen>" + "\r\n");
			}
			sb.append("</resources>" + "\r\n");
			System.out.println(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sb.toString();
	}

	/**
	 * 删除单个文件
	 *
	 * @param sPath 被删除文件的文件名
	 * @return 单个文件删除成功返回true，否则返回false
	 */
	public static boolean deleteFile(String sPath) {
		boolean flag = false;
		File file = new File(sPath);
		// 路径为文件且不为空则进行删除
		if (file.isFile() && file.exists()) {
			file.delete();
			flag = true;
		}
		return flag;
	}
}
