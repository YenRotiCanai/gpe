//https://www.itread01.com/p/556165.html

import java.util.Scanner;

class test {

    static int f[] = new int[1000005];
    static void kmp_init(String p){
        int i, j;
        f[0] = f[1] = 0;
        i=1; j=0;
        while(i<p.length()){
            if(p.charAt(i) == p.charAt(j)){
                f[++i] = f[++j];
            }else if(j==0){
                f[++i] = 0;
            }else{
                j=f[j];
            }
        }
    }

    static int kmp(String p, String t){
        kmp_init(p);
        int i=0, j=0;
        int n = t.length(), m = p.length();
        while(i<n){
            while(j<m){
                if((i<n && j<m && t.charAt(i)==p.charAt(j)) || (i<n && j>=m && t.charAt(i)==0) || (j<m && i>=n && p.charAt(j)==0) || (j>=m && i>=n)){
                    i++;
                    j++;
                }else break;
            }
            if(j==0) i++;
            if(i==n) return j;
            j=f[j];
        }
        return 0;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String a = sc.next();
            String b = new StringBuffer(a).reverse().toString();
            String c = a.substring(0, a.length()-kmp(b,a));
            String d = new StringBuffer(c).reverse().toString();

            String ans = a+d;
            System.out.println(ans);
        }
    }    
}
