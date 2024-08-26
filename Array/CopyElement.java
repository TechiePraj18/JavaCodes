package Array;

public class CopyElement {

    public static void main(String[] args) {

        int a[] = new int[]{1,2,3,4,5,6,7};

        int b[] = new int[a.length];

        for(int i=0;i<a.length;i++){
            // copying all elements from one array to another
            b[i]= a[i];
        }
        
        System.out.print("Elements of first array: ");
        
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.print("\nElements of second array: ");
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }

    }
    
}
