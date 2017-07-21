package pkg3.algo.mylinkedlist1;

public class MyListNodeV1<E> {

    private E data;
    private MyListNodeV1<E> next;

    public MyListNodeV1(E data){
        this.data = data;
        this.next = null;
    }

    public void setData(E data){
        this.data = data;
    }

    public void setNext(MyListNodeV1 next){
        this.next = next;
    }

    public E getData(){
        return data;
    }

    public MyListNodeV1 getNext(){
        return next;
    }
}
