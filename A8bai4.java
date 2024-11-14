
package a8bai4;


public class A8bai4 {
    
public static String daoNguocChuHoaThuong(String chuoi) {
        String ketQua = "";

        for (int i = 0; i < chuoi.length(); i++) {
            char kyTu = chuoi.charAt(i);
            if (Character.isUpperCase(kyTu)) {
                ketQua += Character.toLowerCase(kyTu);
            } 
            else if (Character.isLowerCase(kyTu)) {
                ketQua += Character.toUpperCase(kyTu);
            } 
            else {
                ketQua += kyTu;
            }
        }

        return ketQua;
    }

    public static void main(String[] args) {
        String chuoi = "Hello World";
        System.out.println("Chuoi sau khi chuyen doi la: " + daoNguocChuHoaThuong(chuoi));
    }
}