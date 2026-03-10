class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int n1 = str1.length();
        int n2 = str2.length();
        while(n2 != 0){
            int temp = n1;
            n1 = n1/n2;
            n2 = n1;
        }

    }
}