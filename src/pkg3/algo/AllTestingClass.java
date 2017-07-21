package pkg3.algo;

public class AllTestingClass {

    public static void main(String[] args){

        ArrayStack<Integer> numbers = new ArrayStack<>(10);

        for (int i=1; i<=10; i++){
            numbers.push(i*i/i+i);
        }

        System.out.println("Stack Poping: ");

        while (!numbers.isEmpty()){
            System.out.println("Popping : " + numbers.pop() );
        }
    }
}
