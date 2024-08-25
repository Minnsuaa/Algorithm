#include <stdio.h>

int main(void) {
	int n, a, x, i;
	scanf("%d %d", &a, &x);
	int arr[a];
	for(i=0; i<a; i++) {
		scanf("%d", &arr[i]);
	}
	for(i=0; i<a; i++) {
		if(arr[i]<x)
			printf("%d ", arr[i]);
	}
}