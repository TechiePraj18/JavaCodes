package Strings;

public class STringSubset {

    public static void main(String[] args) {
        String str = "FUN";
// First F will print then it will be compared with U so print FU then it goes on
        for (int i = 0; i < str.length(); i++) {

            for (int j = i + 1; j <= str.length(); j++) {

                System.out.println("All subsets for given string are: " + str.substring(i, j));

            }

        }

    }

}
