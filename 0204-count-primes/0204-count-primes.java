class Solution {
    public int countPrimes(int n) {
        //1. base case
        if(n <=2){
            return 0;
        }
        //2. array initialize and set all element as 1(true).
        boolean isPrime[] = new boolean[n];
        for(int i=2; i<n; i++){
            isPrime[i] = true;
        }

        //3. sieve operation
        //check prime upto sqrt(i)
        for(int i=2; i*i<n; i++){
            if(isPrime[i]){
                for(int j=i*i; j<n; j += i){
                    isPrime[j] = false;
                }
            }
        }

        //4. count prime
        int count=0;
        for(int i=2; i<n; i++){
            if(isPrime[i]){
                count++;
            }
        }

        return count;
    }
}