import java.util.*;
public class Nprimeno {

    static void Prime(int N){

        int i, j,flag;

        for(i=1;i<=N;i++){
            if(i==0 || i==1){
                continue;

              int flag =1;

                for(j=2;j<=i/2;j++){
                    if(i%j==0){
                        flag=0;
                        break;

                    }
                }
                if (flag == 1)
                System.out.print(i + " ");
                }
            }

            class main{
            public static void main(String[] args)
            {
                int N = 45;
         
                Prime(N);
            
        }
    }
}
}


