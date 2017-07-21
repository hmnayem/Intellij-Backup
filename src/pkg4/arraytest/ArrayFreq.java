package pkg4.arraytest;

public class ArrayFreq {

    public static void main(String[] args){
        int arr[] = {2,3,3,3,3,2,2,2,2,3,4,5,6,7,7,6,5,5,5,7,7,3,4,5,2};

        for (int i=0; i<arr.length; i++){
            int count = 1;

            for (int j=i+i; j<arr.length; j++){
                if (arr[i] == arr[j] && arr[i] != '\0'){
                    count++;
                    arr[j] = '\0';
                }
            }

            if (arr[i] != '\0')
                System.out.println(arr[i] + "  -->  " + count);

        }
    }
}
