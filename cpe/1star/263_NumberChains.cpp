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
    string str, s1;

    while(getline(cin, str) && str!="0"){
        same.clear();
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

            if(same.count(result)) break; //如果他找裡面有result，會回傳 1，就會break

            same.insert(result);

            //最後把結果再變成 string 重跑一次迴圈
            stringstream ss3;
            ss3 << result;
            ss3 >> str;
        }

        //最後的 count 要加上最後一次
        cout << "Chain length " << same.size()+1 << endl << endl;
    }
}