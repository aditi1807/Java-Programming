import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class dfs {
    static class Edge{
        int src;
        int dest;
        int w;
        Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.w=w;
        }
    }
    static void DFS(ArrayList<Edge> graph[],int curr,boolean vis[]){
        if(vis[curr]==true)
        return;
        System.out.print(curr+"->");
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++)
        {
            Edge s=graph[curr].get(i);
            DFS(graph,s.dest,vis);
        }
        return;
        
    }
    static void creategraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<>();
        }
        

}
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int v=s.nextInt();
    ArrayList<Edge>graph[]=new ArrayList[v];
    creategraph(graph);
    boolean[] vis=new boolean[v];
    DFS(graph, 0,vis);
}
}
