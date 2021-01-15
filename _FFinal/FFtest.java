import java.util.*;

class FFtest{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Vector<String> vector = new Vector<String>();

		int cases = 0;
		int maxLength = 0;

		while(sc.hasNextLine()){
			String str = sc.nextLine();

			if(str.length() > maxLength) maxLength = str.length();

			vector.add(str);
			cases++;
		}

		int spaceCount = 0;

		//從每行開頭的第一個字開始
		for(int i=0; i<maxLength; i++){
			spaceCount = 0;

			//從最後一筆開始抓
			for(int j=cases-1; j>=0; j--){
				if(!(i > vector.get(j).length())){ //如果已經抓到超出這一行的長度了，也就是說這一行已經結束，就跳出if
					//印出空白
					while(spaceCount > 0){
						System.out.print(" ");
						spaceCount--;
					}
					System.out.print(vector.get(j).charAt(i));
					spaceCount = 0;
				}else{
					spaceCount++;
				}
			}
			System.out.println();
		}

	}
}