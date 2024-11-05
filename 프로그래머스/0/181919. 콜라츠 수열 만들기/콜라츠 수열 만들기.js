function solution(n) {
    let answer = [];
    answer.push(n);
    while(n != 1) {
        if(n%2==0)
            n /= 2;
        else if (n%2!=0)
            n = 3*n+1;
        answer.push(n);
    }
    return answer;
}