class armstrong {
    public static void main(String[] args) {
        int no = 153;
        String s1 = no + "";
        int len = s1.length();
        int sum = 0, temp = no;

        while (no > 0) {
            int digit = no % 10;
            sum += Math.pow(digit, len);
            no = no / 10;
        }
        if (sum == temp)
            System.out.println("Armstrong");
        else
            System.out.println("not armstrong");
    }
}