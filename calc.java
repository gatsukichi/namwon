import java.io.*;

public class calc {
	public static void main (String[] argv) throws IOException {
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ù��° ���ڸ� �Է��ϼ��� :");
		String a = br1.readLine(); // '5' -> 53�ǹ��ϴ� 2���� ǥ���� � ����
		System.out.println("�ι�° ���ڸ� �Է��ϼ��� :");
		String b = br2.readLine(); // '4' -> 52
		int number1 = Integer.parseInt(a); // '5'
		int number2 = Integer.parseInt(b);
		System.out.println("����� " + number1*number2 + " �Դϴ�.");
		//asda
	}
}
