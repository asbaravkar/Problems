package Problems;

import java.util.Scanner;

public class AnyBaseToAny {
    public static int toDecimal(int n, int b) {
        int ans = 0;
        int p = 1;
        while(n > 0) {
            int d = n%10;
            n /= 10;
            ans += d*p;
            p *= b;
        }
        return ans;
    }

    public static int decimalToBase(int n, int b) {
        int ans = 0;
        int p = 1;
        while(n > 0) {
            int d = n%b;
            n /= b;
            ans += d*p;
            p *= 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n, b1, b2;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        b1 = sc.nextInt();
        b2 = sc.nextInt();

        int dec = toDecimal(n, b1);
        int ans = decimalToBase(dec, b2);

        System.out.println(ans);
    }
}
