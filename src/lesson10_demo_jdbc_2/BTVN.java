package lesson10_demo_jdbc_2;

public class BTVN {
    public static void main(String[] args) {
        String insertSQL = "INSERT INTO MauSac(Ma, Ten, TrangThai) VALUES (?, ?, ?)";
        String updateSQL = "UPDATE MauSac SET Ma = ?, Ten = ?, TrangThai = ? WHERE ID = ?";
        String deleteSQL = "DELETE FROM MauSac WHERE ID = ?";
        
        // Viết chương trình thực hiện:
        // 1. Thêm 5 bản ghi vào bảng MauSac
        // 2. Cập nhật tên/mã của 3 bản ghi mới thêm
        // 3. Xóa bản ghi cuối cùng.
        // Mỗi thao tác -> tạo 1 file mới
    }
}
