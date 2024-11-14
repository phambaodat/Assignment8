
package a8bai8;
public class A8bai8 {
    public static String timTuDaiNhat(String chuoi) {
        String[] mangTu = chuoi.split(" ");
        String tuDaiNhat = mangTu[0];  
        for (String tu : mangTu) {
            if (tu.length() > tuDaiNhat.length()) {
                tuDaiNhat = tu;
            }
        }
        return tuDaiNhat;  
    }
    public static void main(String[] args) {
        String chuoi = "I love programming";
        System.out.println("Tu dai nhat trong chuoi la: " + timTuDaiNhat(chuoi));
    }
}