
package a8bai2;

public class A8bai2 {

   public static String daonguocchuoi(String str) {
        String daonguoc = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            daonguoc += str.charAt(i);
        }
        return daonguoc;
    }

    public static void main(String[] args) {
        String str = "Hello World";
        String chuoibidao = daonguocchuoi(str);
        System.out.println("Reversed string: " + chuoibidao);
    }
}
