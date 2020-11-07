import java.util.Scanner;

class test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            int j = sc.nextInt();

            for(int k=j; ;k++){
                boolean isPrime = true;
                for(int l=2; l<k; l++){
                    if(k%l == 0){
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime) continue;
                else{
                    String str1 = Integer.toString(k), str2 = "";
                    int sum1 = 0, sum2 = 0;
                    for(int i = 0; i<str1.length(); i++){
                        sum1 += str1.charAt(i) - '0';
                    }
                    int tmp = k;
                    for(int i=2; i<=tmp;){
                        if(tmp % i == 0){
                            str2 += Integer.toString(i);
                            tmp /= i;
                        }else{
                            i++;
                        }
                    }
                    for(int i=0; i<str2.length(); i++){
                        sum2 += str2.charAt(i) - '0';
                    }
                    if(sum1==sum2){
                        System.out.println(k);
                        break;
                    }
                }
            }
        }
    }
}