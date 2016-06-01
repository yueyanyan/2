package servlet;

import java.util.List;

import DAO.GuitarDAO;
import DAO.DAO;
import model.Goods;

public class GuitarImpl implements DAO {
	

	DAO guitarDao = new GuitarDAO();
	@Override
	public List<Goods> queryGoods(String quantity){
		List<Goods> listgoods = guitarDao.queryGoods(quantity);
		return listgoods;
	}
	
}
