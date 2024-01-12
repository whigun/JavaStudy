package ch05_controll;

import java.util.Scanner;

public class ch05_Ex02 {

	public static void main(String[] args) {
		// 메뉴를 입력받아 가격을 출력(switch사용)
		// 아아 or 아이스 아메리카노 : 3000
		// 라떼 :4500
		// 에스프레소 : 2500
		// 위의 메뉴로 입력하면 "입력 메뉴 000은 000원 입니다." 출력
		//   없는 메뉴면 "000은 저희 매장에 없는 메뉴입니다." 출력
		int salePrice =0;
		Scanner scan = new Scanner(System.in);
		System.out.println("메뉴를 주문하세요");
		System.out.println(">>> ");
		String menu = scan.nextLine();
		switch(menu) {
		    case "아아":
		    case "아이스 아메리카노":
		    	System.out.println("아메");
		    	salePrice=3000;
		    	break;
		    case "라떼":
		    	System.out.println("아메");
		    	salePrice=3000;
		    	break;
		    case "에스프레소":
		    	System.out.println("아메");
		    	salePrice=3000;
		    	break;
		    default:
		    	System.out.println("%d은 저희 매장에 없는 메뉴입니다.." );
		    	break;
		    	
		    	
		    
		}
	}

}
