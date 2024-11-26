import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;


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
while(true){
    System.out.println();
    System.out.println("HOTEL MANAGEMENT SYSTEM");
    Scanner sc = new Scanner(System.in);
    System.out.println("1 Reserve your Room");
    System.out.println("2 View Reservation");
    System.out.println("3 Get your Room Number");
    System.out.println("4 Update Reservation");
    System.out.println("5 Delete Reservation");
    System.out.println("0 Exit");
    System.out.println("Choose an option: ");
    int choice=sc.nextInt();
}
        }


    }
}