package com.jung.shopmall.product;

public class dInfo {
	
	private String pName;
	private int price;
	private int stock;
	

	public void productInfo() {
		System.out.print("상품명 : "+pName+", ");
		System.out.print("가격 : "+price+", ");
		System.out.println("재고 : "+stock);
	}

}
