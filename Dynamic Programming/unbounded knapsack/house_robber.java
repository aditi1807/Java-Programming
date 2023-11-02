import java.util.Scanner;

public class house_robber {
    public static int solve(int[] arr,int n){
        int[] dp=new int[n+1];
        for(int i=0;i<n+1;i++)
        {
            if(i==0)
            dp[i]=0;
            else if(i==1)
            dp[i]=arr[i-1];
            else{
                dp[i]=Math.max(dp[i-1],arr[i-1]+dp[i-2]);
            }
        }
        return dp[n];
    }
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print(solve(arr,n));

    }
}
