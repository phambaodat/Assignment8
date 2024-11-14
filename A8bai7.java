
package a8bai7;

public class A8bai7 {
   public static String xoaKhoangTrangThua(String chuoi) {
        String[] mangTu = chuoi.trim().split("\\s+");
        String ketQua = "";
        
        for (String tu : mangTu) {
            ketQua += tu + " ";
        }
        return ketQua.trim();
    }
    public static void main(String[] args) {
        String chuoi = "  Hello   World  ";
        System.out.println("Chuoi sau khi xoa khoang trang thua: '" + xoaKhoangTrangThua(chuoi) + "'");
    }
}
  