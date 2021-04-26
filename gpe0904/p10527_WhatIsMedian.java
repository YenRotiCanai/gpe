import java.util.*;
class p10527 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int arr[] = new int[10001]; // 題目說 N < 10000
        int count = 1;

        while(sc.hasNext()){
            //把每一個 N 都塞進去 arr 裡面
            arr[count] = sc.nextInt(); 

            //開始插值
            for(int i = 1; i < count; i++){

                //將arr裡面的一個個做比較,如果發現他比裡面其中一個小的話，就要換位子
                if(arr[count] <= arr[i]){       
                    //先把原本 arr 裡面的東西給 tmp
                    int tmp = arr[i];
                    //然後把他丟到他應該在的位置，這時候的i已經放新的值進去了
                    arr[i] = arr[count];        
                    System.out.println("arr:"+Arrays.toString(arr)+", tmp:"+tmp);

                    //這裡就是把 i 後面的往後挪一個
                    for(int j = i; j < count; j++){
                        int tmp2 = arr[j+1];    //先把後面原本的放到 tmp2
                        arr[j+1] = tmp;         //然後把剛剛被換掉的插進去
                        System.out.println("arr:"+Arrays.toString(arr)+", tmp:"+tmp+", tmp2:"+tmp2);
                        tmp = tmp2;             //接著再把 tmp2 丟回給 tmp,等下一次的插入就會插進去了
                        
                    }
                    break;
                }
            }

            //System.out.println("arr:"+Arrays.toString(arr));

            if(count % 2 == 1)
                System.out.println(arr[count/2 + 1]);
            else{
                long a = arr[count/2];
                long b = arr[count/2+1];

                System.out.println((a+b)/2);
            }
            count++;
        }
    }
}