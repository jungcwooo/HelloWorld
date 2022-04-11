package co.edu.variable;

public class Basket {

	public static void main(String[] args) {
		int fruit = 129;
		int bigbasket;
		int basket;
		
		int na;
		
		bigbasket = fruit / 10;
		na = fruit % 10;
		
		if(na > 5 && na < 10) {
			basket = (na / 5) + 1;
			
		}else {
			basket = (na / 5);
			
		}
			
		
		System.out.println(fruit+"개의 과일을 담기 위해서는 큰바구니(10개)"
				+ " "+bigbasket+"개와 작은바구니(5개) "
				+basket+"개가 필요하다.");
		

	}

}
