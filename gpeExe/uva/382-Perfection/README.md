https://onlinejudge.org/external/3/p382.pdf

### 題目大意
給 N，找出他是 Perfect, Deficient 還是 Abundant.

Perfect (sum of divisor == N)
Deficient (sum of divisor < N)
Abundant (sum of divisor > N)

### 解法
1. 先弄一個 sum 來儲存他的 factor
2. 跑一個 for loop 來判斷是不是 factor
3. 是的話，就存進 sum
4. 最後比較 sum 和 n，判斷他是 per，def，還是 abu
5. 然後就可以輸出了
6. 輸出的話，因為他有限制格式，所以用 printf 和 %5d(讓他的長度變成5)