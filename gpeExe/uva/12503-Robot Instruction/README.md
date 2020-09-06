https://onlinejudge.org/external/125/p12503.pdf  

https://blog.xuite.net/b81621java/blog/74235739-24911%3ARobot+Instructions
---
### 題目大意
算出機器人走了幾步

### 輸入
1. no. of test cases
2. no. of instruction
3. n line instruction
4. ORIGIN = 0, LEFT = -1, RIGHT = 1

### 解法
1. 宣告個陣列，把對應的 instr 指示（-1/1）存進去
2. 若是遇到 SAME AS，就用 substring 先抓那個位置的 string
3. 然後用 Integer.parseInt 轉換成 int
4. 接著再丟進 arr 裡面
5. 最後用個 for 迴圈，讓他 arr 裡面的值全部加起來。

### 注意
在判斷 instruction 前，要先 nextLine
不然後面會說 index out of range