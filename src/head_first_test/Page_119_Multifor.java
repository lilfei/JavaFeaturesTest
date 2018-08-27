package head_first_test;

// page 119
public class Page_119_Multifor {
	public static void main(String[] args) {
		for(int x=0;x<4;x++) {
			for(int y=4;y>2;y--) {
				System.out.println(x + " " + y);
			}
			if(x == 1) {
				x++;
			}
		}
	}
}
