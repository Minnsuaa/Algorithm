function solution(arr, k) {
    let answer = [];
    let i;
    if(k%2==0) {
        for(i = 0; i < arr.length; i++) {
            answer.push(arr[i]+k);
        }
    } else {
        for(i = 0; i < arr.length; i++) {
            answer.push(arr[i]*k);
        }
    }
    return answer;
}