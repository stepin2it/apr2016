package form;

import java.sql.*;  

public class LoginDao {  
public static boolean validate(String userid,String password){  
boolean status=false;  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/db","root","lodmu29");  
      
PreparedStatement ps=con.prepareStatement(  
"select * from login where userid=? and password=?");  
ps.setString(1,userid);  
ps.setString(2,password);  
      
ResultSet rs=ps.executeQuery();  
status=rs.next();  
          
}catch(Exception e){System.out.println(e);}  
return status;  
}  
}  