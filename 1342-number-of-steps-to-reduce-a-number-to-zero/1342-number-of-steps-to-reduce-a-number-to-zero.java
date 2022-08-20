class Solution {
    public int numberOfSteps(int num) {
        return count(num);
    }
    static int count(int n){
        return helper(n ,0);
    }
    static int helper (int n , int count){
        if(n == 0){
            return count;
        }
        if(n % 2 == 0 ) {
            return helper(n/2, count + 1);
        }
        return helper (n-1, count+1 );
    }
}