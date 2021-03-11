#include <iostream>

using namespace std;

int main(){
    //宣告一週的英文名字
    char week[7][10]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
    
    //宣告每個月有多少天,因為閏年（leap years）所以2月是28天
    int month_days[]={31,28,31,30,31,30,31,31,30,31,30,31};

    int n;
    cin >> n; //case數量
    while(n--){
        int month, day;
        cin >> month >> day;

        //根據測資推算，去年最後一天是禮拜五，而禮拜五在week裡面排第五個，所以就給他 5
        int w=5; 

        //這邊 i 給 1，這樣如果是 1 月的話，它就會因為限制條件而進不去，所以不會加到1月的全部天數
        //會直接跳過迴圈做下一步
        for(int i=1; i<month; i++){
            w += month_days[i-1];
        }

        //把加總好的月份天數加上測資的天數，然後 mod 7 找出禮拜幾
        w = (w+day)%7;

        cout << week[w] << endl;
    }
}