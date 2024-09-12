function solution(my_string, is_prefix) {
    let cnt = 0;
    for(i=0; i<is_prefix.length; i++) {
        if(my_string[i]==is_prefix[i])
            cnt++;
    }
    if(cnt==is_prefix.length)
            return 1;
        else
            return 0;
}