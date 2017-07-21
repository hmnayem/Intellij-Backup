package pkg1.generics;


import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack<T> {

    private final ArrayList<T> elements;

    public Stack(){
        this(10);
    }

    public Stack(int cap){
        int capacity = cap > 0 ? cap : 10;
        elements = new ArrayList<T>(capacity);
    }

    public void push(T pushValue){
        elements.add(pushValue);
    }

    public T pop() {
        if(elements.isEmpty()) {
            System.out.println("Theres no more element");
        }

        return elements.remove(elements.size()-1);
    }
}
