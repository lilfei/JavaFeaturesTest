package com.llf.javaTest.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ListTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Hello");
		list.add("World");
		list.add("HAHAHAHA");
		// 第一种遍历方法使用 For-Each 遍历 List
		for (String str : list) { // 也可以改写 for(int i=0;i<list.size();i++) 这种形式
			System.out.println(str);
		}

		// 第二种遍历，把链表变为数组相关的内容进行遍历
		String[] strArray = new String[list.size()];
		list.toArray(strArray);
		for (int i = 0; i < strArray.length; i++) // 这里也可以改写为 for(String str:strArray) 这种形式
		{
			System.out.println(strArray[i]);
		}

		// 第三种遍历 使用迭代器进行相关遍历
		Iterator<String> ite = list.iterator();
		while (ite.hasNext())// 判断下一个元素之后有值
		{
			System.out.println(ite.next());
		}

		// 第四种遍历forEach
		list.forEach((item) -> {
			System.out.println("list item: " + item);
		});
		list.forEach(System.out::println);
		list.stream().filter(s->s.contains("H")).forEach(System.out::println);
		
		// 并行（parallel）程序
		// filter 获取空字符串的数量
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		int count = (int) strings.parallelStream().filter(string -> string.isEmpty()).count();
		System.out.println(count);
		
		// Collectors 类实现了很多归约操作
		List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		System.out.println("筛选列表: " + filtered);
		String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
		System.out.println("合并字符串: " + mergedString);
		
		// 统计
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();
		System.out.println("列表中最大的数 : " + stats.getMax());
		System.out.println("列表中最小的数 : " + stats.getMin());
		System.out.println("所有数之和 : " + stats.getSum());
		System.out.println("平均数 : " + stats.getAverage());
	}

}
