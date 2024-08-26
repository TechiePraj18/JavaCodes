package Array;

import java.util.Arrays;

public class FindFrequency {

    public static void main(String[] args) {
        
        int a[] = new int[]{1,3,2,1,4,3,6,5,4};

        // it will store frequency of element
        int[] fr = new int[a.length];

        // to avoid counting same element we will amrk visited as -1 after counting frequency
        int visited = -1;

       

        for(int i =0;i<a.length;i++){
            int count = 1;

            for(int j =i+1;j<a.length;j++){

                if(a[i] == a[j]){
            
                    count++;
                    fr[j]=visited;
                }

            }
            //it will update count in fr array only if it is not visited
            if(fr[i]!=visited){
                fr[i] =count;
            }
        
        }

        for(int i =0;i<fr.length;i++){
            if(fr[i]!=visited)     // It will print only unique element 
           

            System.out.println("Frequency : "+a[i]+"-->"+fr[i]);
    
       
    }
    
}
}
