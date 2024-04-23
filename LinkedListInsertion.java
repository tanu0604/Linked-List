class Node2 {
    int data;
    Node2 next;
    Node2(int data1, Node2 next1){
        this.data=data1;
        this.next=next1;
    }
    Node2(int data1)
    {
        this.data=data1;
        this.next=null;
    }
};
public class LinkedListInsertion{
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
        while(head!=null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    //Inserting a node in the beginning of a linked list
    static Node2 InsertAtBeginning(Node2 head,int val)
    {
        Node2 temp=new Node2(val,head);
        temp.next=head;
        return temp;
    }

    //Inserting at the end of the linked list
    static Node2 InsertAtEnd(Node2 head,int val)
    {
        Node2 temp=head;
        while (temp.next!=null)
        {
            temp=temp.next;
        }
        Node2 ptr=new Node2(11);
        temp.next=ptr;
        ptr.next=null;
        return head;
    }

    //Inserting the node at the kth index

    static Node2 InssertAtKthIndex(Node2 head,int ele,int k)
    {
        //if the linked list is null
        if(head==null)
        {
            if(k==1)
                return new Node2(ele);
        }

        //insert in the 1st position of the linked list

        if(k==1)
        {
            Node2 temp=new Node2(ele);
            temp.next=head;
            return temp;
        }

        //At any given index from 2 to n+1
        Node2 temp=head;
        int count=0;
        while (temp!=null)
        {
            count=count+1;
            if(count==(k-1)) //Standing behind one node
            {
                //Create a new node
                Node2 x=new Node2(ele);
                x.next=temp.next;
                temp.next=x;
                break;
            }
            temp=temp.next;
        }
        return head;
    }
static Node2 InsertBeforeElement(Node2 head,int ele,int val)
{
    if(head.data==val)
    {
        return new Node2(ele,head);
    }
    Node2 temp=head;
    while (temp.next!=null)
    {
        if(temp.next.data==val)
        {
            Node2 y=new Node2(ele,temp.next);
            temp.next=y;
            break;
        }
        temp=temp.next;
    }
    return head;
}
    public static void main(String[] args) {
        int[] arr={2,5,6,7};
        Node2 head=covertArray2LL(arr) ;
        System.out.print(" Before Insertion: ");
        print(head);
        System.out.println(" ");
        head=InsertAtBeginning(head,11);
        head=InsertAtEnd(head,11);
        head=InssertAtKthIndex(head,13,3);
        head=InsertBeforeElement(head,100,7);
        System.out.print(" After Insertion: ");
        print(head);
    }
}
