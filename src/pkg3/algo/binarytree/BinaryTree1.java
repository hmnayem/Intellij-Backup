package pkg3.algo.binarytree;

import pkg1.mylinkedlist.Node;

public class BinaryTree1 {

    private BTNode1 root;

    public BinaryTree1(){
        root = null;
    }

    public boolean isEmpty(){
        return root==null;
    }

    public void insert(int data){
        BTNode1 node = new BTNode1(data);
        if (isEmpty()){
            root = node;
            return;
        }

        BTNode1 current = root;
        BTNode1 parent = null;

        while (true){
            parent = current;
            if (data < current.data){
                current = current.left;
                if (current == null){
                    parent.left = node;
                    return;
                }
            }else {
                current = current.right;
                if (current == null){
                    parent.right = node;
                    return;
                }
            }
        }
    }

    private void displayNode(BTNode1 root){
        if (root != null){

            displayNode(root.left);
            System.out.print("  " + root.data);
            displayNode(root.right);
        }
    }

    public void display(){
        displayNode(root);
    }


}


































