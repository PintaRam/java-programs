import java.util.*;

public class fact {
    static int fact(int n) {
        if (n == 0) {
            return 1;
        }

        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.println(fact(n));
    }
}
