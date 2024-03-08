package btvn_lesson2;

public class LopHoc {
    private String maLopHoc;
    private String tenMonHoc;
    private String chuyenNganh;

    public LopHoc() {
    }

    public LopHoc(String maLopHoc, String tenMonHoc, String chuyenNganh) {
        this.maLopHoc = maLopHoc;
        this.tenMonHoc = tenMonHoc;
        this.chuyenNganh = chuyenNganh;
    }

    public String getMaLopHoc() {
        return maLopHoc;
    }

    public void setMaLopHoc(String maLopHoc) {
        this.maLopHoc = maLopHoc;
    }

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

}
