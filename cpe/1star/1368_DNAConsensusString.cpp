#include <bits/stdc++.h>

using namespace std;

int main(){
    int cases, m, n, count;
    int dict[4][1001], tmp;
    string str, s1 = {'A','C','G','T'}; //照 abc 順序排

    scanf("%d", &cases);
    while(cases--){
        scanf("%d %d", &m, &n);
        getchar(); //清除緩衝區
        memset(dict, 0, sizeof(dict)); //先填滿 0

        for(int i=0; i<m; i++){
            cin >> str;
            for(int j=0; j<n; j++){
                for(int k=0; k<4; k++){
                    //如果字串裡面的字有對到，就在dict裡面++
                    if(str[j] == s1[k]){
                        dict[k][j]++;
                        break; //會跳回 j 的迴圈
                    }
                }
            }
        }
        count = 0;

        //每一列跑一次，找出最多的字元和統計有多少不一樣的字元
        for(int i=0; i<n; i++){

            //題目要求找出有多少個不一樣的
            //所以要先找出每一列裡面最多的
            //再用題目給的總列數去減掉
            //這樣就找到最大宗的了
            tmp = max(max(max(dict[0][i], dict[1][i]), dict[2][i]),dict[3][i]);
            //把不一樣的數量都加總起來
            count += m-tmp;

            //印出每一列裡面最大宗的那一個字元
            //這裡 tmp 是最多的哪一個，所以只要找到和他一樣數量的就是了
            for(int j=0; j<4; j++){
                if(tmp == dict[j][i]){
                    cout << s1[j];
                    break;
                }
            }
        }
        //最後印出有多少不一樣
        printf("\n%d\n",count);
    }
    return 0;
}