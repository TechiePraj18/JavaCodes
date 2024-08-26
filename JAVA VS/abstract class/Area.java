import java.util.*;

abstract class Area {
    int height;
    int width;

    void get() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height= ");
        height = sc.nextInt();
        System.out.println("Enter width= ");
        width = sc.nextInt();

    }

    abstract void Calculate();
}

class Rect extends Area {
    void Calculate() {
        int Vol = height * width;
        System.out.println("vol= " + Vol);
    }
}
