#include <iostream>
#include <string>
#include <map>
using namespace std;

int main(){
    int cases, first = 1;
    cin >> cases;

    while(cases--){
        int m, n;
        cin >> m >> n;

        map<char, char> parent;
        string city1, city2;

        //畫地圖（設定parent）
        //取城市名字的第一個字母，然後把第一個當成parent
        //eg：Rome Turin，那 parent[T] = R, T的parent是R
        for(int i=0; i<m; i++){
            cin >> city1 >> city2;
            parent[city2[0]] = city1[0];
        }

        //每過一個測資都要換行
        if(first==1) first=0;
        else cout << endl;

        //開始找路
        for(int q=0; q<n; q++){
            cin >> city1 >> city2;
            char route1[26], route2[26]; //第一條路和第二條路
            int p1=0, p2=0;

            //第一條路
            //一直測他是不是R，不是的話就把他下一位(p+1)設為目前的parent，然後p1++，再測多一次
            route1[0] = city1[0];
            while(route1[p1] != 'R'){
                route1[p1+1] = parent[route1[p1]];
                p1++;
            }

            //第二條路也一樣
            route2[0] = city2[0];
            while(route2[p2] != 'R'){
                route2[p2+1] = parent[route2[p2]];
                p2++;
            }

            //但他們兩個都到 'R'的時候，分別各退一格
            while(route1[p1] == route2[p2]){
                p1--;
                p2--;
            }

            //最後印出答案，分兩邊印
            //從前面印第一條路
            for(int i=0; i<=p1+1; i++){
                cout << route1[i];
            }

            //第二條路從後面印
            for(int i=p2; i>=0; i--){
                cout << route2[i];
            }
            cout << endl; //最後才換行
        }
    }
}