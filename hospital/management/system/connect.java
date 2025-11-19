package hospital.management.system;


import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public class connect {

    Connection connection;
    Statement statement;

    public connect() {
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/smart_health_management_system", "root", "sHj@6378#jw");
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
