import java.util.Scanner;

public class GetMoneyFromBank {
	
	private static final String localUserName = "haha";
	private static final int localPWD = 123456;
	
	static Scanner sc = new Scanner(System.in);
	
	static int wrongPWD = 0;
	
	static User user = new User();
	
	public static void main(String[] args) {
		getInput();
		if(localUserName.equals(user.userName)  && localPWD == user.passWord) {
			System.out.println("剩余：$" + user.money + ",开始取钱。。。。 " );
			sc.close();
		} else {
			wrongPWD++;
			if(wrongPWD >= 3) {
				System.out.println("尝试次数过多。你的卡完蛋了。");
				sc.close();
			} else {
				System.out.println("密码错误，请重试。");
				getInput();
			}
		}
	}
	
	
	private static void getInput() {
		System.out.println("输入用户名：");
		user.userName = sc.nextLine();
		System.out.println("输入密码：");
		user.passWord = sc.nextInt();
	}
	
	private static class User {
		String userName = "";
		int passWord = 0;
		int money = 889;
	}
	
}


