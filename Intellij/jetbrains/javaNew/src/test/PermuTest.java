package test;

public class PermuTest {

    private static int count = 0;

    public static void main(String...args){

        String name = "SHEGUFA";

        perm(name.toCharArray(), 0, name.length()-1);
        System.out.println("Total : " + count);

    }

    private static void perm(char[] arr, int left, int right){
        if (left == right){
            System.out.println(arr);
            count++;
        }else {
            for (int i=left; i<=right; i++){
                char temp = arr[i];
                arr[i] = arr[left];
                arr[left] = temp;

                perm(arr, left+1, right);

                char temp2 = arr[i];
                arr[i] = arr[left];
                arr[left] = temp2;
            }
        }
    }
}
