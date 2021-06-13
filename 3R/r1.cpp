#include <cstdio>
#include <cstring>

int main(){
	char s1[10];
	scanf("%s", s1);
	int len = strlen(s1);
	//printf("%d\n", len);

	int compareLen = strcmp(s1+len-2, "ar");
	//printf("%d\n", compareLen);

	printf("%s\n", s1);
	printf("%s\n", s1+2);
	printf("%s\n", s1+len);
	printf("%s\n", s1+len-2);

	char tv = s1[len-2];
	printf("%c\n", tv);

	return 0;
}