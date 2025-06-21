import java.util.Arrays;

public class Array {

// problem 1 : reverse an array
    // { int [] arr = {1, 2, 3, 4, 5};
    //   for(int i = arr.length - 1; i >= 0; i--) {
    //         System.out.print(arr[i] + " ");
    //     } System.out.println();}

     
// problem 2 and 3 : find the minimum and maximum value in an array and also kth element
    //     int n = 2;
    //     int [] arr = {2,3,1,5,4};
    //   Arrays.sort(arr);
    // // int max = arr[0];
    // // for(int i = 0; i < arr.length; i++) {
    // //     if(arr[i] < min) {
    // //         min = arr[i];
    // //         }
    // //     if(arr[i] > max) {
    // //         max = arr[i];
    // //         }
    // //     }
    // // System.out.println("Minimum value: " + min);
    // System.out.println("Maximum value: " + arr);
    // System.out.println(arr[n]);

    public static void main(String[] args){
        // problem 4 : sort an array
        // int [] arr = {0,1,2,0,1,2,-1,-2,-3};
        int [] arr = {0,1,2};
        int arr2[]={2,3,4,5};
        arr = Arrays.copyOf(arr, arr.length + arr2.length);
        
        // System.out.println(arr);
        System.arraycopy(arr2, 0, arr, arr.length - arr2.length, arr2.length);
        System.out.println(Arrays.toString(arr));
    }
}
        

