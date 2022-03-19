package pert4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnect {

	/*
	 * Sintak yang ada dalam database yakni:
	 * 1. Select
	 * 2. Insert
	 * 3. Update dan Set
	 * 4. delete
	 * 5. min, max, count, avg, modus, median, dll
	 * 6. Group by
	 * 7. Having
	 * 8. Join
	 * 9. subquerry
	 * 10. Where 
	 */
	
	Connection con;
	PreparedStatement ps;
	Statement st;
	ResultSet rs;
	
//	insert into address values('AA003','Jakarta Selatan')
	
	public DbConnect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kelasf","root", "");
			System.out.println("database Berhasil terkoneksi");
			Thread.sleep(1000);
			st = con.createStatement();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// TODO Auto-generated constructor stub
	}
	
	public void insertintoaddress(String Id, String Description) {
		// TODO Auto-generated method stub
		try {
			ps = con.prepareStatement("Insert into address values(?,?)");
			ps.setString(1, Id);
			ps.setString(2, Description);
			ps.execute();			
			
			System.out.println("querry Berhasil dijalankan");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ResultSet selectAllAddress() {
		
		try {
			rs = st.executeQuery("Select * from address");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rs;
	}
	
	public ResultSet selectuserbyID(String Id) {
		
		try {
			ps = con.prepareStatement("Select * from user where USERID = ?");
			ps.setString(1, Id);
			rs = ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rs;
		
	}
	
	public void updateAddress(String addID, int userId) {
		try {
			ps = con.prepareStatement("Update user set addressid = ? where USERID = ?");
			ps.setString(1, addID);
			ps.setInt(2, userId);
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ResultSet selectuserandaddress() {
		try {
			ps = con.prepareStatement("select * from user u, address a where u.addressid = a.addressId" );
			rs = ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	
	public void deletebyname(String name) {
		try {
			ps = con.prepareStatement("delete from user where username = ?");
			ps.setString(1, name);
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
