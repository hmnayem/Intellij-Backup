package pkg3.algo.bst;

public class BSTClass1 {

    public static void main(String[] args){

        BSTree1 tree = new BSTree1();
        tree.insert(100);
        tree.insert(18);
        tree.insert(120);
        tree.insert(15);
        tree.insert(25);
        tree.insert(110);
        tree.insert(130);
        tree.insert(10);
        tree.insert(17);
        tree.insert(20);
        tree.insert(50);
        tree.insert(125);
        tree.insert(155);
        tree.insert(175);
        tree.insert(135);

        tree.display();
        System.out.println();
        tree.preOrder();
        tree.inOrder();
        tree.postOrder();

    }
}

class BSTree1{

    private class BSTNode{
        BSTNode left;
        BSTNode right;
        int data;

        BSTNode(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    private BSTNode root;

    public BSTree1(){
        root = null;
    }

    public void insert(int data){
        BSTNode node = new BSTNode(data);

        if (root == null){
            root = node;
            return;
        }

        BSTNode temp = root;
        BSTNode parent;

        while (true){
            parent = temp;
            if (data<temp.data){
                temp = temp.left;
                if (temp==null){
                    parent.left = node;
                    return;
                }
            }
            else {
                temp = temp.right;
                if (temp == null){
                    parent.right = node;
                    return;
                }
            }
        }
    }

    public void display(BSTNode root){
        if (root != null){
            display(root.left);
            System.out.print("\t" + root.data);
            display(root.right);
        }
    }
    public void display(){
        display(root);
    }

    public void preOrder(BSTNode node){
        if (node == null)
            return;

        System.out.print("  " + node.data);
        preOrder(node.left);
        preOrder(node.right);
    }

    public void preOrder(){
        System.out.println("Displaying Preorder");
        preOrder(root);
        System.out.println();
    }

    public void inOrder(BSTNode node){
        if (node == null)
            return;

        inOrder(node.left);
        System.out.print("  " + node.data);
        inOrder(node.right);
    }

    public void inOrder(){
        System.out.println("Displaying Inorder");
        inOrder(root);
        System.out.println();
    }

    public void postOrder(BSTNode node){
        if (node == null)
            return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.print("  " + node.data);
    }

    public void postOrder(){
        System.out.println("Displaying Postorder");
        postOrder(root);
        System.out.println();
    }

    public boolean find(int data){
        BSTNode node = root;
        while (node!=null){
            if (node.data == data)
                return true;
            else if(node.data>data)
                node = node.left;
            else
                node = node.right;
        }

        return false;
    }

    public BSTNode getSuccessor(BSTNode deleteNode){
        BSTNode successor = null;
        BSTNode successorParent = null;
        BSTNode current = deleteNode.right;

        while (current!=null){
            successorParent = successor;
            successor = current;
            current = current.left;
        }

        if (successor != deleteNode.right){
            successorParent.left = successor.right;
            successor.right = deleteNode.right;
        }

        return successor;
    }

    public void delete(int data){
        BSTNode parent = root;
        BSTNode current = root;
        boolean isLeftChild = false;

        while (current.data!=data){

        }
    }
}




















