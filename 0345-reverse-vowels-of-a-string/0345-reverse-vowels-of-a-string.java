class Solution {

    private Boolean isVowel(char c){
        return c == 'a' || c == 'A'||
               c == 'e'|| c == 'E'||
               c == 'i'|| c == 'I'||
               c == 'o'|| c == 'O'||
               c == 'u'|| c == 'U';
    }
    public String reverseVowels(String s) {
        
        char[] ch = s.toCharArray();
        int n = ch.length;
        int st = 0; 
        int end = n-1;

        while(st<end){
            if(!isVowel(ch[st])){
                st++;
                continue;
            } 
            if(!isVowel(ch[end])){
                end--;
                continue;
            } 

            char temp = ch[st];
            ch[st] = ch[end];
            ch[end] = temp;
            st++;
            end--;
        }

        return new String(ch);
    }
}