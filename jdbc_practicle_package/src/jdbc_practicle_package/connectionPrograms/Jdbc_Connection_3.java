package jdbc_practicle_package.connectionPrograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Jdbc_Connection_3 {
public static void main(String[] args) throws Exception {
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
		
		Statement smt = con.createStatement();
		smt.executeUpdate("create table sidd(eno number, ename varchar(12), esal number)");
		
		System.out.println("Hello....");
	}

}

