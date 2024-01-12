package ch08_collection;

import java.util.HashSet;

public class LottoMain {

	public static void main(String[] args) {
		//user 희망하는 로또 수량을 입력받아 수량만큼 만들어주세요.
		//lotto 번호는 1~45 (중복 x) 6개 번호
		System.out.println(makeLotto());
		System.out.println(makeLotto());
		System.out.println(makeLotto());
		System.out.println(makeLotto());
        
		//
		HashSet<Integer>userNum = new HashSet<>();
		userNum.add(2);
		userNum.add(12);
		//사용자가 입력한 번호를 포함시켜 lotto 번호 생성
		
		
	}
     //lotto 생성 매서드 생성
	 //input x
	 //output : 생성번호 6개
	public static HashSet<Integer> makeLotto(){
		HashSet<Integer>lotto = new HashSet<>();
		while(lotto.size() < 6) {
			int randInt = (int)(Math.random()*45 + 1);
			lotto.add(randInt);
			
		}
		return lotto;
		
	}
	public static HashSet<Integer> makeLotto(HashSet<Integer> userNum){
		HashSet<Integer>lotto = new HashSet<>();
		while(lotto.size() < 6) {
			int randInt = (int)(Math.random()*45 + 1);
			lotto.add(randInt);
		}
		return lotto;
		
	}

}