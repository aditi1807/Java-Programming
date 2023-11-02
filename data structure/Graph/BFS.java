import java.util.*;

public class BFS{
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
    static void creategraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<>();
        }
graph[0].add(new Edge(0, 1, 1));
graph[0].add(new Edge(0, 2, 1));
graph[1].add(new Edge(1, 0, 1));
graph[1].add(new Edge(1, 3, 1));
graph[2].add(new Edge(2, 0, 1));
graph[2].add(new Edge(2, 4, 1));
graph[3].add(new Edge(3, 1, 1));
graph[3].add(new Edge(3, 4, 1));
graph[3].add(new Edge(3, 5, 1));
graph[4].add(new Edge(4, 2, 1));
graph[4].add(new Edge(4, 3, 1));
graph[4].add(new Edge(4, 5, 1));
graph[5].add(new Edge(5, 3, 1));
graph[5].add(new Edge(5, 4, 1));
graph[5].add(new Edge(5, 6, 1));
graph[5].add(new Edge(6, 5, 1));
}
static void bfs(ArrayList<Edge> graph[],int v){
    boolean[] vis=new boolean[v];
    Queue<Integer> q=new LinkedList<>();
    q.add(0);
    while(!q.isEmpty()){
        int curr=q.remove();
        if(vis[curr]==false){
            vis[curr]=true;
            System.out.print(curr+" -> ");
                for(int j=0;j<graph[curr].size();j++)
                {
                    Edge s=graph[curr].get(j);
                    q.add(s.dest);
                }
        }


    }
}
    public static void main(String[] args){
        int v=7;
        ArrayList<Edge> graph[]=new ArrayList[v];
        creategraph(graph);
        bfs(graph,v);

    }
}