import java.util.*;
public class topoplogical_sort {
    static void solve(int[][] graph,boolean[] vis,int curr,Stack<Integer>st){
        vis[curr]=true;
        for(int i=0;i<graph[curr].length;i++)
        {
            if(graph[curr][i]==1 && vis[i]==false)
            {
                solve(graph,vis,i,st);
            }
        }
        st.push(curr);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] graph=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                graph[i][j]=sc.nextInt();
            }
        }
        boolean[] vis=new boolean[n];
        Arrays.fill(vis,false);
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<n;i++)
        {
            if(vis[i]==false)
            solve(graph,vis,i,st);
        }
        System.out.println(st);
        
}
}
