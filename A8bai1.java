
package a8bai1;

public class A8bai1 {

 public static int demsotuxuathien(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "Hello World";
        char ch = 'o';
        int sotuxuathien = demsotuxuathien(str, ch);
        System.out.println("The character '" + ch + "' appears " + sotuxuathien + " times.");
    }
}