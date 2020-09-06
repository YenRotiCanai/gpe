https://onlinejudge.org/external/104/p10409.pdf
    
    Input:
    1st line(N): number of the following command lines (+ integer, N <= 1024)
    : north,east,south,west
    End of input: 0

    Output: number on the top when game finished.

### 解法
1. 對立面(上面和下面)的總合是 7(1+6, 3+4, 5+2)
2. 把每個方向的數字存起來

    Top = 1, North = 2, West = 3, East = 4, South = 5

3. 在轉的時候, 把 Top 丟給轉的那一面，讓他變成 Top
4. 然後把和他對立的另一邊用 7 減掉
5. 最後輸出 Top

### 範例
    1. north - 往前轉
    2. N -> 下面， Top -> N, S-> Top
    3. 所以
        N = Top; 因為往前轉，所以 Top 會跑去 N 的位置，舊的 N 則是會跑到底下去
        Top = S; 舊的 S 現在在上面，所以他變成 Top 了
        S = 7-N; 新的 S 要減掉 N 才知道他自己是多少
    4. 接下來就是一樣的步驟了
