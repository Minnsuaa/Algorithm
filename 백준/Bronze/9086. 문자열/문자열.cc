#include <stdio.h>
#include <string.h>

int main()
{
    int n, i, j;
    char arr[1000];
    scanf("%d", &n);
    for(i = 0; i < n; i++) {
        scanf("%s", arr);
        printf("%c%c\n", arr[0], arr[strlen(arr)-1]);
    }
}
