import java.util.ServiceConfigurationError;

public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            // left subtree
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void InOrder(Node root) {
        if (root == null) {
            return;
        }
        InOrder(root.left);
        System.out.print(root.data + " ");
        InOrder(root.right);
    }
    public static void PreOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        PreOrder(root.left);
        PreOrder(root.right);
    }

    public static void PostOrder(Node root){
        if(root == null){
            return;
        }
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.data+" ");
    }

    public static boolean Search(Node root , int key){
        if(root ==null){
            return false;

        }
        if(root.data == key){
            return true;
        }else if(root.data>key){
            return Search(root.left , key);
        }else {
            return Search(root.right , key);
        }
    }
    public static Node delete(Node root , int val){
        if(root.data >val){
            root.left=delete(root.left,val);
        }
        else if(root.data<val){
            root.right=delete(root.right,val);
        }else {
            //1.st root with no child
            if(root.left==null && root.right==null){
                return null;
            }

            //2.nd with no left root or right root
            if(root.left==null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }

            //3.rd root with left and right child
            //IS = InOrderSuccessors
            Node IS = InOrderSuccessors(root.right);
            root.data = IS.data;
            root.right = delete(root.right, val);
        }
        return root;

    }
    public static Node InOrderSuccessors(Node root){
        while(root.left !=null){
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        int [] values = {1,2,3,4,5,6,7,8,9,0};
        Node root = null;
        for(int i=0;i<values.length;i++){
            root = insert(root , values[i]);
        }
        InOrder(root);
        System.out.println();
        PreOrder(root);
        System.out.println();
        PostOrder(root);
        System.out.println();
        int val=90;
        boolean ans = Search(root,val);
        if (ans){
            System.out.println("Found");
        }else {
            System.out.println("Not-Found");
        }
        delete(root,val);
        InOrder(root);
    }
}
