package ch09_class;

import ch09_class.commons.UtilClass;

/**
 * Class Name   : Student
 * Author       : Logun
 * Created Date : 2024. 1. 12.
 * version      : 1.0
 * Purpose      : class study
 * Desciption   : 학생 객체
 */
public class Student {
     // 1.필드 변수 선언
	 //캡슐화 적용 (다른 곳에서 변경안되도록 접근제어자를 private으로 만듦)
	 private String name; 
	 private int kor; 
	 private int eng; 
	 private int math; 
	 private double avg;
	 
	 
	 public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		setAvg();
	}
	// 생성자
	 // 아래와 같이 () 매개변수가 없는 생성자는 new Student()로 생성할 수 있음.
	 public Student(){
	 }
	 // 매개변수가 있는 생성자 new Student("팽수"); 와 같이 인스턴스화 할수 있음.
	 public Student(String nm) {
		 this.name = nm;
	}
	 public void setname(String name) {
		 this.name = name;
	 }
	 public String getName() {
		 return name;//this.name과 같음
	 }
	 private void check() {//private은 클래스 내부에서만 사용가능 전체적으로 사용시 -> public으로 변경
		 System.out.println(this.name + "출석!");
	 }
	 //shift + alt + s
	 //생성자 or setter, getter or toString
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
		setAvg();
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
		setAvg();
	}
	public int getMath() {
		return math;
		
	}
	public void setMath(int math) {
		this.math = math;
		setAvg();
	}
    private void setAvg() {
    	avg = UtilClass.weRound((this.kor + this.eng + this.math)/3.0 ,1);
		
	} 
    public double getAvg() {
    	return avg;
		
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", avg=" + avg + "]";
	}
	
}
