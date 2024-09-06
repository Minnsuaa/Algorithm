function solution(start_num, end_num) {
    let answer = [];
    let count = start_num;
    for(let i = 0; i <= start_num-end_num; i++) {
        answer[i] = count--;
    }
    return answer;
}