package ro.emanuel.order.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import ro.emanuel.order.helpers.DBHelper;
import ro.emanuel.order.pojo.Order;

public class OrderDAO {

	public static Order getById(int id) throws SQLException, ClassNotFoundException {
		 Connection conn = DBHelper.getConnection();
		 String query = "select * from orders where id=?";
		 PreparedStatement ps= conn.prepareStatement(query);
		 ps.setInt(1, id);
	        
	        ResultSet rs = ps.executeQuery();
	        
	        if(rs.next()) {
	        	Order comanda = new Order(rs.getInt("id"),
	        			rs.getString("customer_name"),
	        			rs.getInt("total_price"));
	        	DBHelper.closeConnection();
	        	return  comanda;
	        			
	        }
	        DBHelper.closeConnection();
	        return null;
	}
	
	public static ArrayList<Order> getAll() throws ClassNotFoundException, SQLException{
		 Connection conn=DBHelper.getConnection();
	        String query="select * from orders";
	        Statement st = conn.createStatement();
	        ResultSet rs = st.executeQuery(query);
	        ArrayList<Order> comanda = new ArrayList<>();
	        
	        
	        while(rs.next()) {
	            Order order=new Order(rs.getInt("id"),
	            		rs.getString("customer_name"),
	        			rs.getInt("total_price"));
	            comanda.add(order);
	        }
	        DBHelper.closeConnection();
	        return comanda;
	    }
}
