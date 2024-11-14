
package a8bai5;

public class A8bai5 {
 public static String[] tachTu(String chuoi) {
        return chuoi.split(" ");
    }
    public static void main(String[] args) {
        String chuoi = "Java is fun";
        String[] mangTu = tachTu(chuoi);
        for (int i = 0; i < mangTu.length; i++) {
            System.out.println(mangTu[i]);
        }
    }
}