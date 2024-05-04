//User function Template for Java
class Pair implements Comparable<Pair>{
    int v;
    int wt;
    Pair(int v,int wt){
        this.v=v;
        this.wt=wt;
    }
    public int compareTo(Pair that){
        return this.wt-that.wt;
    }
}
    

class Solution
{
    //Function to find the shortest distance of all the vertices
    //from the source vertex S.
    
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        // Write your code here
         boolean[] vis=new boolean[V];
	    PriorityQueue<Pair>q=new PriorityQueue();
	    int[] ans=new int[V];
	    Arrays.fill(ans,Integer.MAX_VALUE);
	    q.offer(new Pair(S,0));
	    ans[S]=0;
	    while(q.size()!=0){
	        Pair curr=q.remove();
	        int u=curr.v;
	        if(vis[u]==true){
	            continue;
	        }
	        vis[u]=true;
	        ArrayList<ArrayList<Integer>> adj2=adj.get(u);
	        for(ArrayList<Integer> p:adj2)
	        {
	            int vertex=p.get(0);
	            int wt=p.get(1);
	            if(ans[vertex]>ans[u]+wt)
	            {   
	                ans[vertex]=ans[u]+wt;
	                q.add(new Pair(vertex,ans[vertex]));
	            }
	        }
	    }
	    return ans;
    }
}
