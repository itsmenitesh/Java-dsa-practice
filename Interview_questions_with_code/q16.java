class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class customList{
    Node head;
    Node tail;

    void print(){
        Node curr = this.head;
        while (curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();

    }
    void addFirst(int data){
        Node tba = new Node(data);
        if(head==null){
            head=tba;
            tail=tba;
        }else {
            tba.next=head;
            head=tba;
        }

    }
    void addLast(int data){
        Node tba = new Node(data);
        if(head==null){
            head=tba;
            tail=tba;
        }else{
            tail.next=tba;
            tail=tba;
        }

    }
    void addAnyPosition(Node head,int data , int position){
        Node tba= new Node(data);
        Node curr = this.head;
        for(int i=0;i<position-1;i++){
            curr=curr.next;
        }
        tba.next=curr.next;
        curr.next=tba;
    }

    Node reverse(Node head){
        Node curr=head;
        Node prev=null;
        while(curr!=null){
            Node temp = curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }

    Node reverseListWithRecursion(Node head){
        if (head == null || head.next == null) return head;

        Node newHead = reverseListWithRecursion(head.next);
        Node headNext = head.next;
        headNext.next = head;
        head.next = null;

        return newHead;
    }

    Node delete(Node head,int position){
        Node curr= this.head;
        for(int i=0;i<position-1;i++){
                curr=curr.next;
        }
        curr.next=curr.next.next;
        return head;
    }



}

public class q16 {
    public static void main(String[] args) {
        int arr[]={7,4,8,9,3,1,4,5,3,3,21,4,5,3,2,14,4,56,2,1,1,1};
        customList ll = new customList();
        for(int i=0;i<arr.length;i++)ll.addFirst((arr[i]));

//        for(int i=0;i<arr.length;i++)ll.addLast((arr[i]));
        ll.addAnyPosition(ll.head,100,5);
        ll.print();
//        ll.head=ll.reverse(ll.head);
//        ll.head=ll.reverseListWithRecursion(ll.head);
        ll.delete(ll.head,5);
        ll.print();


    }
}
