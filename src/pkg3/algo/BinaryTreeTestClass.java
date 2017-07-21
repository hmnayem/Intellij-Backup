package pkg3.algo;

public class BinaryTreeTestClass {

    public static void main(String[] args){

        BinaryTreeClass b = new BinaryTreeClass();
        b.insert(3);
        b.insert(8);
        b.insert(34);b.insert(23);
        b.insert(16);b.insert(25);
        b.insert(11);
        b.insert(30);b.insert(19);
        b.insert(22);
        b.insert(10);
        b.insert(68);b.insert(4);b.insert(99);
        b.insert(81);
        b.insert(90);
        b.insert(123);

        b.disPlay(b.root);

    }
}

class Nodes{

    int data;
    Nodes left;
    Nodes right;

    public Nodes(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

class BinaryTreeClass{

    public static Nodes root;

    public BinaryTreeClass(){
        this.root = null;
    }

    public void insert(int data){

        Nodes newNodes = new Nodes(data);

        if (root == null){
            root = newNodes;
            return;
        }

        Nodes current = root;
        Nodes parent = null;

        while (true){

            parent = current;

            if (data < current.data){
                current = current.left;
                if (current == null){
                    parent.left = newNodes;
                    return;
                }
            }else {
                current = current.right;
                if (current == null){
                    parent.right = newNodes;
                    return;
                }
            }
        }
    }

    public void disPlay(Nodes root){
        if (root != null){
            disPlay(root.left);
            System.out.print(" " + root.data);
            disPlay(root.right);
        }
    }
}


















