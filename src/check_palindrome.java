import java.util.Scanner;

public class check_palindrome {
    static boolean palin(String s,int l, int r){
        if(l>=r) return true;
        if(s.charAt(l)!=s.charAt(r)) return false;
        return palin(s,l+1,r-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(palin(s, 0, s.length() - 1));
    }
}
