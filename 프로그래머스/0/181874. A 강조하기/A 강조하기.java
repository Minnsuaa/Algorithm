class Solution {
    public String solution(String myString) {
        String answer = "";
        for(int i = 0; i < myString.length(); i++) {
            if(myString.charAt(i)==97)
                answer += 'A';
            else if(myString.charAt(i) >= 66 && myString.charAt(i) <= 90)
                answer += (char)(myString.charAt(i)+32);
            else answer += myString.charAt(i);
        }
        return answer;
    }
}