import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n-->0){
            int len = sc.nextInt();
            int arr[] = new int[len];

            for(int i=0; i<len; i++){
                arr[i] = sc.nextInt();
            }

            int count = 0;
            boolean changed = true;

            while(changed){
                //先預設他沒換過，真的有換了就改成 true，這樣下一次會再進來一次
                //而當他真的沒必要換的時候，就會一直保持 false，或是這也代表他已經換完了，這也下次就不會再進來
                changed = false;
                for(int i=0; i<len-1; i++){
                    //如果有大過，就交換，然後count++
                    if(arr[i]>arr[i+1]){
                        int tmp = arr[i];
                        arr[i] = arr[i+1];
                        arr[i+1] = tmp;
                        changed = true;
                        count ++;
                    }
                }
            }
            System.out.printf("Optimal train swapping takes %d swaps.%n",count);
        }
	}
}