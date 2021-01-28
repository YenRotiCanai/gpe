//https://a7069810.pixnet.net/blog/post/394871641-%5Buva10019%5D-funny-encryption-method

package _Final;
import java.util.Scanner;
class p10403_FunnyEncryptionMethod {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();
        while(cases-->0){
            int n = sc.nextInt();
            System.out.println(base10(n) + " " + base16(n));
        }

    }

    //10 進位轉 2 進位，並回傳有多少個1。
	//10 進位轉 2 進位就是一直 mod 2，每次 mod 都會得到 0 或 1
	//最後把得到的 0 或 1 串起來再反過來，就是 2 進位了
	//這裏只要算有多少個 1，所以每找到一個就 ++
	//然後讓他自己除自己
    public static int base10(int n){
        int count = 0;
        while(n>0){
            if(n%2==1) count++;
            n/=2;
        }
        return count;
    }

    //先 mod 10，拿到個位數後（temp）拿去轉成 2 進制
    public static int base16(int n){
        int count = 0;
        while(n>0){
            int tmp = n%10; //拿到個位數
            n/=10;

            //轉換成 2 進制
            while(tmp>0){
                if(tmp%2==1) count++;
                tmp/=2;
            }
        }
        return count;
    }
}
