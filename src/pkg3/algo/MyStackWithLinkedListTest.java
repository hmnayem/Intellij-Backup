package pkg3.algo;

public class MyStackWithLinkedListTest{

    public static void main(String[] args){

        MyStackWithLinkedList myStack = new MyStackWithLinkedList();

        myStack.push(45);
        myStack.push(32);
        myStack.push(455);
        myStack.push(11);
        myStack.push(89);
        myStack.push(123);
        myStack.push(66);

        myStack.display();
        System.out.println("Size of Stack is " + myStack.getSize());


        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
        myStack.display();





    }

}

class MyStackWithLinkedList{
    protected class StackNode{
        public int data;
        public StackNode next;

        public StackNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    private StackNode head;
    private int size;

    public MyStackWithLinkedList(){
        head = null;
    }

    public int getSize(){
        return size;
    }

    private void plus(){
        size++;
    }

    private void minus(){
        size--;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void push(int data){
        StackNode node = new StackNode(data);
        node.next = head;
        head = node;
        plus();
    }

    public int pop(){
        int temp;
        if (isEmpty()){
            System.out.println("Stack is Empty");
            temp = -1;
        }
        else {
            temp = head.data;
            head = head.next;
            minus();
        }

        return temp;
    }

    public int peek(){
        if (isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        return head.data;
    }

    public void display(){
        System.out.println();
        StackNode node = head;

        if (isEmpty())
            System.out.println("Stack is Empty");

        while (node != null){
            System.out.print("-> " + node.data);
            node = node.next;
        }
        System.out.println();
    }
}




















