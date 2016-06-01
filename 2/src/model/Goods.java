package model;

public class Goods {
	private String Number;
	private GoodsSpec GoodsSpec;
	private String 	Quantity;
	public Goods() {
	}
	


	public String getNumber() {
		return Number;
	}
	public void setNumber(String number) {
		Number = number;
	}
	public GoodsSpec goodsSpec() {
		return GoodsSpec;
	}
	public void setGuitarSpec(GoodsSpec goodsSpec) {
		this.GoodsSpec = goodsSpec;
	}
	public String getQuantity() {
		return Quantity;
	}
	public void setQuantity(String quantity) {
		Number = quantity;
	}



	public static void add(Goods guitar) {
		// TODO Auto-generated method stub
		
	}
}