
// printing
// addFirst
// addLast
// reverse using iteration
// reverse using recursion
//delete a Node
// add a Node at any position.
// find n Node
// find middle
// compare 2 LinkedList

class Node{

    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class CustomLinkedList{
    Node head;
    Node tail;
    void printLinkedList(){  // printing
        Node curr = this.head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }

    void addFirst(int data){  // addFirst
        Node tba = new Node(data);
        if(head == null){
            head = tba;
            tail = tba;
        }else{
            tba.next=head;
            head=tba;
        }
    }

    void addLast(int  data){   // addLast
        Node tba = new Node(data);
        if(head==null){
            head=tba;
            tail=tba;
        }else{
            tail.next=tba;
            tail=tba;
        }
    }
    Node reversList(Node head){  // reverse using iteration
        Node curr=head;
        Node prev=null;
        while(curr!=null){
            Node temp =curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }

    Node reverseListWithRecursion(Node head){    // reverse using recursion
        if (head == null || head.next == null) return head;

        Node newHead = reverseListWithRecursion(head.next);
        Node headNext = head.next;
        headNext.next = head;
        head.next = null;

        return newHead;
    }

    Node deleteNode(Node head , int position) { //delete a Node
        Node curr = this.head;
        if (position == 0) return head.next;
        for(int i=0;i<position-1;i++)curr=curr.next;
        curr.next=curr.next.next;
        return head;
    }

    Node addNodeAtPosition(Node head , int position , int data){  // add a Node at any position.
        Node newNode = new Node(data);
        Node curr = this.head;
        Node temp=null;
        if(position==0){
            newNode.next=head;
            head = newNode;
                 return newNode;

        }

        for(int i=0;i<position-1;i++) {
            if (curr == null) {
                System.out.println("Invalid position");
                return head;
            }
            curr = curr.next;
        }
        temp =curr.next;
        curr.next=newNode;
        newNode.next = temp;
        return head;
    }


    int findNNode(Node head , int position){   // find n Node
        Node curr = head;
        if(position==0)return head.data;
        for(int i=0;i<position;i++){
            if(curr==null){
                System.out.println("Invalid position");
                return head.data;
            }
            curr = curr.next;

        }
        return curr.data;
    }

    int findMiddle(Node head ){     // find middle
        Node fast = head,slow=head;
        while(fast.next!=null && fast.next.next !=null){
            fast=fast.next.next;
            slow = slow.next;
        }
        return slow.data;
    }

    boolean compare2List(Node head1 , Node head2){  // compare 2 LinkedList
        Node curr1=head1;
        Node curr2=head2;

        while(curr1 !=null && curr2!=null){
            if(curr1.data!=curr2.data)return false;
            curr1=curr1.next;
            curr2=curr2.next;
        }
        if((curr1!=null && curr2==null) || (curr1==null && curr2!=null))return false;

        return true;
    }

    boolean detectLoop() {    // copied from the internet.//
        Node slowPtr = head;
        Node fastPtr = head;

        while (slowPtr != null && fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;         // Move one step at a time
            fastPtr = fastPtr.next.next;    // Move two steps at a time

            // If the two pointers meet, there is a loop
            if (slowPtr == fastPtr) {
                return true;
            }
        }

        // If the loop exits, there is no loop in the linked list
        return false;
    }
}



public class SingleLinkedList {
    public static void main(String[] args) {
        CustomLinkedList ll = new CustomLinkedList();

        for(int i=0;i<=20;i++)ll.addFirst(i);
          System.out.print(ll.findMiddle(ll.head));

//        System.out.print(ll.findNNode(ll.head , 5));
//        ll.deleteNode(ll.head , 5);
//        ll.addNodeAtPosition(ll.head , 4 , 11);
//        ll.head = ll.reverseListWithRecursion(ll.head);
//        ll.printLinkedList();
    }
}
