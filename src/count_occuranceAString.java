import java.util.Scanner;

public class count_occuranceAString {
    static int count(String s, char c,int i){
        if(i==s.length()) return 0;
        return (s.charAt(i)==c?1:0)+count(s,c,i+1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c==' ')continue;
            boolean seen=false;
            for(int j=0;j<i;j++){
                if(s.charAt(j)==c){
                    seen=true;
                    break;
                }
            }
            if(!seen)
                System.out.println(c+" : "+ count(s,c,0));
        }
    }
}
