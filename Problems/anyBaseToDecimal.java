package Problems;

import java.util.Scanner;

public class anyBaseToDecimal {

    public static int toDecimal(int n, int b) {
        int ans = 0;
        int power = 1;
        while(n > 0) {
            int dig = n%10;
            ans += dig*power;
            power *= b;
            n /= 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n, b;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        b = sc.nextInt();
        System.out.println(toDecimal(n,b));
    }
}
