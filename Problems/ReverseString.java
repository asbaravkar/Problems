import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            String str = sc.nextLine();
            System.out.println(OptimalReverse(str));
        }
    }

    static String RecursiveReverse(String str) {
        int len = str.length();
        if(len == 0) return "";
        return (str.charAt(len-1) + RecursiveReverse(str.substring(0,len-1)));
    }

    static String OptimalReverse(String str) {
        if(str.length()==0) return "";

        char[] s = str.toCharArray();
        char temp;
        for(int i=0; i<(s.length/2); i++) {
            //swap s[i] & s[s.length-1-i]
            temp = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = temp;
        }
        return(String.valueOf(s));
    }
}
