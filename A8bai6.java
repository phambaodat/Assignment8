
package a8bai6;
public class A8bai6 {
     public static int demSoLuongTu(String chuoi) {
        String[] mangTu = chuoi.split(" "); 
        return mangTu.length; 
    }
    public static void main(String[] args) {
        String chuoi = "Java is fun";
        System.out.println("So luong tu ngu trong chuoi: " + demSoLuongTu(chuoi));
    }
}