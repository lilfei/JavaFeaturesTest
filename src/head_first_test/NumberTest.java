package head_first_test;

public class NumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strArray = new String[] { "111", "222", "333", "444" };

//		for (int i = 0; i < strArray.length; i++) {
//			System.out.println(i + "," + strArray[i]);
//		}

		try {
			if (strArray[4] != null) {
				System.out.println("hahaha");
			}
		} catch (Exception e) {
			System.out.println("hahaha" + e.toString());
		}

		System.out.println("gegege");
	}

}
