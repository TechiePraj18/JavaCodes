import javax.lang.model.util.ElementScanner6;

public class UpLwNumSym {
    public static void main(String[] args) {
        String s1 = "ProGraM#123";
        int u = 0, l = 0, n = 0, s = 0;
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                u++;
            else if (ch >= 'a' && ch <= 'z')
                l++;
            else if (ch >= '0' && ch <= '9')
                n++;

        }
        System.out.println(u);
        System.out.println(l);
        System.out.println(n);
    }
}
