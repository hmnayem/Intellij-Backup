package pkg3.algo;

public interface Stacks<E> {

    int size();

    boolean isEmpty();

    void push(E e);

    E top();

    E pop();
}
