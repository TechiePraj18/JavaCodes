package Strings;
import java.util.*;

public class AnagranString {

    public static void main(String[] args) {
        String str1 = "Brag";
        String str2 = "garb";

        //Converting both the string to lower case. 

        str1 =str1.toLowerCase();
        str2 = str2.toLowerCase();

         //Checking for the length of strings 

        if(str1.length()!=str2.length()){
            System.out.println("Strings are not anagram");
        }
        else{
            //Converting both the arrays to character array

            char[] string1 = str1.toCharArray();
            char[] string2 = str2.toCharArray();

              //Sorting the arrays using in-built function sort ()  

            Arrays.sort(string1);
            Arrays.sort(string2);

            //Comparing both the arrays using in-built function equals () 

            if(Arrays.equals(string1,string2) ==true){
                System.out.println("Strings are anagram");
            }
            else
            System.out.println("Strings are not anagram");

        }
    }
    
}
