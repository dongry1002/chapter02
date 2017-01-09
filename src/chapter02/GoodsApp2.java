package chapter02;

public class GoodsApp2 {

	public static void main(String[] args) {
		Goods2 camera=new Goods2();
		//camera.name="nikon";  private여서 접근 불가능 메소드로 접근해야해
		
		camera.setName("nikon");
		System.out.println(camera.getName());
		
		 //camera.price=-1;// 개겣 변수에 바롤 접근하면 잘못된 데이터를 세팅할수 있는 가능성	
		 
		camera.setPrice(-1); //잘못된가격들어가도 메소드로 보호 (0으로 초기화 )
		 
		 System.out.println(camera.getPrice());
		
		 //static 변수 테스트
		 System.out.println(Goods2.countofGoods);//static 변수는 클래스이름으로 접근*********
		 Goods2 camera1=new Goods2();
		 System.out.println(Goods2.countofGoods);
		 
		 Goods2 camera2=new Goods2();
		 System.out.println(Goods2.countofGoods);
		 Goods2 camera3=new Goods2();
		 System.out.println(Goods2.countofGoods);
		 camera3.setName("tv");
		 camera3.setPrice(4000);
		 
		double discountPrice= camera3.calcDiscountPrice(0.8);
		 System.out.println(discountPrice);
		 camera3.showInfo();
	}

}
