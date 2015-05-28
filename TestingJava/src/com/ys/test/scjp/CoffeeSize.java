package com.ys.test.scjp;


//You cannot instantiate an enum, you can only pull values from it.
public enum CoffeeSize {
	
	BIG(8),TALL(10),GRANDE(16){
		public String getLidType(){
			return "Large";
		}
	};
	
	private int ounces;
	
	CoffeeSize(int ounces){
		this.ounces=ounces;
	}
	
	public int getOunces(){
		return ounces;
	}
	
	public String getLidType(){
		return "Medium";
	}
}
