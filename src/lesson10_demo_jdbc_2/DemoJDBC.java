package lesson10_demo_jdbc_2;

// B1: Import thư viện
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DemoJDBC {
    public static void main(String[] args) {
        ArrayList<MauSac> ds = new ArrayList<>();
        try {
            // B2: Kết nối
            Connection conn = DBContext.getConnection();
            
            // B3:
            /**
             * Dấu ? trong PreparedStatement được gọi là tham số của câu truy vấn
             *      cho phép thay đổi giá trị linh hoạt
             *      => tái sử dụng được nhiều lần.
             */
            String sql = "SELECT * FROM MauSac WHERE TrangThai = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            // B4: Gán giá trị cho các tham số
            /**
             * Lưu ý: 
             *      - Truy vấn có bao nhiêu tham số => gán đủ bấy nhiêu giá trị.
             *      - Sử dụng phương thức set<DataType>. DataType là kiểu dữ liệu của tham số.
             *      - Phương thức set() nhận vào 2 tham số.
             *          Tham số thứ nhất là vị trí của dấu ? trong truy vấn
             *          Tham số thứ hai là giá trị muốn truyền vào.
             */
            ps.setInt(1, 1);
            
            // B5: Thực thi truy vấn
            ps.execute();
            
            // B6: Đọc kết quả
            /**
             * ResultSet cung cấp phương thức next() cho phép di chuyển tới dòng kế tiếp.
             */
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                int id = rs.getInt("ID");
                String ma = rs.getString("Ma");
                String ten = rs.getString("Ten");
                int trangThai = rs.getInt("TrangThai");
                MauSac ms = new MauSac(id, ma, ten, trangThai);
                ds.add(ms);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
