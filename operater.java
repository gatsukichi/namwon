
public class operater {
	public static void main(String[] args) {
		// +
		// -
		// *
		// / ��
		// % ������������
		// ++ ���� (1������)
		// -- ���� (1����)
		// ���� ����. ������̶�� ������
		// >
		// <
		// >=
		// <=
		// == ������?
		// != �ٸ���?
		// ! ����
		// �� �Ǵ� ���� (true false)
		int a = 1;
//		System.out.println(a);
//		System.out.println(++a);
//		System.out.println(a++);
//		System.out.println(a);
		// prefix �տ��ٴ°� = �����Ѵ� , postfix �ڿ��ٴ°� = ���߿��Ѵ�
		
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
