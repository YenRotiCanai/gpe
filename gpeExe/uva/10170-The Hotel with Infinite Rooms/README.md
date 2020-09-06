https://onlinejudge.org/external/101/p10170.pdf

https://a7069810.pixnet.net/blog/post/391270144-%5Buva10170%5D-the-hotel-with-infinite-rooms

### 題目大意
房客人數和住宿的天數是一樣的，也就是說有多少房客就會住多少天，每換一批房客，人數和天數都+1
算出在 D 天時，有多少房客

### 輸入
1. 房客人數和天數
2. 第 D 天

### 解法
1. 用梯形來找（這還沒試過
2. 拿天數一直減一開始的人數，每減一次就要把人數+1，一直減到天數 < 0 (所以用while)，最後答案就是天數-1