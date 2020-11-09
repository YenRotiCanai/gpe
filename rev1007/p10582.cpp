#include <stdio.h>
#include <string.h>
int main(){
	char s[1000001];
	int i, j, k, len, flag;
	while(scanf("%s",s) != EOF){
		if(strcmp(s,'.') == 0) break; //strcmp用來比較左右兩個字串是否一樣，如果一樣就是 0
		len = strlen(s); //strlen 用來計算長度
		flag = 0;
		for(i=1; i<=len; i++){
			if(len%i != 0) continue; //如果 i 不是 len 的因數（i 除不完 len），那他肯定不是 a，所以直接跳下一輪測試（for loop 跳到下一個 i）
			flag = 1;
			for(j=i; j<len && flag==1; j+=i){
				
			}
		}
	}
}