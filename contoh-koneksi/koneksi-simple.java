import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {
            // 1. Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Koneksi
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/nama_db",
                "root",
                ""
            );

            // 3. Statement
            Statement stmt = conn.createStatement();

            // 4. Query
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");

            // 5. Ambil data
            while (rs.next()) {
                System.out.println(rs.getString("nama"));
            }

            // 6. Close
            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}