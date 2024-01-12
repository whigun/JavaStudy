package practice;

import java.util.Scanner;



public class Result04 {

	public static void main(String[] args) {
		
		//1~50 사이의 랜덤한 수 생성
		//문제 1
//		
//		int chance = 5;
//		int randInt = (int)(Math.random()*50+1);
//		while(true) {
//		   Scanner scan = new Scanner(System.in);
//		   System.out.println("숫자를 입력해주세요: ");
//		   int nm = Integer.parseInt(scan.nextLine());
//			
//			if(chance == 0) { 
//				System.out.println("실패하였습니다. 정답은 "+ randInt+ "입니다.");
//				break;
//		   }else if(nm == randInt) {
//			   System.out.println("정답입니다.");
//			   break;
//		   }
//			if(nm < randInt) {
//			   System.out.println("업!! 기회가"+ (chance - 1)+ "번 남았습니다.");
//		   }else if(nm > randInt) {
//			   System.out.println("다운!! 기회가"+ (chance - 1)+ "번 남았습니다.");
//		   }
//			  chance--; 
//			  
//		   }
	        
	     //문제 2
		   
		   
		   System.out.println("========엘리베이터========");
		   
		   int EA = (int)(Math.random()*10+1);
		   int EB = (int)(Math.random()*10+1);
		  
           System.out.println("승강기의 A의 현재 위치: " + EA);
		   System.out.println("승강기의 B의 현재 위치: " + EB);
		   
		   Scanner sc = new Scanner(System.in);
		   System.out.println("몇층에 계시나요?[종료는 q 또는 exit]:");
		   
		   String floor1 = sc.nextLine();	   
		   if(floor1.equals("q")||floor1.equals("exit")) {
			   System.out.println("프로그램을 종료합니다");
		   }else {int floor = Integer.parseInt(floor1);
		   int a = floor-EA;
		   int b = floor-EB;
		         if(Math.abs(a) > Math.abs(b)) {
			   System.out.println("엘리베이터 B가 "+floor+"층으로 이동하였습니다.");
		   }else if(Math.abs(a) < Math.abs(b)) {
			   System.out.println("엘리베이터 A가 "+floor+"층으로 이동하였습니다.");
		   }else if( Math.abs(a)== Math.abs(b) ){ 
			         if(EA > EB) {
			          System.out.println("엘리베이터 A가 "+floor+"층으로 이동하였습니다.");
			          }else if (EA < EB) {
			          System.out.println("엘리베이터 B가 "+floor+"층으로 이동하였습니다.");  
			          }
		       }
		    }
         }
	 }

		  

		  
		   
		   
		   
		   
		   
		   
			   
		   
		   
		   
		   
			   
			   
		   
		
