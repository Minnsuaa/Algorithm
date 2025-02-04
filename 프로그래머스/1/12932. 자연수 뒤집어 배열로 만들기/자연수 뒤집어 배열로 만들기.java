class Solution {
    public int[] solution(long n) {
        String s = Long.toString(n);
        char[] arr = s.toCharArray();
        int[] answer = new int[arr.length];
        int cnt = 0;
        
        for(int i = arr.length-1; i >= 0; i--) {
            answer[cnt++] = arr[i]-'0';
        }
        
        return answer;
    }
}