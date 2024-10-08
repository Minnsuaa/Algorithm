function solution(num_list) {
    let odd = 0, even = 0;
    for(let i = 1; i <= num_list.length; i++) {
        if(i % 2 == 0)
            even += num_list[i-1];
        else
            odd += num_list[i-1];
    }
    if(even > odd)
        return even;
    else
        return odd;
    
}