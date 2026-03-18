class Solution {
    public int maxVowels(String s, int k) {
        int max = 0;
        int curr = 0;
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');vowels.add('e');vowels.add('i');vowels.add('o');vowels.add('u');
        for(int i=0; i<k; i++){
            if(vowels.contains(s.charAt(i))) curr++;
        }
        max = curr;

        for(int i=k; i<s.length(); i++){
            if(vowels.contains(s.charAt(i-k))) curr--;
            if(vowels.contains(s.charAt(i))) curr++;
            max = Math.max(max, curr);
        }
        return max;
    }
}