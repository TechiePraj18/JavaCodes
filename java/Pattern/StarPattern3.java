package Pattern;

public class StarPattern3 {
    public static void main(String[] args) {
        pattern3(4);
        
    }
    static void pattern3(int n){
        //Rows will remain same
        for(int row = 1; row<=n; row++){
            //Column for row 1 will 4, row 2 will 3 and so on..
            for(int col =n;col>=row ;col--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
