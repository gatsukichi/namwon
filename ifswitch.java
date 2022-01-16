import java.util.*;

public class ifswitch {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("통신사를 입력하세요 (skt:1, kt:2, lg:3)");
		int score =  sc.nextInt();
		//if
		if(score>=90) {
			System.out.println("A입니다.");
		}else if(score>=80) {
			System.out.println("B입니다.");
		}else {
			System.out.println("탈락입니다.");
		}
		sc.n
		String aa = sc.nextLine();
		System.out.println("A"+aa);
		String bb = sc.nextLine();
		System.out.println("B"+bb);
		String cc = sc.nextLine();
		System.out.println("C"+cc);
		
		//switch
//		switch(score) {
//		case 1:
//			System.out.println("노답입니다.");
//			break;
//		case 2:
//			System.out.println("빠릅니다.");
//			break;
//		case 3:
//			System.out.println("모니텁 니다.");
//			break;
//		default:
//			System.out.println("잘못된 값을 집어넣으셨습니다.");
//			break;
//				
//		}
		//
	}
}


// 문제 제목 : 계산기 만들기

// 문제 조건 : 조건문 사용하기 (if추천,switch)

// 첫번째 숫자를 입력하세요. (변수명 number1)
// 3
// 두번째 숫자를 입력하세요. (변수명 number2)
// 4
// 연산자를 입력하세요.(더하기:1,빼기:2,곱하기:3,나누기:4)
// 3
// 결과는 : 12 입니다.




