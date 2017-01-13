package exception;

import java.io.IOException;

public class MyClass {

		public void dangerousMethod() throws MyException{
			System.out.println("some code1");
			System.out.println("some code2");
			
			if(true){
				//예외상황이 발생해서 예외를 발생시킴
				throw new MyException("테스트 예외 2입니다.");
			}
			System.out.println("some cod3");
		}
}
