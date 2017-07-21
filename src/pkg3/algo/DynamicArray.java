package pkg3.algo;

public class DynamicArray {

    public static final int CAPACITY = 3;
    private int[] data;
    private int size = 0;

    public DynamicArray(){
        data = new int[CAPACITY];
    }

    public DynamicArray(int capacity){
        data = new int[capacity];
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int get(int i) throws IndexOutOfBoundsException{
        checkIndex(i, size+1);
        return data[i];
    }

    public int set(int i, int e) throws IndexOutOfBoundsException{
        checkIndex(i, size+1);

        int temp = data[i];
        data[i] = e;

        return temp;
    }

    public void add(int i, int e) throws IndexOutOfBoundsException{
        checkIndex(i, size+1);

        if (size == data.length)
            resize(2* data.length);

        for (int k=size-1; k>=i; k--)
            data[k+1] = data[k];

        data[i] = e;
        size++;
    }

    public void add(int e) throws IndexOutOfBoundsException{

        if (size == data.length)
            resize(2* data.length);

        data[size] = e;
        size++;
    }

    public int remove(int i) throws IndexOutOfBoundsException{
        checkIndex(i, size);

        int temp = data[i];

        for (int k=i; k<size-1; k++)
            data[k] = data[k+1];

        data[size-1] = 0;
        size--;

        return temp;
    }



    protected void resize(int capacity){
        int [] temp = new int[capacity];

        for (int k=0; k<size; k++)
            temp[k] = data[k];

        data = temp;
    }

    protected void checkIndex(int i, int n) throws IndexOutOfBoundsException{
        if (i<0 || i>=n)
            throw new IndexOutOfBoundsException("Illegal index: " + i);
    }


    public static void main(String[] args){
        DynamicArray da = new DynamicArray();

        da.add(5);
        da.add(4);
        da.add(7);
        da.add(2);
        da.add(9);

        int i=0;
        while (!da.isEmpty()){
            System.out.println(da.get(i));
            i++;
        }
    }
}
