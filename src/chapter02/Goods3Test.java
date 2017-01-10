package chapter02;

public class Goods3Test {

	public static void main(String[] args) {
		Goods3 g= new Goods3();//생성자를 만들어주니 기본생성자가 사라져요
		
		g.setName("이정재");
		g.setPrice(999999999);
		g.setCountSold(1);
		g.setCountStock(2); //이것들을 생성자에서 할수있다.
		
		Goods3 g2= new Goods3("이정재",9999999,1,2);

		System.out.println(g);
		System.out.println(g2);
	}

}
