package head_first_test;

public class Page_328_TestExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "yes";
		try {
			System.out.println("start try");
			doRisky(test);
			System.out.println("end try");
		} catch (RuntimeException e) {
			System.out.println("catch exception");
		} finally {
			System.out.println("finally");
		}
	}

	static void doRisky(String test) throws RuntimeException {
		System.out.println("start risky");
		if ("yes".equals(test)) {
			throw new RuntimeException();
		}
		System.out.println("end risky");
		return;
	}
}
