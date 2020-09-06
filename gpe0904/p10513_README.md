數字反轉參考：https://ithelp.ithome.com.tw/articles/10158935
答案：http://hellowalk.blogspot.com/2018/03/java-uva-10018-reverse-and-add.html

### 數字反轉
1. 用 mod 10 來取最後一個數字
2. 用 *10 + 前一個數字來和上一個字結合
3. 最後把 input /10 來取除了最後一個字的數值
4. eg:
 - input = 123
 - result = 0 // 先給一個 0
 - input mod 10 = 3 // 現在拿到最後一個號碼了
 - result = (0*10) + 3, result = 3
 - 最後把 input / 10 = 12
 - 下一輪
 - input 變成 12 了
 - input mod 10 = 2 // 最後一個號碼
 - result = 3*10 + 2, result = 32
 - input / 10 = 1
 - 最後一輪
 - input 變成 1
 - input mod 10 = 1
 - result = 32*10 + 1, result = 321
 - 最後結果就是 321 啦~~

 ### 整體解法
 1. 把 case 數吃進來，用 for 跑 case 次數的迴圈
 2. 用 long 來收測資
 3. 宣告一個計數用的 count
 4. 把測資丟進去 reverse 的 function 裡面跑
 5. 把原本的自己加起來，成為一個新的測資
 6. 用 while 判斷現在的自己和丟進去的測資是否一樣，如果不一樣就再丟一次，可是這次就要 count++
 7. 印出答案