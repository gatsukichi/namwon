
public class foraa {
	public static void main(String[] args) {
//		for(int i=2;i<10;i++) { // 10번 
//			for(int j=1;j<10;j++) {
//				System.out.println(i + "*" +j + "=" + (i*j)); // "2*1=2"
//				
//			}
//		}
		int sum = 0;
		int i = 0 ; //iterator 반복자? 반복하는놈, i,j,k,l,m,n .. 
		while(true) { // true - false
			i++; // i에 1을 누적하세요.
			sum += i; // 누적,
			System.out.println(i); //1 2 3 4 5 6 7 8 9 10
			if(i>9) {
				break;
			}
		}
		System.out.println(sum);
	}
}
