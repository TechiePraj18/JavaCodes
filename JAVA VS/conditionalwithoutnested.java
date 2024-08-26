class conditionalwithoutnested {

    public static void main(String[] args) {
        int no = 13;
        if (no % 3 == 0 && no % 5 == 0) {
            System.out.println("Both");

        } else if (no % 3 == 0)
            System.out.println("only 3");
        else if (no % 5 == 0)
            System.out.println("only 5");
        else
            System.out.println("none");

    }

}
