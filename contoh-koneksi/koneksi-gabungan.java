import java.sql.*;
import java.util.*;

// MODEL
class User {
    private int id;
    private String nama;

    public User(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public int getId() { return id; }
    public String getNama() { return nama; }
}

// DAO
class UserDAO {
    private String url = "jdbc:mysql://localhost:3306/db_latihan";
    private String user = "root";
    private String pass = "";

    private Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url, user, pass);
    }

    // READ
    public List<User> getAllUsers() {
        List<User> list = new ArrayList<>();

        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement("SELECT * FROM users");
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                list.add(new User(
                    rs.getInt("id"),
                    rs.getString("nama")
                ));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    // INSERT
    public void insertUser(String nama) {
        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(
                 "INSERT INTO users(nama) VALUES (?)")) {

            ps.setString(1, nama);
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// MAIN
public class Main {
    public static void main(String[] args) {
        UserDAO dao = new UserDAO();

        // insert data
        dao.insertUser("Andi");

        // tampilkan data
        List<User> users = dao.getAllUsers();
        for (User u : users) {
            System.out.println(u.getNama());
        }
    }
}