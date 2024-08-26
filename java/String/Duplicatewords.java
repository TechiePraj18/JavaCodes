package String;

public class Duplicatewords {
    public static void main(String[] args) {

        String s1 = "BIG Black bug big black as a black sheep";
        int count;

        // Covert string to lower case
        s1 = s1.toLowerCase();

        // split string into words using split inbuilt function

        String words[] = s1.split(" ");

        for (int i = 0; i < words.length; i++) {

            // it will count duplicate word after one iteration if found

            count = 1;

            for (int j = i + 1; j < words.length; j++) {

                if (words[i].equals(words[j])) {

                    // it will increment duplicate words after finding

                    count++;

                    // Set words[j] to 0 to avoid printing visited word again
                    words[j] = "0";

                }

            }
            // Displays the duplicate word if count is greater than 1
            if (count > 1 && words[i] != "0")
                System.out.println("Duplicate words are: " + words[i] + " total words are: " + count);
        }

    }

}
