package model;



public class GoodsSpec {

	private String type;
	private String material;
	private String brand;
	private String price;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	
	
	public Boolean matches(GoodsSpec goodsSpec){
		if(goodsSpec.getType()!=null && !goodsSpec.getType().equals(type)){

			return false;
		}
		
		if(goodsSpec.getMaterial()!=null && !goodsSpec.getMaterial().equals(material)){

			return false;
		}

		if(goodsSpec.getBrand()!=null && !goodsSpec.getBrand().equals(brand)){

			return false;
		}
		if(goodsSpec.getPrice()!=null && !goodsSpec.getPrice().equals(price)){
//			System.out.print("back");
			return false;
		}
		return true;
		
	}
}