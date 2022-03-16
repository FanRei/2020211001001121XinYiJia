package jdbc;
import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;


public class jdbc {
  String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
  String dbURL="jdbc:sqlserver://127.0.0.1:1433;DatabaseName=Dormitory_Management";
  String userName="sa";
  String userPwd="123456";
 

public Connection getCon() throws Exception{
	Class.forName(driverName);
	Connection con=DriverManager.getConnection(dbURL,userName,userPwd);
	return con;
}

public void closeCon(Connection con)throws Exception{
	if(con!=null){
		con.close();
	}
}

public static void main(String[] args) {
	jdbc dbUtil=new jdbc();
	try {
		dbUtil.getCon();
		System.out.println("连接成功");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("连接失败");
	}
}
 

}
