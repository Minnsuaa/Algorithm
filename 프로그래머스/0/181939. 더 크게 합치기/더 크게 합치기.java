class Solution {
    public int solution(int a, int b) {
        String str1 = Integer.toString(a)+Integer.toString(b);
        String str2 = Integer.toString(b)+Integer.toString(a);
        
        if(Integer.parseInt(str1)>Integer.parseInt(str2))
            return Integer.parseInt(str1);
        else
            return Integer.parseInt(str2);
    }
}