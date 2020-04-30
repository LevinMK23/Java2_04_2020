package pack;

import java.util.Arrays;
import java.util.Scanner;

public class Sieve {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int [] s = new int[n+1];
        Arrays.fill(s, 1);
        for (int i = 2; i < n + 1; i++) {
            for (long j = i * i; j <= n; j += i) {
                s[(int) j]++;
            }
        }
        int ans = 0;
        for (int i = 0; i <= n; i++) {
            if (s[i] > 1) {
                ans += s[i];
            }
        }
        System.out.println(ans);
    }
}
