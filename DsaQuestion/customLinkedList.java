//
//class Node{
//    int data;
//    Node next;
//
//    Node(int data){
//        this.data = data;
//    }
//    Node(int data , Node next){
//        this.data = data;
//        this.next = next;
//    }
//}
//public class customLinkedList {
//     Node head;
//     Node tail;
//     int size ;
//     int idx;
//
//     public void addFirst(int data){
//         Node tba = new Node(data);
//         if(head == null){
//             head = tba ;
//             tail = tba;
//         }else {
//             tba = head.next;
//             head = tba;
//         }
//     }
//     public void addLast(int data){
//         Node tba = new Node(data);
//
//         if(head == null){
//             head = tba;
//             tail = tba;
//         }else {
//            tail.next = tba;
//             tail = tba;
//         }
//     }
//     public void addIt(int data , int idx){
//         if(idx ==0){
//             addFirst(data);
//         }else if (idx==this.size){
//             addLast(data);
//         }else{
//             Node curr = head;
//             for(int i = 0;i<idx - 1;i++)curr = curr.next;
//             Node tba = new Node(data , curr.next);
//             curr.next = tba;
//
//         }
//     }
//     public Node delete(int data , int idx){
//         Node curr = head;
//         for(int i=0;i<idx -1 ;i++)curr= curr.next;
//         curr.next = curr.next.next;
//         return head;
//     }
//     public int nNode(int data , int idx){
//         Node slow = head , fast = head;
//         for(int i=0;i<idx;i++)fast = fast.next;
//         while(fast != null){
//             slow = slow.next;
//             fast = fast.next;
//         }
//         return slow.data;
//     }
//     public Node reverse(int data){
//         Node prev= null , curr = head , next;
//         while (curr != null){
//             next = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = next;
//         }
//         return prev;
//     }
//     public String toString(){
//         StringBuilder sb = new StringBuilder();
//         Node curr = head;
//         while(curr != null){
//             sb.append(curr.data).append("->");
//             curr = curr.next;
//         }
//         sb.delete(sb.length()-2 , sb.length());
//         return sb.toString();
//     }
//
//    public static void main(String[] args) {
//        customLinkedList list1 = new customLinkedList();
//        for(int i=0;i<10;i++)list1.addFirst(i);;
//        System.out.print(list1);
//    }
//
//}
