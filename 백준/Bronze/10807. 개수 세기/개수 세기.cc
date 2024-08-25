#include <stdio.h>

int main(void) {
	int arr[100];
	int n, i, v, cnt=0;
	scanf("%d", &n);
	for(i=0; i<n; i++) {
		scanf("%d ", &arr[i]);
	}
	scanf("%d", &v);
	for(i=0; i<n; i++) {
		if(arr[i]==v)
			cnt++;
	}
	printf("%d", cnt);
}