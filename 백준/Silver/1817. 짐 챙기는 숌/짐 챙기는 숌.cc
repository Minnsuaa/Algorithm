#include <stdio.h>

int main() {
    int n, m, i, cnt = 0, plus = 0;
    int arr[50];
    scanf("%d %d", &n, &m);
    for(i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
    for(i = 0; i < n; i++) {
        if(plus+arr[i] <= m) {
            plus += arr[i];
        } else {
            plus = 0;
            plus += arr[i];
            cnt++;
        }
    } if(plus!=0) cnt++;
    printf("%d", cnt);
}