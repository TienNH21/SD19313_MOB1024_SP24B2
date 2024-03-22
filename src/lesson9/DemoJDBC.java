package lesson9;

// B1: import
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;


public class DemoJDBC {
    public static void main(String[] args) {
        try {
            // B2: Load Driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            // B3: Kết nối
            String dbUser = "sa", dbPwd = "Aa@123456",
                dbUrl = "jdbc:sqlserver://localhost:1433;databaseName=SOF203";

            Connection conn = DriverManager
                .getConnection(dbUrl, dbUser, dbPwd);
            
            System.out.println("Kết nối thành công");
            
            // B4: Tạo đối tượng Statement
            String sql = "SELECT * FROM MauSac";
            Statement s = conn.createStatement();
            
            // B5: Thực thi truy vấn
            s.execute(sql);
            
            // B6: Đọc kết quả
            ResultSet rs = s.getResultSet();
            /**
             * ResultSet là đối tượng chứa tập hợp dữ liệu do CSDL trả về.
             * ResultSet.next(): phương thức này cho phép duyệt từng bản ghi.
             * Kết hợp với while() để đọc lần lượt từng dòng.
             */
            while (rs.next() == true) {
                /**
                 * 1 dòng dữ liệu gồm các thông tin: ID, Ma, Ten, TrangThai
                 *                                   int Str Str  int
                 */
                int id = rs.getInt("ID");
                String ma = rs.getString("Ma");
                String ten = rs.getString("Ten");
                int trangThai = rs.getInt("TrangThai");
                
                System.out.println(id + "|" + ma + "|" + ten + "|" + trangThai);
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
