class NewInSorted {
    public static void main(String[] args) {

        String s1 = "java";
        char ch[] = new char[s1.length()];

        for (int i = 0; i < s1.length(); i++) {

            ch[i] = s1.charAt(i);

        }
        Arrays.sort(ch);
        String s2 = " ";
        for (int i = 0; i <= ch.length; i++) {
            s2 = s2 + ch[i];
            System.out.println("Ans= " + s2);
        }
    }
}
