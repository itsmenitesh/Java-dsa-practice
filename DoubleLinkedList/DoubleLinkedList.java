package DoubleLinkedList;

//printList
//printFromLast
//addLast
//addFast
//reverse
class Node{
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data=data;
        this.prev=null;
        this.next=null;
    }
}
class CustomDoubleList{
    Node head;
    Node tail;

    void printList(){
        Node curr = this.head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }
    void printFromLast(){
        Node curr = this.tail;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.prev;
        }
        System.out.println();
    }

    void addLast(int data){
        Node tba=new Node(data);
        if(head==null){
            head=tba;
            tail=tba;
        }else{
            tail.next=tba;
            tba.prev=tail;
            tail=tba;
        }
    }

    void addFast(int data){
        Node tba = new Node(data);
        if(head==null){
            head=tba;
            tail=tba;
        }else{
            head.prev=tba;
            tba.next=head;
            head=tba;
        }
    }
    void  reverse(){

        Node curr=this.head;
        Node prev=null;
        while (curr!=null){

           Node temp =curr.next;
            curr.next=prev;
            prev = curr;
            curr = temp;
        }
        this.head =prev;
    }

}
public class DoubleLinkedList {
    public static void main(String[] args) {
        CustomDoubleList dll= new CustomDoubleList();
        for(int i=0;i<=10;i++)dll.addFast(i);
//        dll.reverse();
        dll.printList();
        dll.printFromLast();

    }
}
