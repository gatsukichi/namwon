import java.io.*;


public class variable {
	public static void main(String[] args) throws IOException{
		int a = 5;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("���̸� �Է��ϼ��� :");
		
		String str = br.readLine();
		
		System.out.println("���� �±� ���̴� " + str + "�Դϴ�.");
	}
}
