
public class practice {
    public static void main(String args[]) {

        int a[] = { 1, 2, 3, 4 };
        int mul = 1;

        for (int i = 0; i < a.length; i++) {
            while (a[i] > 0) {
                int rem = a[i] % 10;
                
                a[i] = a[i] / 10;
                mul = mul * a[i];
                

            }
            System.out.println("Product= " + mul);

        }
    }
}