package practice;

public class Result01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 1문제
		String name = "홍길동";
		int age = 26;
		float height = 177.9f;
		String nm = "010-7398-7332";
		String email="gildong@gmail.com";
		System.out.println("이름: " + name +"\n나이: " +age + "\n키: "+height +"\n연락처: "+nm +"\n이메일: "+email 
				);
		
		// 2문제
		String enigma = "너오구늘리뭐너먹구지리" ;
		String enigma1 =(enigma.replace("너",""));
		String enigma2 =(enigma1.replace("구",""));
		String enigma3 =(enigma2.replace("리",""));
		System.out.println("1차 암호 해독 [너 제거]:" + enigma1);
		System.out.println("2차 암호 해독 [구 제거]:" + enigma2);
		System.out.println("3차 암호 해독 [리 제거]:" + enigma3);
		System.out.println("해독완료!! -> 오늘뭐먹지" );
		
		// 3문제
		//ex)String to int -> Interger.parseInt()
		//   int to String -> Interger.toString();
		int example = 278;
		
		String ex = example + "";
		
		String str1 = (ex.substring(0,1));
		String str2 = (ex.substring(1,2));
		String str3 = (ex.substring(2,3));
	    
		int result = Integer.parseInt(str1)+Integer.parseInt(str2)+Integer.parseInt(str3) ;
		System.out.println(result);
	}

}
