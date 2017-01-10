package chapter02;
//스태틱변수는 클래스안의 전역변수로 클래스들이 서로 공유하기위해
//스태틱메소드는 전역 유틸리티성 메소드로 작성(객체로 안만들어도 된다=data필요없다)
public class StaticMethod {
	private int n;
	private static int m;
	
	//intance 메소드(일반)에서는 인스턴스 변수 접근 가능
	public void f1(int x){
		n=x;	
	}
	
	//intance 메소드 안에서는 static변수 접근 가능
	public void f2(int x){
		StaticMethod.m=x; // 같은 클래스 안에서는 네임스페이스(StaticMethod)를 생략가능//m
		
		s1(x);//static메소드도 접근 가능
	}
	
	//static 메소드에서는 인스턴스 변수 접근 불가능(아직 객체생성안했으므로)
	public static void s1(int x){
	//	n=x;  //error
	//	f2(x);//error
	}
	
	//static 메소드에서는 static 변수만 접근 가능하다
	public static void s2(int x){
		m=x;
		s1(x); //static메소드 접근 가능
	}
	
}
