package jdbc_practicle_package.connectionPrograms;

import java.sql.Connection;
import java.sql.DriverManager;

public class Jdbc_Connection_2 {
	public static void main(String[]args) throws Exception {

		Class.forName("oracle.jdbc.driver.OracleDriver");
		//DriverManager.deregisterDriver(
			//	  new Oracle.jdbc.driver.OracleDriver());
				Connection con = DriverManager.getConnection(
						"jdbc:oracle:thin:@localhost:1521:xe",
						"system", "system");
		System.out.println(" Got the Connect : "+ con.getClass());
	}
}
