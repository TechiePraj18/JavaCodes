public class AdditionOfDigitsPower {
    public static void main(String args[]) {
        int no = 123;
        int temp = no;
        int total = 0;
        while (temp > 0) {
            total++;
            temp = temp / 10;

        }
        int add = 0;
        while (no > 0) {
            int digit = no % 10;
            add += Math.pow(digit, total);
            total--;
            no = no / 10;
        }
        System.out.println(add);
    }
}
