class pair{
    int r;
    int c;
    int tm;
    pair(int r,int c,int tm){
        this.r=r;
        this.c=c;
        this.tm=tm;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<pair>q=new LinkedList();
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]==2)
                q.add(new pair(i,j,0));
                if(grid[i][j]==1)
                c0++;
            }
        }
        int t=0;
        int[] row={-1,1,0,0};
        int[] col={0,0,-1,1};
        while(q.size()!=0)
        {
            pair curr=q.remove();
            int r=curr.r;
            int c=curr.c;
            t=curr.tm;
            for(int i=0;i<4;i++)
            {
                int nr=r+row[i];
                int nc=c+col[i];
                if(nr>=0 && nr<grid.length && nc>=0 && nc<grid[0].length && grid[nr][nc]==1)
                {
                    q.add(new pair(nr,nc,t+1));
                    grid[nr][nc]=0; 
                }
            }
        }
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]==1)
                return -1;
            }
        }
        return t;
    }
}class pair{
    int r;
    int c;
    int tm;
    pair(int r,int c,int tm){
        this.r=r;
        this.c=c;
        this.tm=tm;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<pair>q=new LinkedList();
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]==2)
                q.add(new pair(i,j,0));
                if(grid[i][j]==1)
                c0++;
            }
        }
        int t=0;
        int[] row={-1,1,0,0};
        int[] col={0,0,-1,1};
        while(q.size()!=0)
        {
            pair curr=q.remove();
            int r=curr.r;
            int c=curr.c;
            t=curr.tm;
            for(int i=0;i<4;i++)
            {
                int nr=r+row[i];
                int nc=c+col[i];
                if(nr>=0 && nr<grid.length && nc>=0 && nc<grid[0].length && grid[nr][nc]==1)
                {
                    q.add(new pair(nr,nc,t+1));
                    grid[nr][nc]=0; 
                }
            }
        }
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]==1)
                return -1;
            }
        }
        return t;
    }
}