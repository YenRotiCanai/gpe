#include <iostream>
#include <map>
#include <set>
using namespace std;

int main(){
    int n;
    while(cin >> n && n){

        //用 map 來記錄選課組合的次數
        //set<int> 是選課組合的結構
        map<set<int>,int> count;

        //M 是最多次數
        //MC 是次數為 M 的集合數量
        int M=0, MC=0;

        while(n--){

            set<int> suit; //選課組合

            for(int m=0; m<5; m++){
                int course;
                cin >> course;
                suit.insert(course); //讀入選課組合
            }

            count[suit]++; //將該組合的次數 +1

            int h = count[suit]; //h = 該組合的次數

            //如果次數和 M 一樣，代表又有一組課程組合，所以 MC ++
            if(h==M) MC++; 

            //如果 M 比 h 小，代表這組合是唯一的領先者，所以 M 設為 h，MC 重設為 1
            if(h>M) M = h, MC = 1; 
        }
        cout << M * MC << endl;
    }
}