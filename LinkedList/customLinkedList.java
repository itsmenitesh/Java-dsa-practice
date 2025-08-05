package LinkedList;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
    Node(int data , Node next){
        this.data=data;
        this.next=next;
    }
}
class customLinkedList {
    Node head;
    Node tail;
    int size;
    int idx;
    public void addLast(int data){
        Node tba = new Node(data);
        if(head==null){
            head =tba;
            tail = tba;
        }else{
            tail.next=tba;
            tail=tba;
        }
        size +=1;

    }
    public void addFirst(int data){
        Node tba = new Node(data);
        if(head==null){
            head = tba;
            tail = tba;
        }else{
            tba.next=head;
            head=tba;       
        }
        size +=1;
    }
    // [2,3,4,->1<-,5,6]
    public void addit(int data , int idx){
        if(idx ==0)addFirst(data);
        else if(idx==this.size)addLast(data);
        else{
            Node curr = head;
            for(int i=0;i<idx-1;i++)curr=curr.next;
            Node tba =new Node(data , curr.next);
            curr.next=tba;
            size +=1;

        }
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        Node curr = head;
        while(curr !=null){
            sb.append(curr.data).append("->");
            curr = curr.next;
        }
        sb.delete(sb.length()-2, sb.length());
        return sb.toString();
    }
    public int nNode(int data,int idx){
        Node slow=head,fast=head;   //finding elements from last node//
        for(int i=0;i<idx;i++)fast=fast.next;
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow.data;
    }
    public Node delete(int data , int idx){
        Node curr=head;
        for(int i=0;i<idx-1;i++)curr=curr.next;
        curr.next=curr.next.next;
        return head;
    }
    
}
