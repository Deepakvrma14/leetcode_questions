class Solution {
    public int search(int[] arr, int target) {
//         if (nums == null || nums.length == 0) return -1;
        
//         int left = 0;
//         int right = nums.length -1;
//         while (left < right) {
//             int mid = (left+right) / 2;
//             if (nums[mid] < nums[0]) {
//                 right = mid;
//             } else {
//                 left = mid+1;
//             }
//         }
        
//         int breakingIndex = right;
//         left = 0;
//         right = nums.length-1;
        
//         if (target >= nums[0]) {
//             right = breakingIndex;
//         } else {
//             left = breakingIndex;
//         }
        
//         while (left <= right) { // include equal sign
//             int mid = (left+right) / 2;
//             if (target == nums[mid]) {
//                 return mid;
//             } else if (target > nums[mid]) {
//                 left = mid+1; // if it's not decrementing, infinite while loop might occur
//             } else {
//                 right = mid-1;  // if it's not decrementing, infinite while loop might occur
//             }
//         }
        
//         return -1;
        
        
        return searchh(arr,target,0,arr.length-1);
    }
    static int searchh(int[] arr, int target,  int s , int e){
        int m = s + (e - s)/2;
        if(s>e){
            return -1;
        }
        if(arr[0] == target){
            return 0;
        }
        if(arr[m] == target ){
            return m;
        }
        if(arr[s] <=arr[m]){
            if(target >=arr[s] && target <= arr[m]){
                return searchh(arr, target, s, m-1);
            }
            else{
                return searchh(arr, target, m+1,e);
            }
            

        }
        if(target >=arr[m] && target <= arr[e]){
            return searchh(arr, target, m+1, e);
        }
        return searchh (arr,target, s, m-1);
    }
    
}