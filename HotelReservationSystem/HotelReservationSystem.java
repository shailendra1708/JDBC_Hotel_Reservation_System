import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;


public class HotelReservationSystem {
    private static final String url = "jdbc:mysql://localhost:3306/Hotel_db";
    private static final String username = "root";
    private static final String password = "root";

    public static void main(String[] args) {

        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            // Driver Loaded
            Class.forName("com.mysql.jdbc.Driver");

//            Establishing connection
            con = DriverManager.getConnection(url, username, password);

            // Creating Main Menu
            while (true) {
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
                int choice = sc.nextInt();

                // User choice function
                switch (choice) {
                    case 1:
                        reserveRoom(con, sc);
                        break;

                    case 2:
                        viewReservation(con);
                        break;

                    case 3:
                        getRoomNumber(con, sc);
                        break;

                    case 4:
                        updateReservation(con, sc);
                        break;

                    case 5:
                        deleteReservation(con, sc);
                        break;

                    case 0:
                        exit();
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            }
        }
        // Collapse two catch block
        catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    private static void reserveRoom(Connection con, Scanner sc) {
        try {
            System.out.println("Enter guest name :");
            String guestName = sc.next();

            System.out.println("Enter room number :");
            int roomNumber = sc.nextInt();

            System.out.println("Enter contact number :");
            String contactNumber = sc.next();

            String query = "INSERT INTO reservations (  Guest_name, Room_number, Contact_number )" + "VALUES (' " + guestName + " ', " + roomNumber + ", '" + contactNumber + "')";

            try (Statement st = con.createStatement()) {
                int i = st.executeUpdate(query);

                if (i > 0) {
                    System.out.println("Reservation successful !");
                } else {
                    System.out.println("Reservation failed.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }