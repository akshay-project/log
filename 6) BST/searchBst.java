class Node
{   
    int key;
    Node left;
    Node right;
    
    Node(int val)
    {   
        key = val;
        left = null;
        right = null;
    }
}

public class BinarySearchTree
{
    Node root;

    public Node insert(Node root, int val)
    {
        if(root == null)
            return new Node(val);
        else if(root.key < val)
            root.right = insert(root.right,val);
        else if(root.key > val)
            root.left = insert(root.left,val);
        return root;
    }

    public boolean search(Node root, int key)
    {
        if(root == null)
            return false;
        if(root.key == key)
            return true;
        if(root.key < key)
            return search(root.right,key);
        else
            return search(root.left,key);
    }

    public static void main(String args[])
    {
        BinarySearchTree bst = new BinarySearchTree();
        bst.root = bst.insert(bst.root, 100);
        bst.root = bst.insert(bst.root, 50);
        bst.root = bst.insert(bst.root, 150);
        bst.root = bst.insert(bst.root, 125);

        System.out.println("Binary Search Tree Elements Are: 100, 50, 150, 125");

        System.out.println("Searching Element: "+50);
        if(bst.search(bst.root,150) == true)
            System.out.println("Search Found");
        else
            System.out.println("Search Not Found");

        System.out.println("Searching Element: "+500);
        if(bst.search(bst.root,500) == true)
            System.out.println("Search Found");
        else
            System.out.println("Search Not Found");
    }
}