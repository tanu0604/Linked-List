class Node1 {
    int data;
    Node2 next;
    Node1(int data1, Node2 next1){
        this.data=data1;
        this.next=next1;
    }
    Node1(int data1)
    {
        this.data=data1;
        this.next=null;
    }
};
public class LinkedListDeletion{
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

    //Deletion of head from the beginning of the linked list

//    static Node1 deletefromBeginning(Node1 head)
//    {
//        if(head==null)
//        {
//            return head;
//        }
//       Node1 temp=head;
//        head=head.next;
//        return head;
//    }


    //Deleting the last element
//static Node1 deletefromEnding(Node1 head)
//{
//    if(head==null || head.next==null)
//    {
//        return null;
//    }
//    Node1 temp=head;
//    while (temp.next.next!=null)
//    {
//        temp=temp.next;
//    }
//    temp.next=null;
//    return head;
//}


//Deleting an element from a particular index

//    static Node1 deleteKthElement(Node1 head, int k) {
//        // Edge Case 1: If k=1 i.e the first element
//        if (head == null)
//            return null;
//        if (k == 1) {
//            return head.next; // Update head to the next node
//        }
//
//        int count = 1; // Start count from 1 since we already have head node
//        Node1 prev = null;
//        Node1 temp = head;
//        while (temp != null) {
//            if (count == k) {
//                prev.next = temp.next;
//                break;
//            }
//            prev = temp;
//            temp = temp.next;
//            count++;
//
//        }
//        return head; // Return the head of the modified list
//    }

    //Deleting after a particlar element
    static Node2 DeleteAfterElement(Node2 head, int element)
    {
        if(head==null || head.next==null)
            return null;
        if(head.data==element) {
            Node2 temp = head;
            head=head.next;
            return head;
        }
        Node2 temp=head;
        Node2 prev = null;
        while (temp != null) {
            if (temp.data==element) {
                prev.next = temp.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int[] arr={2,4,5,7};
        Node2 head=covertArray2LL(arr) ;
        System.out.print(" Before deleteion: ");
        print(head);
        System.out.println(" ");
        System.out.print(" After deleteion: ");
//        head=deletefromBeginning(head);
//        head=deletefromEnding(head);
//        head=deleteKthElement(head,3);
        head=DeleteAfterElement(head,4);
        print(head);
    }
}
