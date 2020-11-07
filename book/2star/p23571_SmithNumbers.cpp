#include <iostream>
using namespace std;

//把一整串數字拆分，然後再加起來
int DigitSum(int n){
    int sum = 0;
    while(n>0){
        sum+=(n%10); //mod 10可以拿個位數
        n/=10;
    }
    return sum;
}

int FactorDigitSum(int n){
    int sum = 0;
    int tmp = n;
    for(int i=2; i*i<=tmp; i++){
        //當他可以被 i 整除的時候，把 i 加到sum裡面
        while(tmp%i==0){
            tmp/=i;
            sum+=DigitSum(i);
        }
    }
    //如果tmp是質數（他還是和原本的 n 一樣），不能被上面整除，根據題目要求不要質數，所以return 0
    //反之，如果tmp有被整除，再看他是不是 =1，如果等於 1，代表他是質數，返回原本的 sum，不做任何處理
    //如果他不是 1，那就把他放進 DigitSum 裡面，把剩下的數字拆分後加到sum 裡面
    if(tmp!=n){
        if(tmp!=1) sum+=DigitSum(tmp);
        return sum;
    }else return 0;
}

int main(){
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;
        int ans = n+1; //從 n+1 開始測質數
        while(1){ //和while true的意思一樣，無限迴圈直到break跳出
            //如果兩邊算起來的答案一樣，就跳出迴圈，不然會一直執行，一直到他找到兩邊都一樣的才會跳出來
            if(DigitSum(ans)==FactorDigitSum(ans)) break;
            else ans++;
        }
        cout << ans << endl;
    }
    return 0;
}