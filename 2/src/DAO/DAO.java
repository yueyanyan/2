package DAO;

import java.util.List;

import model.Goods;

public interface DAO {
	//DAO模式实现各个类的功能
	
	
	public 	List<Goods> queryGoods(String quantity);


}
