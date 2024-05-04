
class Solution
{
    static void solve(ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> ans,int[] indeg)
    {
        Queue<Integer> q=new LinkedList();
        for(int i=0;i<indeg.length;i++)
        {
            if(indeg[i]==0)
            q.add(i);
        }
        while(!q.isEmpty())
        {
            int curr=q.poll();
            ans.add(curr);
            for(int i: adj.get(curr))
            {
                if(--indeg[i]==0)
                {
                    q.add(i);
                    
                }
            }
        }
    }
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        int[] indeg=new int[V];
        Arrays.fill(indeg,0);
        // add your code here
        for(ArrayList<Integer> arr:adj)
        {
            for(int i: arr)
            {
                indeg[i]++;
            }
        }
        ArrayList<Integer> ans=new ArrayList<Integer>();
        solve(adj,ans,indeg);
        int[] res=new int[V];
        for(int i=0;i<ans.size();i++)
        {
            res[i]=ans.get(i);
        }
        return res;
    }
}