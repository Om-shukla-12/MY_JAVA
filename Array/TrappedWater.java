
public class TrappedWater {
    
    public static int trappedWater(int arr[]){
        int n = arr.length;
        int leftMax[] = new int[n];
        leftMax[0] = arr[0];
        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(arr[i], leftMax[i-1]);
        }
 
        int rightMax[] = new int[n];
        rightMax[n-1] = arr[n-1];
        for(int i = n-2;i>=0;i--){
            rightMax[i] = Math.max(arr[i], rightMax[i+1]);
        }
 
        int waterTrapped = 0;
        for(int i =0;i<n;i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            waterTrapped += waterLevel - arr[i];
        }
        return waterTrapped;
        }
    
    public static void main(String args[]){
        int arr[] = {3,2,0,5,3,2,5};
        System.out.println("Trapped Water: " + trappedWater(arr));
    }

}