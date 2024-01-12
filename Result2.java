package practice;

import java.util.Scanner;

public class Result2 {

	public static void main(String[] args) {

		// 문제 1
//		{
//			Scanner scan = new Scanner(System.in);
//
//			System.out.println("국어 점수를 입력해주세요.");
//			System.out.println(">>> ");
//
//			double score1 = Integer.parseInt(scan.nextLine());
//
//			System.out.println("영어 점수를 입력해주세요.");
//			System.out.println(">>> ");
//
//			double score2 = Integer.parseInt(scan.nextLine());
//
//			System.out.println("수학 점수를 입력해주세요.");
//			System.out.println(">>> ");
//
//			double score3 = Integer.parseInt(scan.nextLine());
//
//			double aver = (score1 + score2 + score3) / 3;
//			System.out.println("평균:" + aver);
//			String grade = "";
//			if (aver >= 90) {
//				grade = "A";
//			} else if (aver >= 80) {
//				grade = "B";
//			} else if (aver >= 70) {
//				grade = "C";
//			} else {
//				grade = "D";
//			}
//			System.out.printf("등급: %s 등급", grade);
//		}
//	
	
	// 문제2
    int pac = 1;
	for(int i = 1;i<=10;i++)
	{pac *=i;
     }     	
	 {System.out.printf("결과: %s", pac );  }     	
	        	
	long pac1 = 1;
	for(int j = 1; j<=15; j++)
	{pac1 *=j;
	}
	{System.out.printf("결과: %s", pac1 );  }
	 
	
	//문제 3
	String findWally = "“윌리울리일리울리울리일리월리일리윌리월리울리일리일리월리일리윌리일리윌리일리월리월리윌리울리윌리울리일리울리울리윌리일리";
	//1 문자열 길이 이용
	int all = findWally.length();
	int after = findWally.replaceAll("월리", "").length();
	System.out.println((all-after)/2);
	//2 동일한 문자열 수
	int cnt  = 0;
	for(int i = 0; i<findWally.length()-1; i++) {
		String subWally = findWally.substring(i, i+2);
		if(subWally.equals("월리")) {
			cnt +=1;
		}
	}
	System.out.println("월리는"+cnt);
	
	//문제 4
	String star = "*****";
	for (int i =  5; i>0; i--) {
		String subStar = star.substring(0, i);
		System.out.println(subStar);
	}
	
	
	}  
	
}
