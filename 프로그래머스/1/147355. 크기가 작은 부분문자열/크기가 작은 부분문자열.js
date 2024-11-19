function solution(t, p) {
    let answer = 0;
    for(let i = 0; i < t.length; i++) {
        if(i+p.length <= t.length) {
            let a = parseInt(t.substring(i, i+p.length));
            if(a <= parseInt(p))
                answer++;
        }
        
    }
    return answer;
}