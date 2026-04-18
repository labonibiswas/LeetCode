class Solution {
    public int mirrorDistance(int n) {
        int ans = 0;
        int rev = 0;
        int num = n;
        while(num != 0){
            int rem = num%10;
            rev = (rev*10) + rem;
            num = num / 10;
        }
        ans = Math.abs(n - rev);

        return ans;
    }
}