import java.util.*;
public class adj_matrix {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        int[][] adj=new int[v][v];
        for(int i=0;i<adj.length;i++)
        {
            Arrays.fill(adj[i],0);
        }
        adj[0][2]=1;
        adj[2][0]=1;
        adj[2][1]=1;
        adj[2][3]=1;
        adj[1][2]=1;
        adj[1][3]=1;
        adj[3][1]=1;
        adj[3][2]=1;
        for(int i=0;i<v;i++)
        {
            System.out.print("Vertex     "+ i);
            for(int j=0;j<v;j++)
            {
                if(adj[i][j]==1)
                System.out.print("->"+j);
            }
            System.out.println();
        }

    }
}
