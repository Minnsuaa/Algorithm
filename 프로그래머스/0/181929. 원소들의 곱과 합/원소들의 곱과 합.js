function solution(num_list) {
    let plus = 0, mul = 1;
    for(let i = 0; i < num_list.length; i++) {
        plus += num_list[i];
        mul *= num_list[i];
    }
    plus *= plus;
    if(plus > mul)
        return 1;
    else return 0;
}