public class JavaSplitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String process = "option:wash,rinse,spin,dry;processing:wash";

		String process1 = "option:dry;processing:invalid";
		
		String processes = (process.split(";"))[0];

		// for (String a : processes) {
		// System.out.println("a: " + a);
		// }

		String middleProcess = (processes.split(":"))[1];

		System.out.println(middleProcess);

		if (middleProcess.contains("wash")) {
			System.out.println("YES");
		}

	}

}
