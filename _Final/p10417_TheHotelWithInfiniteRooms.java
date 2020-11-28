////https://a7069810.pixnet.net/blog/post/391270144-%5Buva10170%5D-the-hotel-with-infinite-rooms
import java.util.*;

class p10417 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
        	int s = sc.nextInt(); //初始人數和天數
        	long d = sc.nextLong(); //第 d 天

        	while(d>0){
        		d -= s;
        		s++;
        	}
        	System.out.println(--s);
        	//這裡不能分開，下面這樣會 TLE
        	/*
        	s--;
        	System.out.println(s);
        	*/
        }
    }
}