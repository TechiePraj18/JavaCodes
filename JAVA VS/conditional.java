
public class conditional {
    public static void main(String[] args) {
        int no = 15;
        if (no % 3 == 0) {
            if (no % 5 == 0)
                System.out.println("Both");
            else
                System.out.println("only 3");

        } else if (no % 5 == 0)
            System.out.println("only 5");
        else
            System.out.println("not");

    }

}
