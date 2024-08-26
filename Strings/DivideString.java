package Strings;

public class DivideString {

    public static void main(String[] args) {
        
        String str = "aabbbcc";

        //Stores the length of the string 
        int len = str.length();

         //n determines the variable that divide the string in 'n' equal parts 
        int n=3;
        
        int temp =0, chars = len/n;

        //Stores the array of string
        String[] str1 = new String[n];

        //Check whether a string can be divided into n equal parts 
        if(len %n!=0){
            System.out.println("String cannot be divided into "+n+"\tequal parts");
        }
        else
        for(int i=0;i<len;i = i+chars){
            //Dividing string in n equal part using substring()

            String part = str.substring(i, i+chars);
            // Store substring in array
            str1[temp] = part;
            temp++;
        }
        System.out.println(n + " equal parts of given string are ");  
        for(int i = 0; i < str1.length; i++) {  
            System.out.println(str1[i]); 
    }
}
}
    
    

