#include <cstdlib>
#include <cstdio>
#include <vector>

using namespace std;

int prime[35009];

vector<int> primeList;

int main(){
    for(int i=0; i<35000; i++){
        if(i==2) prime[i] = 2;
        else if(i%2==0) prime[i] = 0;
        else prime[i] = i;
    }
    primeList.push_back(2);

    for(int i=3; i<35000; i+=2){
        int tmp = prime[i];
        
        if(tmp==0) continue;

        for(int j = i+tmp; j<35000; j+=tmp){
            prime[j] = 0;
        }

        primeList.push_back(tmp);
    }

    int number, i;

    while(scanf("%d", &number) == 1){
        if(number == 0) break;
        else{
            vector<int> list;
            for(i=0; i<number; i++){
                list.push_back(i+1);
            }

            int index1=0, index2=0;

            while(list.size()>1){
                int m = primeList[index1++];
                index2 = (index2 + m - 1) % list.size();
                list.erase(list.begin() + index2);
            }
            printf("%d\n", list[0]);
        }
    }
}