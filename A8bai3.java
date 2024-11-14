
package a8bai3;


public class A8bai3 {
 public static boolean KiemTraPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String chuoi1 = "madam";
        String chuoi2 = "Hello World";
        System.out.println(chuoi1 + " is a palindrome: " + KiemTraPalindrome(chuoi1));
        System.out.println(chuoi2 + " is a palindrome: " + KiemTraPalindrome(chuoi2));

       
    }
}
