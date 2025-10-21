class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num<=1){
            return false;
        }
        int sum = 1;
        for(int i=2; i*i <= num; i++){
            if(num%i == 0){
                sum += i;
                if(i != num/i){
                    int pair = num/i;
                    sum += pair;
                }
            }
        }
        return sum == num;
    }
}