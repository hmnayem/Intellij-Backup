package pkg3.algo.circularlinkedlist;

public class CircularTesterClass {

    public static void main(String[] args){

        MyCircularList2 mcl2 = new MyCircularList2();
        mcl2.addLast(45);
        mcl2.addFirst(34);

        mcl2.display();

        mcl2.deleteFirst();
        mcl2.display();

        mcl2.deleteFirst();
        mcl2.display();

    }
}






























