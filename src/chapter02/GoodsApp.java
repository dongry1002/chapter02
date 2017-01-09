package chapter02;

import java.util.Scanner;

public class GoodsApp {

	
	public static void main(String[] args) {
		
		Goods camera=new Goods();  //생성자 따로 만들지 않았지만 기본 생성자
		//레퍼런스변수:카메라
		
		//private은 외부에서 접근X
		//camera.name="nikon";    
		
		camera.getName();
		//인스턴스변수
		
		
		//protected는 같은 패키지에서 접근가능+자식패키지에서 접근가능
		camera.price=400000;
		
		
		camera.countStock=30;
		camera.countSold=50;
		
		
	
		}
		
}

	


