#include <stdio.h>

int main()
{
    int n, i, j;
    char arr[1000];
    scanf("%d", &n);
    for(i = 0; i < n; i++) {
        scanf("%s", arr);
        for(j=0; arr[j]!='\0'; j++) {
        }
        printf("%c%c\n", arr[0], arr[j-1]);
    }
}
