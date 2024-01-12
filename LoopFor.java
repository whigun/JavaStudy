package ch05_controll;

public class LoopFor {

	public static void main(String[] args) {
		int num = 1;
		System.out.println(num++);
		System.out.println(num++);
		System.out.println(num++);
		System.out.println(num++);
		System.out.println(num++);
		System.out.println(num++);
		System.out.println("=======for문=======");
        //for문
		//(1초기화식; 2조건시기 ;4증감식
		for(int i = 1; i<=10; i++) {
			//3 실행문
			System.out.println(i);
		}
		//1~20 까지 더하기
        int sum = 0;
		for(int i=1 ; i <=20; i++) {
			System.out.println(i);
			sum +=i;
		}
		System.out.println("1~20을 더하면:"+sum);
		//21부터 45까지 더하기
		int sum1 = 0;
		for(int i=21; i<=45; i++) {
			System.out.println(i);
			sum1 +=i;
		}
		System.out.println("21~45을 더하면:"+sum1);
		
		//1부터 40까지 중에 짝수만 더한 값을 출력하시오!
		int sum2 = 0;
		//1. 1~40 for 작성
			for(int i=1; i<=40; i++) {
		//2. 조건 짝수일 경우 더하기
			   if(i%2 ==0) {
				   System.out.println(i);
				   sum2 +=i;
				  }
			
	}
			//3. 최종 출력
	System.out.println("1~40까지 중 짝수만 더하면:"+sum2);
	    int sum4=0;
	    for (int i= 0; i<=40; i+=2) {
	    	System.out.println("i값:"+i);
	    	sum4 +=i;
	    }
	    System.out.println("1~40까지 중 짝수만 더하면:"+sum4);
	    //for문을 이용해서 구구단 2단을 출력하시오.
	    int dan =2;
	    System.out.printf("구구단 %d 단 \n", dan);
	    for (int i= 1; i<=9; i++){
	    	System.out.printf("%d x %d = %d \n", dan, i, dan*i);
	    	
	}
	    //2~9단 출력
	    for (int i= 2; i<=9; i++){
	    	System.out.printf(i + "단");
	    	for (int j= 2; j<=9; j++){
	    		System.out.printf("%d x %d=%d \n", i ,j, i*j);
	    	}
	     }
	    System.out.println("*");
	    System.out.println("**");
	    System.out.println("***");
	    System.out.println("****");
	    System.out.println("*****");
	    String star = "";
	    for(int i=0; i<5; i++) {
	    	star+="*";
	    	System.out.println(star);
	    }
	    //10부터 1까지 출력
	    for(int i = 10; i>=1; i--) {
	    	System.out.println(i);
	    }
	    
	    //break 문
	    //반복문 내에서 break문이 실행되면 "해당 반복문"을 즉시 종료
	    int sum5 = 0;
	    for(int i =1; i <9999; i++) {
	    	sum5 += i;
	    	if(sum5 >= 100) {
	    		System.out.println("100이상이 되는 n:"+i);
	    		break;
	    	}
	    }
	    
	    //continue
	    for(int i=1; i<=10; i++) {
	    	if(i % 2 ==0) {
	    		continue; //continue를 만나면 건너뜀(아래명령문을)
	    	}
	    	System.out.println(i);
	    }
	    //구구단 출력 2~9단
	    //단 5단, 8단 제외
	    for (int i= 2; i<=9; i++){
	    	if(i == 5 || i == 8)
	        continue;
            System.out.printf(i + "단");
	    	for (int j= 2; j<=9; j++){
	    		System.out.printf("%d x %d=%d \n", i ,j, i*j);}
	    }	
	   //국수공장에서 면을 100cm 뽑고 있는데 5cm 마다 잘라줘야 합니다.
	    for(int i=0; i <100; i ++) {
	    	System.out.println("|||||||||");
	    	if(i % 5 == 4) {
	    		System.out.println("--------");
	    	}
	    	
	    }
	    
	    }
	    }
	    

