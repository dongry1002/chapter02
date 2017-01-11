package Person;

public class PersonTest {

	public static void main(String[] args) {
		Student s= new Student();
		Student s2=new Student("둘리");
		
		Person p=s;//업캐스팅/암묵적
		Student s3=(Student)p; //다운캐스팅/ 명시적으로
		
		//
		//레퍼런스p로 객체의 기능 사용하다가....
		//자식의 메소드를 사용해야 되는 경우
		//오류(Student)p.test();
		((Student)p).test();
	}

}
