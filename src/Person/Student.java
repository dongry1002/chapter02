package Person;

public class Student extends Person {
	
	public Student(){
		System.out.println("Student()이 콜");
		
	}
	
	public Student(String name){
		//명시하지 않으면 기본생성자가 자동으로 호출
		//super();
		
		super(name);
		System.out.println("Student(String)이 콜");
	
		//부모생성자를 명시할 경우에는 반드시 맨앞에 한다.super();
	}
	
	
	
	public void test(){
		//부모의 public속성 접근 ㅇ
		name ="둘리";
		
		//부모의 protected속성 접근 ㅇ
		height=130;
		
		//부모의 default속성 접근 ㅇ (단 같은 패키지에서만)
		age=30;
		
		//부모의 private속성 접근 x
		//weight=20;
	
	}
}
