package Strings;

public class VowelCount {

    public static void main(String[] args) {
        
        String s1 = "Hey what is your name";
        int Vcount = 0;

        for(int i=0;i < s1.length();i++){

        if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u'){

            Vcount++;
        }
    }
    System.out.println("Count of Vowel in String : "+Vcount);
}
}