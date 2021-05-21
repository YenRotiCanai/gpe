#include <iostream>
#include <map>

using namespace std;

//宣告這個map的型態並命名為 colMap，下次要用這型態的話，只要用 colMap 就好
//不用打一長串的型態宣告
typedef map<int, int> colMap;

struct position{ 
    int x, y; 
};

int main(){
    int row, col, turNum, request;

    while(cin >> row >> col >> turNum >> request){
        map<int, struct position> findTur; //存烏龜的id和目前位置

        //水池的地圖（因為要放 x、y和id，所以開了一個巢狀map)
        map<int, colMap> pool; 

        map<int, int> rowMax;

        //開一個烏龜陣列叫做 pos，他是用來先放烏龜的位置，然後再把他放進map裡面
        struct position pos[turNum]; 

        for(int i=0; i<turNum; i++){
            int turId, x, y;

            //讀進烏龜id和初始位置
            cin >> turId >> x >> y;

            //先把烏龜的x，y位置放到 pos 裡
            pos[i].x = x;
            pos[i].y = y;

            //然後再把 pos 整層放進 map 裡
            findTur[turId] = pos[i];

            //記錄目前水池上，有哪隻烏龜
            pool[x][y] = turId;
        }

        for(int i=0; i<request; i++){
            int turId, x, y;
            string dir;

            //讀進烏龜的id 和 移動方向
            cin >> turId >> dir;

            //先根據 id 找出烏龜的目前位置
            x = findTur[turId].x;
            y = findTur[turId].y;

            //把他在水池上的位置變成 0，代表他離開了
            pool[x][y] = 0;

            //根據方向移動
            if(dir == "N") x--;
            else if(dir == "S") x++;
            else if(dir == "E") y++;
            else if(dir == "W") y--;
            else if(dir == "NE"){
                x--;
                y++;
            }else if(dir == "NW"){
                x--;
                y--;
            }else if(dir == "SE"){
                x++;
                y++;
            }else if(dir == "SW"){
                x++;
                y--;
            }

            //移動完後，檢查他是不是還在範圍內
            //而且抵達位置是不是沒有其他烏龜
            //如果沒問題，就把他最後的 x 和 y 記錄起來
            //也把他的位置對應到 pool 那邊，然後記錄他的 id
            
            //如果有問題，就用 id 重新找他的 x 和 y，將id 重新寫回水池
            if(x >= 0 && y >= 0 && x < row && y < col && pool[x][y] == 0){
                findTur[turId].x = x;
                findTur[turId].y = y;
                pool[x][y] = turId;
            }else pool[findTur[turId].x][findTur[turId].y] = turId;
        }

        //這一段什麼意思？看不懂
        //這是原版的，他用for loop 來寫
        // for(int i=0; i<row; i++){
        //     int j;
        //     for(j = col-1; j>=0 && pool[i][j]==0; j--);
        //     rowMax[i] = j;
        // }

        //這是想通了後，用 while 來寫，覺得比較容易懂
        //這是要找出最後烏龜位置，因為找到烏龜後，就不能用多餘的空格
        //也就是說，空格只能出現在烏龜的前面
        //譬如第一題的答案：
        //*
        //
        //-*
        //---*
        //* 代表烏龜，- 代表空格


        for(int i=0; i<row; i++){
            int j = col-1;
            
            //當他大於 0 且水池沒有人時，j--
            //如果整行都沒有人，j會一直減到 -1
            //所以那一整行就不會印空格
            while(j>=0 && pool[i][j]==0) j--;
            
            rowMax[i] = j;
        }

        for(int i=0; i<row; i++){

            //如果遇到該行完全沒有烏龜，上面的邏輯跑完會讓rowmax變成-1
            //因為 j 是從 0 開始，如果rowmax是-1的話，代表不符合條件，所以他不會進
            //就會直接跳出執行換行
            for(int j=0; j<=rowMax[i]; j++){
                if(pool[i][j]) cout << "*";
                else cout << ' ';
            }
            cout << endl;
        }
        cout << endl;
    }
    return 0;
}