#include <stdio.h>

int main()
{
    int a = 0, b = 0;
    int arr[5] = {0,};
    for(int i = 0; i < 5; i++) {
        scanf("%d", &arr[i]);
    }
    if(arr[1]%arr[3]==0)
        a = arr[1]/arr[3];
    else
        a = arr[1]/arr[3]+1;
    if(arr[2]%arr[4]==0)
        b = arr[2]/arr[4];
    else
        b = arr[2]/arr[4]+1;
    if(a > b) {
        printf("%d", arr[0]-a);
    } else {
        printf("%d", arr[0]-b);
    }
}