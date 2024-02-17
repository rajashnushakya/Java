package Connection;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rajas
 */
import java.sql.*;

public class Conn {
    private Connection c;
    Statement s;

    public Conn() {
       try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.c = DriverManager.getConnection("jdbc:mysql://localhost:3306/cms", "root", "11shakyaraj");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    public Connection getConnection() {
        return this.c;
    }

    public Statement getStatement() {
        return s;
    }
    
    //In course class we have to add teachers in module and for marking
    public int getTeacherId(String email) {
    int teacherId = -1;
    String query = "SELECT id FROM tutor WHERE email = ?";
    try (Connection conn = this.getConnection();
         PreparedStatement ps = conn.prepareStatement(query)) {
        ps.setString(1, email);
        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                teacherId = rs.getInt("id");
            }
        }
    } catch (SQLException e) {
        System.err.println("Error fetching teacher ID: " + e.getMessage());
        // Handling exception
    }
    return teacherId;
}

//    public static void main(String[] args) {
//
//        Conn conn = new Conn();
//    }
}

