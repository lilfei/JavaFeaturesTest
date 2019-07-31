package com.llf.javaTest;

import java.util.Arrays;

public class StageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] stages = new String[] { "invalid", "invalid", "invalid", "invalid" };
		String process = "option:dry;processing:invalid";
		process = "option:dry;processing:dry";
		String currentProcess = "invalid";
		if (process.startsWith("option") && process.contains("processing")) {
			if (!process.contains(";")) {
				System.out.println("0: " + Arrays.toString(stages));
			}

			String processes = (process.split(";"))[0];
			if (!processes.contains(":")) {
				System.out.println("1: " + processes);
				System.out.println("2: " + Arrays.toString(stages));
			}

			String middleProcess = (processes.split(":"))[1];
			if (!middleProcess.contains(","))
				System.out.println("3: " + Arrays.toString(stages));

			String[] strArr = middleProcess.split(",");
			if (strArr.length < 1)
				System.out.println("4: " + Arrays.toString(stages));

			for (String str : strArr) {
				if (str.equals("wash")) {
					stages[0] = "wash";
				}
				if (str.equals("rinse")) {
					stages[1] = "rinse";
				}
				if (str.equals("spin")) {
					stages[2] = "spin";
				}
				if (str.equals("dry")) {
					stages[3] = "dry";
				}
			}
		}

		System.out.println("5: " + Arrays.toString(stages));

	}

}
