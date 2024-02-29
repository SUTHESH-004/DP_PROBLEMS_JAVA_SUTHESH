package fibonacci;
import java.util.*;
// time complexity O(n)
// space complexity O(n)
// after initialization the look up is O(n)
public class fibonacci_tabulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int dp[] = new int[number+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<number+1;i++)
        {
            dp[i] = dp[i-1]+dp[i-2];
        }
        System.out.println(dp[number]);
        //this is the most effcient method for finding the fibonacci number
        System.out.println(Arrays.toString(dp));
        sc.close();

    }

}
