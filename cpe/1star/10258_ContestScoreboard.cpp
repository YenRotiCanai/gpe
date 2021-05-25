//https://knightzone.studio/2012/03/16/1483/uva%EF%BC%9A10258%EF%BC%8Dcontest-scoreboard/
#include <iostream>
#include <cstdio>
#include <cstring>
#include <sstream>
#include <algorithm>

using namespace std;

//用 struct 來登錄每個隊伍的詳細資訊
struct Team{
    bool join; //有沒有參加比賽
    int num; //隊伍編號
    int score; //總分數（懲罰時間）
    int problem; //提交問題數量
    int error[10]; //提交錯誤的次數
};


/* 排序最後輸出的順序
1. 答對最多題的
2. 懲罰時間（分數）最少
3. 如果以上兩個都一樣的話，就按照隊伍編號從小到大
*/

//不知道為什麼要加以下兩個 if
//可是沒加的話，他的答案又不一樣
bool cmp(Team a, Team b){
    if(a.problem > b.problem) return true;
    if(a.problem < b.problem) return false; //這個
    if(a.score < b.score) return true;
    if(a.score > b.score) return false; //還有這個
    if(a.num < b.num) return true;
    return false;
}

int main(){
    int cases;
    string entry;
    stringstream ss;
    Team teams[105]; //題目說最多有 100 隊
    int contestant, problem, time;
    char L;

    while(scanf("%d", &cases) != EOF){
        //之後的兩個 getchar 吃換行
        getchar();
        getchar();

        for(int i=0; i<cases; i++){
            if(i) printf("\n");

            //先預設 teams 每隊的資料都是 0，除了隊伍編號
            for(int j=0; j<105; j++){
                teams[j].join = 0;
                teams[j].num = j;
                teams[j].score = 0;
                teams[j].problem = 0;
                memset( teams[j].error, 0, sizeof(teams[j].error));
            }

            //用吃不到字元的條件來結束迴圈
            while(getline(cin, entry) && entry!=""){
                ss.clear(); //首先一定要先清掉緩衝
                ss.str(entry); //然後把字串變成 stringstream
                ss >> contestant >> problem >> time >> L; //才分出去

                teams[contestant].join = true; //先說他有參加

                //如果他已經答對這題了，之後再提交錯誤的也不會影響到成績，所以一旦他答對了，就把他的 error 次數變成 -1
                //而如果是打錯的話，就把 error 次數 +1
                if(teams[contestant].error[problem] == -1) continue;
                if( L == 'C' ){
                    teams[contestant].score += time + teams[contestant].error[problem]*20;
                    teams[contestant].problem ++;
                    teams[contestant].error[problem] = -1;
                }else if( L == 'I' ) teams[contestant].error[problem]++;
            }

            //全部做完後，排序
            sort(teams, teams+105, cmp);

            //輸出答案
            for(int j=0; j<105; j++){
                if(teams[j].join) printf("%d %d %d\n", teams[j].num, teams[j].problem, teams[j].score);
            }
        }
    }
    return 0;
}