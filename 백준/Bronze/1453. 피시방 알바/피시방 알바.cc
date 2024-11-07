#include <stdio.h>

int main()
{
    int num = 0, cnt = 0, input = 0;
    scanf("%d", &num);
    int arr[100] = {0,};
    for(int i = 0; i < num; i++) {
        scanf("%d", &input);
        if(arr[input-1]==0)
            arr[input-1] = 1;
        else
            cnt++;
    }
    printf("%d", cnt);
}