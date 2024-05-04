class Solution {
    static void dfs(int[][] graph,List<List<Integer>> ans,int curr,List<Integer> temp,int t,boolean[] vis){
        vis[curr]=true;
        temp.add(curr);
        if(curr==graph.length-1)
        {
        ans.add(new ArrayList<>(temp));
        }
        else{
            for(int i: graph[curr]){
                if(vis[i]==false)
                {
                dfs(graph,ans,i,temp,t,vis);
                }
            }
        }
        vis[curr]=false;
         temp.remove(temp.size()-1);
        
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        boolean[] vis=new boolean[graph.length];
        List<Integer> temp=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        dfs(graph,ans,0,temp,graph.length-1,vis);
        return ans;
    }
}