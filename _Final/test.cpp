#include <iostream>
#include <algorithm>
using namespace std;
int main(void)
{
    unsigned int i = 0, j = 0, cas = 0, max_num = 0, b = 0;

    while (cin >> i >> j)
    {
        max_num = -1;
        for (int a = min(i, j); a <= max(i, j); a++)
        {
            b = a;
            cas = 1;
            while (b > 1)
            {
                if (b % 2 == 1)
                    b = 3 * b + 1;
                else
                    b /= 2;
                cas++;
            }
            max_num = max(max_num, cas);
        }
        cout << i << " " << j << " " << max_num << endl;
    }
    return 0;
}