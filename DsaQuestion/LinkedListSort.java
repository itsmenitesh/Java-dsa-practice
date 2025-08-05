public class LinkedListSort {
    public static void main(String[] args) {

        CustomList ll = new CustomList();
        int[] arr = {2, 5, 7, 8, 9, 4, 2, 6, 47, 5, 1, 0};

        Node head = ll.convertToList(arr);
        System.out.println("Before sorting ");
        ll.printList(head);
        Node sorted = ll.divide(head);
        System.out.println("After Sorting");
        ll.printList(sorted);
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class CustomList {
    // You can keep a reference to the head and tail in this class if needed, but it's not necessary for your current implementation.

    static Node convertToList(int arr[]) {
        if (arr.length == 0) return null;
        Node head = new Node(arr[0]);
        Node current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }
        return head;
    }

    static Node divide(Node head) {
        if (head == null || head.next == null) return head;
        Node middle = middle(head);
        Node middleNext = middle.next;
        middle.next = null;

        Node left = divide(head);
        Node right = divide(middleNext);
        return merge(left, right);
    }
//static Node divide(Node head) {
//    if (head == null || head.next == null) return head;
//
//    Node middle = middle(head);
//    Node middleNext = middle.next;
//    middle.next = null;
//
//    // Sort the left half in ascending order
//    Node left = divide(head);
//
//    // The right half remains unchanged
//    Node right = middleNext;
//
//    return merge(left, right);
//}


    static Node merge(Node left, Node right) {
        Node dummy = new Node(0);
        Node current = dummy;
        while (left != null && right != null) {
            if (left.data <= right.data) {
                current.next = left;
                left = left.next;
            } else {
                current.next = right;
                right = right.next;
            }
            current = current.next;
        }
        if (left != null) {
            current.next = left;
        }
        if (right != null) {
            current.next = right;
        }

        return dummy.next;
    }

    static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    static Node middle(Node head) {
        if (head == null) return head;
        Node fast = head, slow = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
