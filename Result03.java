package practice;

import java.util.Scanner;

public class Result03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("각도: ");
		
		int eg1 = Integer.parseInt(scan.nextLine());
		String bn="";
		    int random = (eg1%360);
			
			if(random >= 0 && random <60) {
				 bn= "사탕";
			}else if(random >= 60 && random < 120 ) {
				bn = "초콜릿";
			}else if(random >= 120 && random < 180) {
				bn = "쿠키";
			}else if(random >= 180 && random < 240 ) {
				bn = "콜라";
			}else if(random >= 240 && random < 300) {
				bn = "아이스크림";
			}else if(random >= 300 && random < 360) {
				bn = "커피";
			}
			
			System.out.println(bn);
			
		
			//문제 2
			Scanner sc = new Scanner(System.in);
			System.out.println("거꾸로 뒤집을 문자열: ");
			String reverse = sc.nextLine();
			String sa = "";
			for(int i + reverse.length(); i > 0 i --) {
				sa += }
			}
			
	        //문제 3
	}
    
