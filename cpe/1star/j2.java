import java.util.Scanner;

class uva10281{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		double km=0,v=0,v1=0,time=0,time2=0;
		int startTime=0;
		while(sc.hasNextLine()){
			int i=0;
			String st[]=sc.nextLine().split(" "); //時間、速度分開。
			while(st[i].equals(""))i++;
			//時間換算成秒。
			String stString[]=st[i].split(":");
			time=Double.parseDouble(stString[0])*3600+Double.parseDouble(stString[1])*60+Double.parseDouble(stString[2])*1; 
			km+=(time-time2)*v/3600; //距離計算。
			time2=time;
			
			//Output
			if(st.length==1){
				System.out.printf("%s %.2f km",st[0],km);
				System.out.println("");
			}else{
				v=Double.parseDouble(st[i+1]);
			}
		}
	}
}