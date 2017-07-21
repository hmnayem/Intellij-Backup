package pkg4.arraytest;

public class ArrayDuplicates {

    public static void main(String[] args){

        int arr[] = {3,7,5,7,6,2,3,1,5,9,4,3,6};

        printSingle(arr);
        System.out.println();
        printDuplicate(arr);

        int dup = printDuplicate(arr);
        System.out.println("\n" + dup);

    }

    private static void printSingle(int[] nums){

        for (int i=0; i<nums.length; i++){
            int j;
            for (j=0; j<i; j++){
                if (nums[i] == nums[j])
                    break;
            }

            if (i==j)
                System.out.print("\t" + nums[i]);
        }
    }

    private static int printDuplicate(int[] nums){

        int count = 0;
        for (int i=0; i<nums.length; i++){
            for (int j=i+1; j<nums.length; j++){
                if (nums[i] == nums[j]){
                    System.out.print("\t" + nums[i]);
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
