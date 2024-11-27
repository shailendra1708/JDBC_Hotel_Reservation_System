# Hotel Reservation System

A **Java-based Hotel Reservation System** that connects to a MySQL database for managing hotel room reservations. This command-line application provides essential CRUD operations for reservation data, ensuring simplicity and functionality.

---
## 🚀 Features

- **Room Reservation**: Add new reservations for guests.
- **View Reservations**: Display all existing reservations in a table format.
- **Find Room Details**: Retrieve room information based on guest and reservation details.
- **Update Reservations**: Modify existing reservation details seamlessly.
- **Delete Reservations**: Remove unwanted reservations from the system.
- **Graceful Exit**: Exit the system with a farewell message.

---

## 📋 Prerequisites

Ensure you have the following installed on your system:

1. **Java Development Kit (JDK)** 8 or later
2. **MySQL Server**
3. **MySQL JDBC Driver** (`mysql-connector-java`)

---
## 🛠️ Setup Instructions

### 1. Configure the Database
1. Create the `hotel_db` database:
   ```sql
   CREATE DATABASE hotel_db;
   ```

2. Create the `reservations` table:
   ```sql
   CREATE TABLE reservations (
       reservation_id INT AUTO_INCREMENT PRIMARY KEY,
       guest_name VARCHAR(255) NOT NULL,
       room_number INT NOT NULL,
       contact_number VARCHAR(20) NOT NULL,
       reservation_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
   );
   ```

### 2. Update Database Configuration
In the code, update the following lines with your database credentials:
```java
private static final String url = "jdbc:mysql://localhost:3306/hotel_db";
private static final String username = "your-username";
private static final String password = "your-password";
```

---

## 💻 How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/shailendra1708/JDBC_Hotel_Reservation_System.git
   cd JDBC_Hotel-Reservation-System
   ```

2. Compile the Java program:
   ```bash
   javac HotelReservationSystem.java
   ```

3. Run the application:
   ```bash
   java HotelReservationSystem
   ```

---

## 📖 Usage

Upon running the program, the main menu will be displayed:

```
HOTEL MANAGEMENT SYSTEM
1. Reserve a room
2. View Reservations
3. Get Room Number
4. Update Reservations
5. Delete Reservations
0. Exit
```

### Example Operations:
- **Reserve a Room**: Enter guest name, room number, and contact details when prompted.
- **View Reservations**: Displays all current reservations in a neatly formatted table.
- **Exit**: Select `0` to gracefully exit the program.

---

## ✨ Example Database Interaction

### Sample Reservation Entry:
```sql
INSERT INTO reservations (guest_name, room_number, contact_number)
VALUES ('John Doe', 101, '1234567890');
```

### Querying Reservations:
```sql
SELECT * FROM reservations;
```

---

## 🛡️ Dependencies

- **Java SE**: Core application runtime
- **MySQL JDBC Driver**: Database connectivity (Download from [here](https://dev.mysql.com/downloads/connector/j/))

---

## 👤 Author

- **Shailendra Lodhi**  
  [GitHub Profile](https://github.com/shailendra1708)  
  [LinkedIn Profile](https://www.linkedin.com/in/shailendra-lodhi-80a2802a7/)  

---

## 🛠️ Future Improvements
- Add user authentication for enhanced security.
- Implement a graphical user interface (GUI).
- Support advanced search and filtering of reservations.
- Enable email notifications for guests.

---

Feel free to fork this project, suggest improvements, or report any issues. Contributions are welcome!
```

This version is more visually appealing and professional. It includes a polished structure, clean formatting, and suggestions for future improvements to engage collaborators or users.
