import java.util.Scanner;

public class printOdd {
    static void odd(int n, int i) {
        if (i > n) return;
        if (i % 2!=0) System.out.println(i);
        odd(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        odd(n, 1);
    }
}