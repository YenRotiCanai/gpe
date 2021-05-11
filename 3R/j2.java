import java.util.*;

class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			int n = sc.nextInt();
			int array[] = new int[n];

			for(int i=0; i<n; i++){
				array[i] = sc.nextInt();
			}

            // 開一個陣列來放序列的 index 位置
            // 先將他們都填滿 MIN VALUE
            int sequences[] = new int[array.length];
            Arrays.fill(sequences, Integer.MIN_VALUE);
            
            // 開一個陣列放至今為止的長度，然後全部預設都是 1
            int length[] = new int[array.length];
            Arrays.fill(length, 1);
            
            //最長 lis 的位置
            int maxLengthIdx = 0;
            
            for(int i=0; i<array.length; i++){
                
                int currNum = array[i]; //取現在的值
                
                for(int j=0; j < i; j++){ //從 0 一直 loop 到 i
                    
                    int otherNum = array[j]; //拿 i 之前的值
                    
                    //如果 i 之前的值(j)大於 i，而且的 j+1 後的長度比 i 的還要長的話
                    //就把 i 的長度改為 j+1 的長度
                    //再把 i 的 idx 設為 j，表示在這個 i 之前的 lis 是 j
                    if(otherNum < currNum && length[j]+1 >= length[i]){
                        length[i] = length[j] + 1;
                        sequences[i] = j;
                    }
                }
                
                //在 i 的迴圈最後，判斷目前位置的長度和最長的 lis 位置的長度，找出最長那一個的位置
                if(length[i] >= length[maxLengthIdx]) maxLengthIdx = i;
            }
            //最後開一個 function 來把 lis 序列裡的值全部拿出來
            System.out.println(buildSeq(array, sequences, maxLengthIdx));
        }
    }
	
	//用 ArrayList 來存 lis 全部的值
	public static List<Integer> buildSeq(int[] array, int[] sequences, int currentIdx){
		List<Integer> seq = new ArrayList<Integer>();
		
		//currentIdx 是剛才最長 lis 位置，所以用while來跑，一直跑到他變成預設值為止
		while(currentIdx != Integer.MIN_VALUE){
			
			//把他加進 arraylist 的時候，是把他插入在最前面，而不是一直往後
			seq.add(0, array[currentIdx]);
			
			//插入之後，要找下一個位置
			//從sequences那邊可以找到
			currentIdx = sequences[currentIdx];
		}
		return seq;
	}
}