class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int ca1 = 0, ca2 = 0;
        for(int i = 0; i < goal.length; i++) {
            if(ca1 < cards1.length && goal[i].equals(cards1[ca1]))
                ca1++;
            else if(ca2 < cards2.length && goal[i].equals(cards2[ca2]))
                ca2++;
            else return "No";
        }
        return "Yes";
    }
}