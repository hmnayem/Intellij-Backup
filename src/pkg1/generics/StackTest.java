package pkg1.generics;


public class StackTest {

    private static void testPushDouble(Stack<Double> stack, double[] values){
        System.out.println("Pushing Elements on to double stack");

        for(double value : values){
            System.out.print(value + "    ");
            stack.push(value);
        }
    }

    private static void testPopDouble(Stack<Double> stack){
        try{
            System.out.println("Popping Elements from double stack");
            double popValue;

            while (true){
                popValue = stack.pop();
                System.out.print(popValue + "    " );
            }
        }
        catch (EmptyStackException emptyStackException){
            System.err.println();
            emptyStackException.printStackTrace();
        }
    }

    private static void testPushInteger(Stack<Integer> stack, int[] values){
        System.out.println("Pushing Elements on to double stack");

        for(int value : values){
            System.out.print(value + "    ");
            stack.push(value);
        }
    }

    private static void testPopInteger(Stack<Integer> stack){
        try{
            System.out.println("Popping Elements from double stack");
            int popValue;

            while (true){
                popValue = stack.pop();
                System.out.print(popValue + "    " );
            }
        }
        catch (EmptyStackException emptyStackException){
            System.err.println();
            emptyStackException.printStackTrace();
        }
    }

    public static void main(String[] args){
        double [] doubleElems = {1.1,2.2,3.3,4.4,5.5};
        int[] integerELems = {1,2,3,4,5,6,7,8,9, 10};

        Stack<Double> doubleStack = new Stack<>(5);
        Stack<Integer> integerStack = new Stack<>();

        testPushDouble(doubleStack,doubleElems);
        testPopDouble(doubleStack);

        testPushInteger(integerStack, integerELems);
        testPopInteger(integerStack);

    }
}
