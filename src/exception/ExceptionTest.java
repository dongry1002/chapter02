package exception;

public class ExceptionTest {

	public static void main(String[] args) {
			int a=0;
			try{
			int b=100/a;  //예외 발생, 프로그램 실행은 여기서 중지 
			} catch(ArithmeticException ex){
				//사과(정상적인 종료)
				//System.out.println("죄송합니다. 프로그램이 오류가 발생했습니다.");
				
				//log 남기기... log4J라이블러리를 사용해서
				//파일이나 DB에 로그남기기
				//System.out.println(ex);
				
				//종료
				//System.exit(-1);
				
				//예외처리 할것이 없으면
				ex.printStackTrace();
				
			}
			System.out.println("some more code1");
			System.out.println("some more code2");
	}

}
