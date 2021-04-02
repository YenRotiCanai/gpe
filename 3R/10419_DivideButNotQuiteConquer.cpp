#include <iostream>
using namespace std;

int main(){
    int n, m;
    while(cin >> n >> m){
        //先處理特殊情況
        if((n<2) || (m<2)){
            cout << "Boring!" << endl;
            continue;
        }

        int backup = n; //把 n 備份起來

        //開始除
        while(n%m == 0 && n>1){
            n /= m;
        }

        //如果最後 n 不等於 1，就輸出 boring
        //反之，如果是 1，就把 n 復原，然後再做一次除法
        //在除之前要先印出，全部除完後，要記得印出 1
        if(n!=1){
            cout << "Boring!" << endl;
        }else{
            n = backup;
            while(n%m==0 && n>1){
                cout << n << " ";
                n /= m;
            }
            cout << "1" << endl;
        }
    }
    return 0;
}