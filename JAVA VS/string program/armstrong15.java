//to find first 15 amstrongs
class armstrong15 {
    public static void main(String[] args) {
        int i = 1;
        String s1 = i + "";
        int len = s1.length();
        int sum = 0;
        int total = 15;

        for (i = 1; i <= total; i++) {
            while (i > 0) {
                int digit = i % 10;
                sum += Math.pow(digit, len);
                i = i / 10;

            }
        }
        System.out.println("the first 15 amstrong numbers are: ");
        for (int digit = 1; digit <= total; digit++) {
            if (sum == digit)
                System.out.println(+digit);
        }

    }
}