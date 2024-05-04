class Solution {
    // Function to detect cycle in an undirected graph.
    static boolean solve(ArrayList<ArrayList<Integer>> adj,int curr,boolean[] vis,int parent)
    {
        vis[curr]=true;
        for(int i:adj.get(curr))
        {
            if(vis[i]==false)
            {
                if(solve(adj,i,vis,curr))
                return true;
            }
            else if(parent!=i)
            return true;
        }
        return false;
    }
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean[] vis=new boolean[V];
        Arrays.fill(vis,false);
        for(int i=0;i<vis.length;i++)
        {
            if(vis[i]==false)
            {
                if(solve(adj,i,vis,-1))
                return true;
            }
            
        }
        return false;
    }