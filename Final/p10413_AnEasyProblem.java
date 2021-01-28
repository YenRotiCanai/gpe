//https://a7069810.pixnet.net/blog/post/391053376-uva10093-an-easy-problem


import java.util.Scanner;

class p10413 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()){
        	String st = sc.nextLine();

        	char cTemp[] = st.toCharArray();
        	int sum=0, max=1;

        	for(char temp:cTemp){
        		int r=0;

        		if('0'<=temp && temp<='9') r = temp-'0';
        		else if('A'<=temp && temp<='Z') r = temp-'A'+10;
        		else if('a'<=temp && temp<='z') r = temp-'a'+36;

        		sum+=r;
        		if(r>max) max = r;
        	}

        	for(int i=max; i<=62; i++){
        		if(i==62){
        			System.out.println("such number is impossible!");
        			break;
        		}

        		if(sum%i==0){
        			System.out.println(i+1);
        			break;
        		}
        	}
        }
    }
}