class Solution {
    public int numberOfSubstrings(String s) {
        int l = 0, r = 0, count = 0;
        int map[] = new int[3];
        int n= s.length();
        while(r< n){
            map[s.charAt(r) - 'a']++;
            while(map[0] > 0 && map[1] > 0 && map[2] > 0){
                count += n-r;
                map[s.charAt(l) - 'a']--;
                l++;
            }
            r++;
        }

        return count;
    }
}