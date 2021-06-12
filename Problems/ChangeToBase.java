package Problems;

import java.util.Scanner;

public class ChangeToBase {

    public static int toBase(int n, int b) {
        int ans = 0;
        int power = 1;
        while(n!=0) {
            int r = n%b;
            ans += (r*power);
            power *= 10;
            n /= b;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n, b;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        b = s.nextInt();
        System.out.println(toBase(n, b));
    }
}
