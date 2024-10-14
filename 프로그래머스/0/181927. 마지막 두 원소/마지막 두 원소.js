function solution(num_list) {
    let a = num_list.length-1;
    let b = num_list.length-2;
    
    if(num_list[a] > num_list[b])
        num_list.push(num_list[a]-num_list[b]);
    else
        num_list.push(num_list[a]*2);
    return num_list;
}