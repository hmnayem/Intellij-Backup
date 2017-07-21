package pkg3.algo.singlylinkedlist1;

public class SinglyLinkedListTesterClass {

    public static void main(String[] args){

        SinglyLinkedListClass sl = new SinglyLinkedListClass();

        sl.addFirst(45);
        sl.addLast(56);
        sl.addLast(55);
        sl.addLast(9);
        sl.addLast(11);
        sl.addAtIndex(32,3);
        sl.addAtIndex(38, 5);

        System.out.println(sl);
        System.out.println(sl.deleteAtIndex(1));

        System.out.println(sl);
        System.out.println(sl.isEmpty() + "   Size is: " + sl.getSize());

    }
}
