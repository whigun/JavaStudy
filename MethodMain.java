package ch06_mathod;

import java.security.PublicKey;

/**
 * Class Name   : MethodMain
 * Author       : Logun
 * Created Date : 2024. 1. 8.
 * version      : 1.0
 * Purpose      : Method study
 * Desciption   : java의 함수 method
 */
public class MethodMain {

	public static void main(String[] args) {
		//method(메소드) 클래스나 객체에 종속된 함수
		//java는 모두 class에 작성되기 때문에 함수를 메소드라 부름
		//1~100 까지 더하면 결과는?
		//1~50 까지 더하면 결과는?
		//30~60 까지 더하면 결과는?
		int sum = 0;
		for(int i=1; i <= 100; i ++) {
			sum +=i;
		}
		System.out.println(sum);
        //메소드 실행
		printSum(1, 100);
		printSum(1, 50);
		printSum(30, 60);
		int res = returnSum(1, 30);
		System.out.println("리턴 받은 값:" + res);
		print(MyAbs(-15));
		//printSum("30", "60"); //오류 input 타입이 맞지 않음
		//메소드 생성
		//[접근 제어자 static] 리턴타입 메소드명(파라미터){}
		print("hi");
	}
		public static void printSum(int from, int to) {
			int sum = 0;
			for(int i=from; i <= to; i ++) {
				sum +=i;
			}
			System.out.printf("from : %d 부터 to : %d 까지 합은: %d \n", from, to, sum);
			
		}
		public static int returnSum(int from, int to) {
			int sum = 0;
			for(int i=from; i <= to; i ++) {
				sum +=i;
			}
			return sum;
	}
		public static void print(String msg) {
			System.out.println(msg);
		}
		//메소드 오버로딩 동일한 이름의 메소드를 다른 입력과, 리턴으로 정의할 수 있음.
		public static void print(int msg) {
			System.out.println(msg);
		}
		//정수를 입력받아 절대값을 정수형으로 리턴하는 메소드를 작성하시오 !
		public static int MyAbs (int num) {
			if(num<0) { 
				num*=-1;
			}
		    return num;
			}
		
		}

		


