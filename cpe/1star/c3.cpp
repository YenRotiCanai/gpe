//排序
//long string 裝換（sstream）
#include <iostream>
#include <sstream>
#include <algorithm>
#include <set>
using namespace std;

//用來反轉排序
bool cmp(char a, char b){
    return a>b;
}

int main(){
    int n;
    set<long long> same;
    long long prev = 0; //存上一筆資料
    string str, s1;

    while(getline(cin, str) && str!="0"){
        same.clear();
        int count = 0;
        long ori = 0, a1 = 0, b1 = 0;

        stringstream ss(str);
        ss >> ori;

        cout << "Original number was " << ori << endl;

        while(true){
            //逆序（大到小）
            sort(str.begin(), str.end(), cmp);
            stringstream ss1(str);
            ss1 >> a1;

            //順序（小到大）
            sort(str.begin(), str.end());
            stringstream ss2(str);
            ss2 >> b1;

            //結果
            long result = a1-b1;

            cout << a1 << " - " << b1 << " = " << result << endl;

            // cout << "same before insert:";
            // for(auto &x:same){
            //     cout << x << " ";
            // }
            // cout << endl;

            if(same.count(result)) break;

            same.insert(result);

            // cout << "same after insert:";
            // for(auto &x:same){
            //     cout << x << " ";
            // }
            // cout << endl << endl;

            // //如果結果和上一個一樣，就break
            // if(result == prev) break; 

            // //不然的話就把自己給 prev，然後 count ++
            // prev = result;
            // count ++;

            //最後把結果再變成 string 重跑一次迴圈
            stringstream ss3;
            ss3 << result;
            ss3 >> str;
        }

        //最後的 count 要加上最後一次
        cout << "Chain length " << same.size()+1 << endl << endl;
    }
}