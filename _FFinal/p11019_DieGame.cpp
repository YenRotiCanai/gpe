#include <iostream>

using namespace std;

int main(){
    
    int cases;

    while(cin >> cases && cases)
    {
        int top=1, n=2, w=3, e=4, s=5, down=6, tmp;
        string str;

        while(cases--){
            cin >> str;

            if(str=="north"){ tmp=top; top=s; s=down; down=n; n=tmp; }
            else if(str=="south"){ tmp=top; top=n; n=down; down=s; s=tmp; }
            else if(str=="west"){ tmp=top; top=e; e=down; down=w; w=tmp; }
            else if(str=="east"){ tmp=top; top=w; w=down; down=e; e=tmp; }
        }

        cout << top << endl;
    }
    

    return 0;
}