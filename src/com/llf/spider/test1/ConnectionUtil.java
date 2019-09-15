package com.llf.spider.test1;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;

import com.llf.spider.utils.RandomEnum;
import com.llf.spider.utils.UserAgent;

public class ConnectionUtil {
	
	public static String Connect(String address) {
		HttpURLConnection conn = null;
		URL url = null;
		InputStream in = null;
		BufferedReader reader = null;
		StringBuffer stringBuffer = null;
		try {
			// 给url设置代理方法
			// 加入到url.openConnection(proxy);
			// Proxy proxy = new Proxy(Proxy.Type.HTTP,new InetSocketAddress("176.93.133.144",8080));
			
			url = new URL(address);
			conn = (HttpURLConnection) url.openConnection();
			conn.setConnectTimeout(5000);
			conn.setReadTimeout(5000);
			conn.setDoInput(true);
			
			// 添加User-agent
			conn.addRequestProperty("User-Agent", RandomEnum.random(UserAgent.class).getValue());
			
			conn.connect();
			in = conn.getInputStream();
			reader = new BufferedReader(new InputStreamReader(in));
			stringBuffer = new StringBuffer();
			String line = null;
			while ((line = reader.readLine()) != null) {
				stringBuffer.append(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			conn.disconnect();
			try {
				in.close();
				reader.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return stringBuffer.toString();
	}
	
}
