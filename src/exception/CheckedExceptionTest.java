package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionTest {

	public static void main(String[] args) {
		//FileReader fr=new FileReader();
		//int data=fr.read();
		//fr.close();  //try catch 구리다 
		FileReader fr=null;
		try {
			fr = new FileReader("hello.txt");// import해도 에러난다
														// throws해줘야해

			int data = fr.read();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			
		}finally{
			//자원정리
			try{
				if(fr==null){
					fr.close();//fr은 try안에서만 작동 	
				}
			
		}catch(IOException e){
			e.printStackTrace();
		}
			
		}
	}
}
