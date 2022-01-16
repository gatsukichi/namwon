import java.io.*;


public class variable {
	public static void main(String[] args) throws IOException{
		int a = 5;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("나이를 입력하세요 :");
		
		String str = br.readLine();
		
		System.out.println("나는 승길 나이는 " + str + "입니다.");
	}
}
