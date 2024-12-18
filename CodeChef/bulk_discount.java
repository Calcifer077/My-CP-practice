package CodeChef;

import java.util.*;

public class bulk_discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            long res = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] - i > 0) {
                    res += arr[i] - i;
                }
            }

            System.out.println(res);
            t--;
        }
        sc.close();
    }
}
