// package fibonacci;
// import java.util.*;
// public class fibonacci_memoization {
//     static int dp[];
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt();
//         System.out.print(fib(number));
//         sc.close();
//         dp = new int[number+1] ;
//         Arrays.fill(dp,-1);
//     }

//     public static int fib(int number) {
//         if (number < 2)
//             return number;
//         if(dp[number]!=-1)
//             return number;
//         return fib(number - 1) + fib(number - 2);
//     }
// }
// not completed ye