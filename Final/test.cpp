#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main(){
    vector<int> obj;

    vector<int>::iterator it1;
    vector<int>::iterator it2;

    obj.push_back(1);
    obj.push_back(90);
    obj.push_back(3);
    obj.push_back(67);

    sort(obj.begin(), obj.end());

    for(int i=0; i<obj.size(); i++){
        cout << obj[i] << ", ";
    }
    cout << endl;

    reverse(obj.begin(), obj.end());
    for(int i=0; i<obj.size(); i++){
        cout << obj[i] << ", ";
    }
    cout << endl;
    it1 = obj.end();
    it2 = obj.rbegin();

    cout << *it1 << " " << *it2 << endl;

    return 0;
}