#include <stdio.h>

int main(void) {
    int n,i,answer=0,max,num;
    scanf("%d", &n);
    int arr[50] = {0};
    for(i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
    while(1) {
        max = 0;
        num = 0;
        for(i = 1; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
                num = i;
            }
        }
        if(arr[0] > max)
            break;
        else {
            arr[0] += 1;
            arr[num] -= 1;
            answer++;
        }
    }
    printf("%d", answer);
}