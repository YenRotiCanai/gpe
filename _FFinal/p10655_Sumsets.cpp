#include<iostream>
#include<vector>
#include<algorithm>
#include<climits>
using namespace std;

int find(vector<int>& vs)
{
    for (int d = vs.size() - 1; d >= 0; d--) // find the largest d
        for (int a = 0; a < vs.size(); a++)
            for (int b = a + 1; b < vs.size(); b++)
                for (int c = b + 1; c < vs.size(); c++)
                    if ( (vs[d] == vs[a] + vs[b] + vs[c]) &&
                            a != d && b != d && c != d )

                        return vs[d];
    return INT_MAX;
}

int main()
{
    int numElement;
    while (cin >> numElement)
    {
        if (numElement == 0)
            break;

        /* input */
        vector<int> vs(numElement);

        for (int i = 0; i < numElement; ++i)
            cin >> vs[i];

        sort(vs.begin(), vs.end());

        /* find d = a + b + c */
        int d = find(vs);
        if ( d == INT_MAX )
            cout << "no solution\n";
        else
            cout << d << "\n";
    }
    return 0;
}