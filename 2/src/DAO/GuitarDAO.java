package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Goods;
import model.GoodsSpec;
import model.brand;
import model.type;
import model.material;
import model.price;
import util.DButil;


public class GuitarDAO implements DAO {
	
	@Override
	public List<Goods> queryGoods(String quantity) {
		List<Goods> listgoods= new ArrayList<Goods>();
		String sql = "select * from Guitar where quantity= ? ";
		Connection Conn = DButil.open();
		try {
			PreparedStatement pstmt = Conn.prepareStatement(sql);
			pstmt.setString(1,quantity);
			ResultSet rs=pstmt.executeQuery();
			while (rs.next()) {
				Goods goods = new Goods();
				GoodsSpec goodsSpec = new GoodsSpec();
				goodsSpec.setMaterial(rs.getString("material"));
				goodsSpec.setBrand(rs.getString("brand"));
				goodsSpec.setPrice(rs.getString("price"));
				goodsSpec.setType((rs.getString("type")));
				goods.setNumber(rs.getString("Number"));
				goods.setGuitarSpec(goodsSpec);
				Goods.add(goods);
			}
			return listgoods;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DButil.close(Conn);
		}
	return null;
	}

	

	
}
