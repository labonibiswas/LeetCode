class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder result = new StringBuilder();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        List<Character> chars = new ArrayList<>(map.keySet()); //put unique elements in the list
        chars.sort((a,b) -> map.get(b) - map.get(a)); //sort list according to frequency
        
        for(char c : chars){
            int count = map.get(c);
            for(int i=0; i< count; i++){
                result.append(c);
            }
        }

        return result.toString();
    }
}