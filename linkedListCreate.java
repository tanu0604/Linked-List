class Node{
    int data;
    Node2 next;
    Node(int data1, Node2 next1){
        this.data=data1;
        this.next=next1;
    }
    Node (int data1)
    {
        this.data=data1;
        this.next=null;
    }
};
public class linkedListCreate{
    private static Node2 covertArray2LL(int[] arr){
        //Head will be the first element
        Node2 head=new Node2(arr[0]);
        Node2 mover=head;
        for (int i = 1; i < arr.length; i++) {
            Node2 temp=new Node2(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }
    static void print(Node2 head)
    {
        while(head!=null)
        {
            System.out.println(head.data+" ");
            head=head.next;
        }
    }
    public static void main(String[] args) {
        int[] arr={2,4,5,7};
        Node2 head=covertArray2LL(arr) ;
        print(head);
    }
}
