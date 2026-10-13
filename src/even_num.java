import java.util.Scanner;

public class even_num {
    static void even(int n, int i) {
        if (i > n) return;
        if (i % 2 == 0) System.out.println(i);
        even(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        even(n, 1);
    }
}
