package pert4;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Main extends JFrame{

	ResultSet rs;
	
	public Main() {
		// TODO Auto-generated constructor stub
		DbConnect db = new DbConnect();
		
		//insert into database using method, sourced in DbConnect.java
//		db.insertintoaddress("AA005", "Tangerang");
		
		//getdata (alldata) from database using method from DbConnect.java
//		rs = db.selectAllAddress();
//		
		Vector<Vector<Object>> records = new Vector<Vector<Object>>();
//		
//		try {
//			while (rs.next()) {
//				Vector<Object> record = new Vector<Object>();
//				record.add(rs.getObject("addressId"));
//				record.add(rs.getObject(2));
//				
//				records.add(record);
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		System.out.println(records.get(0).get(0));
//		System.out.println(records.get(0).get(1));
//		
//		for (Vector<Object> vector : records) {
//			System.out.println("Ini adalah Id " + vector.get(0));
//			System.out.println("Ini adalah nama kota " + vector.get(1));
//			System.out.println("=================================\n");
//		}
		
		//getdata (Spesific data) from database using method from DbConnect.java
//		rs = db.selectuserbyID("2");
//		
//		try {
//			while (rs.next()) {
//				System.out.println(rs.getObject(1));
//				System.out.println(rs.getObject(2));
//				System.out.println(rs.getObject(3));
//				System.out.println(rs.getObject(4));
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//update addressId by userId
//		db.updateAddress("AA005", 2);
		
		
		
		//mencek ulang AddressID
//		rs = db.selectuserbyID("2");
//		
//		try {
//			while (rs.next()) {
//				System.out.println(rs.getObject(1));
//				System.out.println(rs.getObject(2));
//				System.out.println(rs.getObject(3));
//				System.out.println(rs.getObject(4));
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//delete statement
		db.deletebyname("TestName");
		
		
		//join statement & JTable
		rs = db.selectuserandaddress();
		
		Vector<String> columns = new Vector<String>();
		columns.add("Username");
		columns.add("Password");
		columns.add("UserId");
		columns.add("AddressID");
		columns.add("AddressDesc");

		try {
			while(rs.next()) {
				Vector<Object> record = new Vector<Object>();
				record.add(rs.getObject(1));
				record.add(rs.getObject(2));
				record.add(rs.getObject(3));
				record.add(rs.getObject(4));
				record.add(rs.getObject(6));
				
				records.add(record);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		DefaultTableModel dtm = new DefaultTableModel(records, columns);
		JTable table = new JTable(dtm);
		JScrollPane jsp = new JScrollPane(table);
		
		add(jsp);
		
		setVisible(true);
		setSize(500,200);
//		setTitle("ALL Layout");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}
	
	

}
