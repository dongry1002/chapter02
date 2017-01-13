package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyClassTest {

	public static void main(String[] args) {
		MyClass m = new MyClass();
		try{
		m.dangerousMethod();
		}catch(MyException e){
			e.printStackTrace();
		}
		try{
		func();
		}catch(MyException e){
			e.printStackTrace();
		}
	}
	
	
	//예외처리를 하지 않고 회피하는 방
	public static void func() throws MyException{
		MyClass m = new MyClass();
		m.dangerousMethod();
	}
	
	//catch문을 비워두면 안됨!!!!
	public static void func2() throws FileNotFoundException,  IOException{
		FileReader fr=new FileReader("hellow.txt");
		int data=fr.read();
		fr.close();
	}

}
