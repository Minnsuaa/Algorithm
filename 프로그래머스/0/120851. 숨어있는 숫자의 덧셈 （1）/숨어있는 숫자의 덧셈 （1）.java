class Solution {
    public int solution(String my_string) {
        int answer = 0;
        char[] arr = new char[my_string.length()];
        for(int i = 0; i < my_string.length(); i++) {
            arr[i] = my_string.charAt(i);
            if(Character.isDigit(arr[i]))
                answer += Integer.parseInt(String.valueOf(arr[i]));
        }
        return answer;
    }
}