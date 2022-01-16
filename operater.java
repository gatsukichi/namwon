
public class operater {
	public static void main(String[] args) {
		// +
		// -
		// *
		// / 몫
		// % 나머지연산자
		// ++ 증가 (1을더함)
		// -- 감소 (1을뺌)
		// 값이 나옴. 결과값이라는 존재함
		// >
		// <
		// >=
		// <=
		// == 같은지?
		// != 다른지?
		// ! 부정
		// 참 또는 거짓 (true false)
		int a = 1;
//		System.out.println(a);
//		System.out.println(++a);
//		System.out.println(a++);
//		System.out.println(a);
		// prefix 앞에붙는거 = 먼저한다 , postfix 뒤에붙는거 = 나중에한다
		
		int b = 2;
//		a = a + b; //14
//		System.out.println(a); // 14
//		a+=b;
//		System.out.println(a); // 23
//		a-=b;
//		System.out.println(a); // 14
//		a= a - b; // 5
//		System.out.println(a); // 5
//		
//		a = a * b;
//		a *= b;
		
//		a = a / b;
//		a /= b;
//		
//		a = a%b;
//		a %= b;
		
		int result;
		
		result = (((a * b) + ((a % b) / b)) - a); 
		// 12 % 10  <= 2
		// 12 % 2  <= 0
		// 12 / 10 <= 1...2
		// 12 / 5 <= 2...2
		System.out.println(result); 
	}
}
