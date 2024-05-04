class point{
    int x,y;
    point(int x,int y){
        this.x=x;
        this.y=y;
    }
}
class Solution {
    static boolean isvalid(int[][] image,int i,int j,int c,int color){
        if(i<0 || i>=image.length || j<0 || j>=image[i].length || image[i][j]!=c || image[i][j]==color)
        return false;
        return true;
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        Queue<point> q=new LinkedList();
        q.add(new point(sr,sc));
        int c=image[sr][sc];
        image[sr][sc]=color;
        while(q.size()>0)
        {
            point curr=q.remove();
            System.out.print(curr.x);
            System.out.println(curr.y);
            if(isvalid(image,curr.x+1,curr.y,c,color))
            {
                image[curr.x+1][curr.y]=color;
                q.add(new point(curr.x+1,curr.y));
            }
            if(isvalid(image,curr.x-1,curr.y,c,color))
            {
                image[curr.x-1][curr.y]=color;
                q.add(new point(curr.x-1,curr.y));
            }
            if(isvalid(image,curr.x,curr.y+1,c,color))
            {
                image[curr.x][curr.y+1]=color;
                q.add(new point(curr.x,curr.y+1));
            }
            if(isvalid(image,curr.x,curr.y-1,c,color))
            {
                image[curr.x][curr.y-1]=color;
                q.add(new point(curr.x,curr.y-1));
            }
        }
        return image;
    }
}