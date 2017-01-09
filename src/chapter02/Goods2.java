package chapter02;

public class Goods2 {
	
		public static int countofGoods;
		
		private String name;
		private int price;
		private int countStock;
		private int countSold;
		
		//기본생성자
		public Goods2(){
			System.out.println("기본 생성자 호출");
			Goods2.countofGoods++;
		}
		
		public void setName(String name){
			this.name=name;
		}
		
		public String getName(){
			return name;
			
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			if(price <0){
				price=0;
			}
			this.price = price;
		}

		public int getCountStock() {
			return countStock;
		}

		public void setCountStock(int countStock) {
			this.countStock = countStock;
		}

		public int getCountSold() {
			return countSold;
		}

		public void setCountSold(int countSold) {
			this.countSold = countSold;
		}
		public void showInfo(){//return값이없고 파라미터도 없는 메소드
			System.out.println(
					"name="+name);
		}
		//return값이 있고, 피라미터도 있는  메소드 
		public double calcDiscountPrice(double rate){
			double discountPrice=price*rate;
			return discountPrice;
		}
}
