class Solution {
    public void reverseString(char[] s) {
        int st = 0;
        int end = s.length-1;
        while(end > st){
            char temp = s[st];
            s[st] = s[end];
            s[end] = temp;
            st++;
            end--;
        }

        for(int i=0; i<end; i++){
            System.out.print(s[i] + ", ");
        }
    }
}