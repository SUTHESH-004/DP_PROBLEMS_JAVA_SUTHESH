package fibonacci;

import java.util.*;

// time complexity O(n)
// space complexity O(3)~=O(1);
public class fibonacci_twoPointers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int a = 0;
        int b = 1;
        for (int i = 2; i < number + 1; i++) {
            int c = a + b;
            System.out.println(a + " " + b + " =" + c);
            a = b;
            System.out.println(a + " " + b + " ");
            b = c;
            System.out.println(a + " " + b + " ");
        }
        sc.close();

    }
}