package practice;

import java.util.ArrayList;
import java.util.Arrays;

import ch09_class.FutureStudent;

public class Result05 {

	public static void main(String[] args) {
    //문제 1
    BusinessCard("김휘건","010-6466-4118","logun01@naver.com");
   
    //문제2
   
    ArrayList<String> playlist = new ArrayList<>(Arrays.asList("강 성준", "권 보성", "권 유빈", "김 기찬", "김 대영",
			              "김 동우", "김 동현", "김 명기", "김 영주", "김 유정", 
			              "김 은혜", "김 휘건", "나 항진", "문 성민", "박 진기",
			              "백 현진", "오 정연", "유 하영", "이 예진", "이 용빈", "정 유진"));
     
    
    
       
       
	}

	//문제 1
	public static void BusinessCard(String name, String phone, String email) {
		System.out.println("실행결과");
		System.out.println("================");
		System.out.println("이름: " + name);
		System.out.println("연락처: " + phone);
		System.out.println("이메일: " + email);
		System.out.println("================");
		}
	
	//문제 2
	public static String SearchName(String firstname, ArrayList<String> strArr) {
		ArrayList<String>result = new ArrayList<String>();
		for(int i = 0; i < strArr.size(); i++) {
    		String []temp = strArr.get(i).split(" ");
    		//입력받은 가수와 같으면 담기
    		if(firstname.equals(temp[0])) {
    			result.add(temp[1]);
    			size = userMap.get(userNm).size();
    		}
    	}return result;
		
	}
	
}
