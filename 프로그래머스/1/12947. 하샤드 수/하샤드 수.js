function solution(x) {
    let num = x.toString();
    let a = 0;
    for(let i = 0; i < num.length; i++) {
        a += parseInt(num.charAt(i));
    }
    if(x%a == 0)
        return true;
    else
        return false;
}