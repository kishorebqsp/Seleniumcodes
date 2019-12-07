
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.annotations.Test;
import com.mysql.jdbc.Driver;


public class A {
	
   @Test
   public void dbtest() throws Throwable {
	  //step 1 : Register /load the JDBC driver
	      Driver driverRef = new Driver();
	      DriverManager.registerDriver(driverRef);
	      
	  //step 2 : get a connection to data base 
	       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/deepak_oar", "root", "root");
	  //step 3 : issue/create statement object
	       Statement stat = con.createStatement();
	       String query = "select * from employe";
	  //step 4 : execute query
	       ResultSet result = stat.executeQuery(query);
	       
	         //process the result
	          while (result.next()) {
	            System.out.println(result.getInt(1)+"\t" + result.getString(2)+ "\t"+result.getString(3)+"\t"+result.getString(4));
			}
	  //step 5 : close the db connection 
	      con.close();
   }

}
