//https://blog.csdn.net/mobius_strip/article/details/38539407
#include <cstdio>

int main(){
	char str[32];

	while(gets(str)){
		int n;

		if(str[1] == 'x'){
			sscanf(str, "%x", &n);
			printf("%d\n",n );
		}else{
			sscanf(str, "%d", &n);
			if(n<0) break;
			printf("0x%X\n",n);
		}
	}
	return 0;
}