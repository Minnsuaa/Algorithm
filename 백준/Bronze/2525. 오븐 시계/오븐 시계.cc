#include <stdio.h>

int main(void) {
	int H, M, time;
	scanf("%d %d %d", &H, &M, &time);
	
	if((M+time)>=60) {
		H += (M+time)/60;
		M = (M+time)%60;
		if(H>=24) {
			H = H%24;
		}
	}
	else {
		M += time;
	}
	printf("%d %d", H, M);
	return 0;
} 