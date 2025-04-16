package koneksi;
import java.sql.*;

public class koneksi {
  private Connection koneksi;
    
  public Connection connect() {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      System.out.println("Berhasil load driver");
    } 
    catch (ClassNotFoundException ex) {
      System.out.println("Gagal load driver: " + ex);
    }
    
    String url = "jdbc:mysql://localhost/penjualan?useSSL=false&serverTimezone=UTC";
    try {
      koneksi = DriverManager.getConnection(url, "root", "");
      System.out.println("Berhasil koneksi database");
    } 
    catch (SQLException ex) {
      System.out.println("Gagal koneksi database: " + ex);
    }
    
    return koneksi;
  }  
}
