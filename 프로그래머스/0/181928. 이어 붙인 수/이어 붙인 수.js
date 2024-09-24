function solution(num_list) {
    let even = [], odd = [];
    for(let i = 0; i < num_list.length; i++) {
        if(num_list[i]%2==0)
            even.push(num_list[i].toString());
        else
            odd.push(num_list[i].toString());
    }
    return parseInt(even.join('')) + parseInt(odd.join(''));
}