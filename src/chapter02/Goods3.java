package chapter02;

public class Goods3 {
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	
	public Goods3(){
	//기본생성자는 직접 생성자를 정의하는 경우에 직접써야한다.	
	}
	public Goods3(String name,int price,int countStock, int countSold){
		this.name=name;
		this.price=price;
		this.countStock=countStock;
		this.countSold=countSold;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
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
	@Override
	public String toString() {
		return "Goods3 [name=" + name + ", price=" + price + ", countStock=" + countStock + ", countSold=" + countSold
				+ ", getName()=" + getName() + ", getPrice()=" + getPrice() + ", getCountStock()=" + getCountStock()
				+ ", getCountSold()=" + getCountSold() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
