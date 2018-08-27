package head_first_test;

public class Page_277_Duck {

	private int size;
	
	public static void main(String[] args) {
		// 此处无法打印size和使用 getSize（）,必须静态才可以
		System.out.println("Size of Duck: ");

	}

	public void setSize(int s) {
		this.size = s;
	}
	
	public int getSize() {
		return size;
	}
	
}
