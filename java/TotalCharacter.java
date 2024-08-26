import java.util.*;

public class TotalCharacter {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();

        // Except for the space, count the characters in the string.
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ')
                count++;
        }
        // below code displays the number of characters in string.
        System.out.println("The string contains number of characters: " + count);
    }

}
