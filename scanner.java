import java.util.*;

public class scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 1500;
		System.out.println("과자는"+a+" 원 입니다.");
		System.out.println("할인금액 을 입력하세요.");
		double d = sc.nextDouble();
		System.out.println("과자는 "+(a-d) + "입니다.");
	}
	
}
