package com.biostil;

import java.sql.SQLException;

import DBManagement.ConnectToDB;
import DBManagement.DeleteFromDB;
import stuff.Car;

public class MainApp {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		ConnectToDB con = new ConnectToDB();
		//con.getDepName();
		//UpdateDB.UpdateData("TED", 448);
	  // new InsertIntoDB().insData("dexy",6);
		//delSel(6);
//	}
//	public static void delSel(int del){
//		try {
//			new DeleteFromDB().delFromDB(del);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}	
}
