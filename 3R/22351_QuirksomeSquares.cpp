#include <cstdio>
#include <cstring>

void Quirk(int n){
    int Size = 1;

    //先把 size 算出來，只算到 n/2 就好
    for(int i=0; i<n/2; i++){
        Size *= 10;
    }

    for(int i=0; i<Size; i++){
        int Square = i*i;
        if(((Square/Size)+(Square%Size)) == i){
            if(n==2) printf("%02d\n", Square);
            else if(n==4) printf("%04d\n", Square);
            else if(n==6) printf("%06d\n", Square);
            else if(n==8) printf("%08d\n", Square);
        }
    }
}

int main(){
    int n;
    
    while(scanf("%d", &n)!=EOF){
        Quirk(n);
    }

    return 0;
}