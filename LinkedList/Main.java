package LinkedList;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        customLinkedList list1 = new customLinkedList();
        // customLinkedList list2 = new customLinkedList();
        for(int i=0;i<10;i++)list1.addFirst(i);
        // for(int i=0;i<10;i++)list2.addLast(i*10);
        list1.addit(100,4);
        System.out.println(list1);
        // System.out.println(list2);
    }

}











