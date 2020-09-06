import java.util.Scanner;

class p10050{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt(); // case 的數量
        while((--cases)>=0){
            int d = sc.nextInt(); // 天數
            int p = sc.nextInt(); // 黨派的數量

            int days[] = new int[d+1]; // 因為array第一個是0，所以要+1
            int party[] = new int[p];

            for(int i=0; i<p; i++){ // 存每個黨派的罷工天數
                party[i] = sc.nextInt();
            }

            for(int i=0; i<p; i++){ // 算每個黨派的罷工倍數
                int multRec = 0; // 記錄罷工天的倍數
                for(int j=1; j<d+1; j++){
                    multRec = party[i] * j; //罷工天的倍數

                    if(multRec < d+1){ // 防止大於限定天數
                        days[multRec] = 1; // 如果在限定天數內，就在陣列 +1
                    }else{
                        break;
                    }

                }
            }

            int count = 0; // 存罷工天數
            for(int i=0; i<d+1; i++){ // 判斷是否是週日(五/六)
                if( i%7!=6 && i%7!=0 && days[i]==1){ // 如果是6或者0，就代表是週日，就不行，還要檢查那天有沒有罷工記錄，有的話count才可以++
                    count ++;
                }
            }
            System.out.println(count);
        }
    }
}