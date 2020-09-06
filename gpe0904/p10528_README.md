java : https://github.com/Ahmed-ShawkyEgy/UVA/blob/master/10110%20-%20Light%2C%20more%20light.java
解法 : http://programming-study-notes.blogspot.com/2014/02/uva-10110-light-more-light.html

1. n 只有在是他的 divisor 的時候才會被切
2. 如果他的 divisor 是 odd(1,3,5,7,9...)，那最後會是亮的
3. 反之如果 divisor 是 even(2,4,6,8,10)，那最後會是暗的
4. 而只有在被 square root 的時候，他的 divisor 才會是 odd
5. 講到底我還是不太懂這東西 /.\

### 做法
1. 用 long 來收測資
2. 用 Math.sqrt 來算 square root，記得要在前面加上 (long)把他轉成 long 的
3. 最後自己*自己，看是不是和原本的測資一樣
4. 一樣就代表燈是亮的，輸出 yes，反之輸出 no