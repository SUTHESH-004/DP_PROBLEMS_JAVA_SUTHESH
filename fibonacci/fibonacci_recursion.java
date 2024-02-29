package fibonacci;
import java.util.*;

public class fibonacci_recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.print(fib(number));
        sc.close();
    }

    public static int fib(int number) {
        if (number < 2)
            return number;
        return fib(number - 1) + fib(number - 2);
    }
}