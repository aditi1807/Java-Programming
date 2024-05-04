import java.util.*;
public class no_of_provinces {
    static void dfs(int[][] graph,boolean[] vis,int curr){
        if(vis[curr]==false)
        {vis[curr]=true;
        for(int i=0;i<graph.length;i++)
        {
            if(graph[curr][i]==1 && vis[i]==false)
            dfs(graph,vis,i);
        }}
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
        int c=0;
        boolean[] vis=new boolean[n];
        for(int i=0;i<n;i++)
        {
            if(vis[i]==false)
            {
                
                dfs(graph,vis,i);
                c++;
            }
        }
        System.out.print(c);


    }
}
