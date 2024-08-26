package String;

public class PalindromeandRev {

    public static void main(String[] args) {
        String s1 = "madam";
        String rev = "";

        for (int i = s1.length() - 1; i >= 0; i--) {
            rev = rev + s1.charAt(i);
        }
        System.out.println(rev);

        if (s1.equals(rev)) {
            System.out.println("String " + s1 + " is palindrome");

        } else
            System.out.println("String " + s1 + " is not palindrome");
    }

}
