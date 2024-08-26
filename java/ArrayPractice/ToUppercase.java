package ArrayPractice;

public class ToUppercase {
    public static void main(String[] args) {
        String reqstr = "";
        String s = "my name is prajwal";

        String[] arr = s.split(" "); // all Char are stored in this array and split

        for (int i = 0; i < arr.length; i++) {

            char c = arr[i].charAt(0); // it will take char at particular index

            String c1 = String.valueOf(c).toUpperCase(); // this method converts different types of values into
                                                         // string

            String sub = arr[i].substring(1); // it will store substring from index 1
            reqstr = reqstr + c1 + sub + " ";

        }
        System.out.println(reqstr.trim());
    }

}
