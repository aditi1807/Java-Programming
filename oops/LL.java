package oops;
import java.util.*;
class Node{
    int val;
    Node next;
    Node(int val,Node next){
        this.val=val;
        this.next=next;
    }
}

public class LL {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Node head=null;
        while(n!=0){
            Node newnode=new Node(sc.nextInt(),null);
            if(head==null)
            {
                head=newnode;
            }
            else{
                newnode.next=head;
                head=newnode;
            }
        }
        Node st=head;
        while(st!=null){
            System.out.println(st.val);
            st=st.next;
        }


    }
}
