class Solution {
    private void reverse(char arr[], int st, int end){
        while(st<end){
            char temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;end--;
        }
    }

    public String reverseWords(String s) {
        //replace multiple spaces with single space
        s = s.trim().replaceAll("\\s+"," ");
        char arr[] = s.toCharArray();
        int n = arr.length;
        //reverse the whole string
        reverse(arr, 0,n-1);
        
        //reverse word
        int st = 0;
        for(int i=0; i<n; i++){
            if(arr[i] == ' '){
                reverse(arr, st, i-1);
                st = i+1;
            }
        }

        // handle last work which does not end with space
        reverse(arr, st, n-1);

        return new String(arr);

    }
}