//public class newPractice {
//    /////////////////  swap two values without a third variable //////////////////////////////////////
//    public class DoctorPatient {
//        public static void main(String[] args) {
//            int a = 6;
//            int b = 1;
//            a = a + b;
//            b = a - b;
//            a = a - b;
//            System.out.print("a" + " = " + a + " , " + "b" + " = " + b);
//        }
//    }
//}
//    /////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    /////////////////////////////// jump game ///////////////////////////////////////////////////////////
//    class Solution {
//        public boolean canJump(int[] nums) {
//            int jump =0;
//            for(int i=0;i<nums.length;i++){
//                if(i>jump)return false;
//                jump = Math.max(jump,i+nums[i]);
//            }
//            return true;
//        }
//    }
//    /////////////////////////////////////////////////////////////////////////////////////////////////////////
//
/////////////////////// reverse LinkedList ///////////////////////////////////////////////////////////////////
//
////class Node{
////    int data;
////    Node next;
////    Node(int data){
////        this.data=data;
////        this.next=null;
////    }
////}
////class CustomLinkedList{
////    Node head;
////    Node tail;
////    void printLinkedList(){  // printing
////        Node curr = this.head;
////        while(curr!=null){
////            System.out.print(curr.data+" ");
////            curr=curr.next;
////        }
////    }
////
////    void addFirst(int data){  // addFirst
////        Node tba = new Node(data);
////        if(head == null){
////            head = tba;
////            tail = tba;
////        }else{
////            tba.next=head;
////            head=tba;
////        }
////    }
////
////    void addLast(int  data){   // addLast
////        Node tba = new Node(data);
////        if(head==null){
////            head=tba;
////            tail=tba;
////        }else{
////            tail.next=tba;
////            tail=tba;
////        }
////    }
////    Node reversList(Node head){  // reverse
////        Node curr=head;
////        Node prev=null;
////        while(curr!=null){
////            Node temp =curr.next;
////            curr.next=prev;
////            prev=curr;
////            curr=temp;
////        }
////        return prev;
////    }
////
////}
////
////
////
////public class SingleLinkedList {
////    public static void main(String[] args) {
////        CustomLinkedList ll = new CustomLinkedList();
////
////        for(int i=0;i<=10;i++)ll.addFirst(i);
////        ll.head = ll.reversList(ll.head);
////        ll.printLinkedList();
////    }
////}
//
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////// Array to LinkedList //////////////////////////////////////////////////////////////
//
//import java.util.*;
//class Node{
//    int data;
//    int prev;
//    Node next;
//    Node(int prev,int data){
//        this.prev=prev;
//        this.data=data;
//        this.next=null;
//    }
//}
//
//class CustomList{
//    Node head;
//    Node tail;
//
//    void addLast(int key , int val){
//        Node tba = new Node(key , val);
//        if(head==null){
//            head=tba;
//            tail=tba;
//        }else{
//            tail.next=tba;
//            tail=tba;
//        }
//
//    }
//    void printList(){
//        Node curr = this.head;
//        while(curr!=null){
//            System.out.print("["+curr.prev+" "+curr.data+"]"+" ");
//            curr=curr.next;
//        }
//    }
//
//}
//public class DoctorPatient
//{
//    public static void arrData(CustomList customList){
//        int arr []={1,1,1,1,1,2,2,2,2,2,2,3,3,3,3,3,3,4,4,4,4,4,4,5,5,5,5,9,9,9,9,9,9,10};
//        HashMap<Integer,Integer> hm = new HashMap<>();
//        for(int i=0;i<arr.length;i++) {
//            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
//        }
//
//        for(int key : hm.keySet()){
//            int val = hm.get(key);
//            customList.addLast(key, val);
//        }
//    }
//
//    public static void main(String[] args) {
//        CustomList customList = new CustomList();
//        arrData(customList);
//        customList.printList();
//
//    }
//}
