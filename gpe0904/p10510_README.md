http://hellowalk.blogspot.com/2018/05/java-uva-10013-super-long-sums.html

1. 要用 ```Integer.parseInt(sc.nextLine())``` 來收測資
2. 記得用一個 boolean 來判斷是不是第一次輸出
3. 進cases的一開始先看他是不是第一次，如果不是的話，就要output一個空行
4. 然後繼讀入 cases 後，要先讀入一行空白，所以先 ```sc.nextLine()```
5. 宣告一個陣列來存放接下來的測資，陣列長度要+1，因為我們從1開始寫入，0是留給進位用的
6. 宣告 StringTokenizer，把讀進來的測資用 ```Integer.parseInt(st.nextToken())``` 分開
7. 把分開來的 a 和 b 加起來寫回去陣列裡面
8. 從陣列的後面開始算，所以for的條件要用```i=M; i>=1; i--```
9. 把現在的 i 除10後，答案加到前一個 i，也就是 i-1 的地方
10. 然後用現在的 i mod 10 來算現在 i 的值
11. 先判斷一下陣列的第一個是不是 0，如果不是 0 的話，才 append 進stringbuilder 裡面，因為輸出裡面第一個不能是0
12. 然後就單純的把陣列裡面的東西都 sb.append 起來，用 sb.toString() 輸出
13. 最後要把一開始判斷是否第一個 cases 的 boolean 設為 false