import java.util.*;
public class unique_path {
    static int solve(int i,int j,int n,int m){
        if(i==n-1 && j==m-1){
            return 1;
        }
        else if(i==n-1)
        return solve(i,j+1,n,m);
        else if(j==m-1)
        return solve(i+1,j,n,m);
        return solve(i,j+1,n,m)+solve(i+1,j,n,m);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.print(solve(0,0,n,m));
    }
}
