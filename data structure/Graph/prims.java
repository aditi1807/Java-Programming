// User function Template for Java
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
class Solution{
    static int solve(int V,int E,ArrayList<ArrayList<Pair>> adj)
    {
         boolean[] vis=new boolean[V];
	    PriorityQueue<Pair>q=new PriorityQueue();
	    int ans=0;
	    q.offer(new Pair(0,0));
	    while(q.size()!=0){
	        Pair curr=q.remove();
	        int u=curr.v;
	        if(vis[u]==true){
	            continue;
	        }
	        ans+=curr.wt;
	        vis[u]=true;
	        for(Pair pair:adj.get(u))
	        {
	            int vertex=pair.v;
	            int wt=pair.wt;
	            if(vis[vertex]==false)
	            q.add(new Pair(vertex,wt));
	        }
	    }
	    return ans;
    }
	static int spanningTree(int V, int E, int edges[][]){
	    // Code Here. 
	    ArrayList<ArrayList<Pair>> adj=new ArrayList<>(V);
	    for(int i=0;i<V;i++)
	    adj.add(new ArrayList<Pair>());
	    for(int i=0;i<E;i++)
	    {
	        int u=edges[i][0];
	        int v=edges[i][1];
	        int wt=edges[i][2];
	        adj.get(u).add(new Pair(v,wt));
	        adj.get(v).add(new Pair(u,wt));
	    }
	    return solve(V,E,adj);
	   
	}