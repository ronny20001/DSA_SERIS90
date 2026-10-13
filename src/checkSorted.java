import java.util.Scanner;

public class checkSorted {
    static boolean issorted(int arr[],int i){
        if(i>=arr.length-1)return true;
        if(arr[i]>arr[i+1])return false;
        return issorted(arr,i+1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        System.out.println(issorted(arr, 0));
    }
}
