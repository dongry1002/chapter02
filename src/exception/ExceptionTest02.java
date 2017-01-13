package exception;

public class ExceptionTest02 {

	public static void main(String[] args) {
		try{
		int a=1;
		int b=100/a;
		System.out.println("some code1");
		return;
		}catch(Exception ex){//모든 exception의 부모는 Exception
			
			System.out.println("예외발생-"+ex);
		//	return;
		}finally{
		//주로 자원정리를 넣게 된다.
		System.out.println("some code2");
		
		}
		System.out.println("some code3");
	}
}
