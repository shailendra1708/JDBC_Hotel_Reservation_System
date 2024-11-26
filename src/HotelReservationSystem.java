import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;


public class HotelReservationSystem {
    private static final String url="jdbc:mysql://localhost:3306/Hotel_db";
    private static final String username= "root";
    private static final String password= "root";

    public static void main(String[] args) {

        Connection con =null;
        Statement st =null;
        ResultSet rs =null;

        try{
            // Driver Loaded
            Class.forName ("com.mysql.jdbc.Driver");

//            Establishing connection
            con = DriverManager.getConnection(url,username,password);

            // Creating Main Menu

        }


    }
}