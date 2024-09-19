def solution(n, k):
    answer = 0
    answer += n * 12000
    if n >= 10 :
        k -= n//10;
    answer += k * 2000;
    return answer