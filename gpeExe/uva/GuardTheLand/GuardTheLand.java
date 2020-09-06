import java.util.Scanner;

class Guard{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for(int night=1; night<=cases; night++){
            int ax = sc.nextInt();
            int ay = sc.nextInt();
            int bx = sc.nextInt();
            int by = sc.nextInt();
            int cx = sc.nextInt();
            int cy = sc.nextInt();
            int dx = sc.nextInt();
            int dy = sc.nextInt();

            int i = Math.max(ax,cx);
            int j = Math.max(ay,cy);
            int k = Math.min(bx,dx);
            int l = Math.min(by,dy);

            int StrongArea = (k-i)*(l-j);
            if(i>k || j>l) StrongArea = 0;
            int WeakArea = ((bx-ax)*(by-ay)) + ((dx-cx)*(dy-cy)) - StrongArea*2; //這裡 SA 要乘 2 是因為他分別在兩個 WA 裡面，所以要減兩次
            int UnArea = 100*100 - WeakArea - StrongArea;

            System.out.println("Night "+night+": "+StrongArea+" "+WeakArea+" "+UnArea);
        }
    }
}