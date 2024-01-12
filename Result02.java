package practice;


import java.util.Scanner;

public class Result02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("국어 점수를 입력해주세요.");
		System.out.println(">>> ");
		String kor = scan.nextLine();
		int score1 = Integer.parseInt(scan.nextLine());
		System.out.println("영어 점수를 입력해주세요.");
		System.out.println(">>> ");
		String eng = scan.nextLine();
		int score2 = Integer.parseInt(scan.nextLine());
		System.out.println("수학 점수를 입력해주세요.");
		System.out.println(">>> ");
		String math = scan.nextLine();
		int score3 = Integer.parseInt(scan.nextLine());
		int aver = (score1 + score2 +score3)*(1/3) ;
		String grade = "" ;
		if (aver >=90 ) {
			    grade = "A";
			}else if(score1 >= 80) {
				grade = "B";
			}else if(score1 >= 80) {
				grade = "C";
			}else {
				grade = "D";
			}
		System.out.printf("등급: %d 등급", grade);
	}

}
