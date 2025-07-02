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

   
        // problem 4 : sort an array
        // int [] arr = {0,1,2,0,1,2,-1,-2,-3};
        // int [] arr = {0,1,2};
        // int arr2[]={2,3,4,5};
        // arr = Arrays.copyOf(arr, arr.length + arr2.length);
        
        // // System.out.println(arr);
        // System.arraycopy(arr2, 0, arr, arr.length - arr2.length, arr2.length);
        // System.out.println(Arrays.toString(arr));
         
 // rotate array by one position
            // int[] arr = {1, 2, 3, 4, 5};
            // int n = arr.length;
            // // int temp = arr[n - 1];
            // System.out.println(n);
            // int last = arr[n-1];
            // for(int i = n-1; i>0;i--){
            //     arr[i] = arr[i-1];
                
            // }
            // arr[0] = last;
            // System.out.println(Arrays.toString(arr));

// problem 5 : find the sum of all subarrays
            // int[] arr = {2,-4,3,5,-1,6,-2,4};
            // int maxSum = 0;
            // for(int st=0;st<arr.length;st++){
            //     int sum = 0;
            //     for(int end=st;end<arr.length;end++){
            //         sum+= arr[end];
            //         maxSum = Math.max(maxSum, sum);
            //         if(sum < 0){
            //             sum = 0; // reset sum if it goes negative
            //         }
            //     }
            // }
            //  System.out.println("Sum of all subarrays: " + maxSum); 
            
            // largest number from array
// public static int largestNumber(int arr[]) {
//      int largest = 0;  
//     for(int i = 0; i< arr.length;i++){
//         if(arr[i] > largest){
//             largest = arr[i];
//         }
//     }
//     return largest;
// // }

// problem 6 : find the maximum subarray sum using prefix sum
// public static void prefixSum(int arr[]){
//     int maxSum = Integer.MIN_VALUE;
//      int prefix[] = new int[arr.length];
//      prefix[0] = arr[0];
//      for(int i = 1 ; i<prefix.length; i++){
//          prefix[i] = prefix[i-1] + arr[i];
//      }
//      for(int i = 0; i<arr.length;i++){
//         int curSum = 0;
//         for(int j = i;j<arr.length;j++){
//             int end = j;
//             if(i == 0){
//                 curSum = prefix[end];
//             } else {
//                 curSum = prefix[end] - prefix[i-1];
//             }
//             if(curSum > maxSum){
//                 maxSum = curSum;
//             }
            
//         }
        
//      }
//         System.out.println("Maximum subarray sum: " + maxSum);
// }

// problem 7 : find the maximum consecutive 1's in an array
// public static int findConsecutive(int arr[]) {
//     int count = 0; int  maxCount = 0;
//     for(int i = 0;i<arr.length;i++){
//         if(arr[i]== 1 ){
//             count++;
//             if(count > maxCount){
//                 maxCount = count;
//             }
//         }else{
//                 count = 0;
//             }
//     }
//     return maxCount;
// }

// problem 8 : move all zeroes to the end of the array
// public static void moveZeroes(int arr[]) {
//     int n = arr.length;
//     // int last= n-1;
//     int j = 0;
//     for(int i =0;i< n;i++){
//         if(arr[i] != 0){
//             arr[j]= arr[i]; 
//             j++;
//         } 
//     }
//     while(j<n){
//         arr[j]=0;
//         j++;
//     }
//     System.out.println(Arrays.toString(arr));
// }

// public static void reverseGroup(int arr[], int k) {
//     for(int i = 0; i< arr.length; i+=k){
//         int left = i;
//         int right = Math.min(i + k - 1, arr.length - 1);

//         while(left < right){
//             int temp = arr[left];
//             arr[left]=arr[right];
//             arr[right]=temp;
//             left++;
//             right--;
//         }
//     }
//     // System.out.println(Arrays.toString(arr));
// }
// public static void rotateArray(int arr[], int k) {
//     int n = arr.length;
//     k = k%n; // handle cases where k is greater than n
//     int temp [] = new int [k];

//     for(int i = 0;i<k;i++){
//         temp[i]=arr[i];
//     }

//     for(int i=k;i<n;i++){
//         arr[i-k]=arr[i];
//     }
//     for(int i = 0;i<k;i++){
//         arr[n - k + i]= temp[i];
//     }
//     System.out.println(Arrays.toString(arr));
// }

// problem 9 : find the minimum difference between the maximum and minimum elements after modifying the array
// public static int getMinDiff(int[] arr, int k) {
//         int n = arr.length;
//         if(n==0 || n==1) return 0;
        
//         Arrays.sort(arr);
//         int result = arr[n-1] - arr[0];
//         int smallest = arr[0] + k;
//         int largest = arr[n-1] - k;
        
//         for(int i=0; i<n-1; i++) {
//             int min = Math.min(smallest, arr[i+1] - k);
//             int max = Math.max(largest, arr[i] + k);
            
//             if(min < 0) continue;
            
//             result = Math.min(result, max-min);
//         }
        
//         return result;
//     }

// problem 10 : add one to a number represented as an array
//  static int[] addOne(int[] arr) {

       
//         int carry = 1;

//         for(int i = arr.length - 1; i >= 0; i--) {
//             int sum = arr[i] + carry;
//             arr[i] = sum % 10;
//             carry = sum / 10;
//         }

//         if(carry > 0) {
//             int[] newArr = new int[arr.length + 1];
//             newArr[0] = carry;
//             System.arraycopy(arr, 0, newArr, 1, arr.length);
//             return newArr;
//         }

//         return arr;
//     }

    public static void ptn() {
        for(int i = 1; i<=10 ; i++){
            for(int j = 1; j<=i;j++){
                
                System.out.print("*");
            }
        
             System.out.println(" ");
        }
    }


            public static void main(String[] args){
            // int arr[] = {1,2,3,4,5,6,7,8};

           ptn();
           
           
    }

}

