package String;

public class CharacterCount {

    public static void main(String[] args) {

        int count = 0;
        String s1 = ("Hello my name is prajwal");

        for (int i = 0; i < s1.length(); i++) {

            if (s1.charAt(i) != ' ')
                count++;

        }
        System.out.println("Total character in String are: " + count);
    }

}
