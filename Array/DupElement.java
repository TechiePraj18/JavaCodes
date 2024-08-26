package Array;

public class DupElement {
    public static void main(String[]args)
{
    int a[] = new int[]{2,5,3,2,6,8,6,5};
   System.out.println("Given array : ");
    
    for(int i=0;i<a.length;i++){ 
        
    System.out.print(a[i]+" ");
    }
    for(int i= 0;i<a.length;i++){

        for(int j=i+1;j<a.length;j++){

            if(a[i]==a[j]){
                System.out.print("\nDuplicate element : "+a[j]+" ");
            }
        }
    }
}    
}
