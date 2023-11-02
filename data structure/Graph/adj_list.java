import java.util.*;
public class adj_list {
    static void addedge(ArrayList<ArrayList<Integer>> arr,int s,int d){
        arr.get(s).add(d);
    }
    static void printing(ArrayList<ArrayList<Integer>> arr){
        for(int i=0;i<arr.size();i++)
        {
            System.out.print("vertex   "+i);
            for(int j=0;j<arr.get(i).size();j++)
            {
                System.out.print("->"+arr.get(i).get(j));
            }
            System.out.println("");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        for(int i=1;i<=v;i++)
        arr.add(new ArrayList<>());
        addedge(arr, 0, 2);
        addedge(arr, 1, 2);
        addedge(arr, 1, 3);
        addedge(arr, 2, 0);
        addedge(arr, 2, 1);
        addedge(arr, 2, 3);
        addedge(arr, 3, 1);
        addedge(arr, 3, 2);
        

        printing(arr);
        
    }
}
