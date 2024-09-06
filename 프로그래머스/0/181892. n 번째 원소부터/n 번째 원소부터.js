function solution(num_list, n) {
    var answer = [];
    for(let i = 0; i<num_list.length; i++) {
        if(i==n-1) {
            answer.push(num_list[i]);
            n++;
        } 
    }
    return answer;
}