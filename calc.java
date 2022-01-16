import java.io.*;

public class calc {
	public static void main (String[] argv) throws IOException {
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("첫번째 숫자를 입력하세요 :");
		String a = br1.readLine(); // '5' -> 53의미하는 2진수 표현된 어떤 저장
		System.out.println("두번째 숫자를 입력하세요 :");
		String b = br2.readLine(); // '4' -> 52
		int number1 = Integer.parseInt(a); // '5'
		int number2 = Integer.parseInt(b);
		System.out.println("결과는 " + number1*number2 + " 입니다.");
		
	}
}
