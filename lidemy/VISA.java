import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		if(s.contains("-")){
			s = s.replaceAll("-","");
		}

		char arr[] = s.toCharArray();

		boolean isValid = false;
		int card_Comp = 0;
		
		if(s.length()==16){
			card_Comp = arr[0]-'0';
			if(card_Comp>=3 && card_Comp <=5) isValid=true;

			int odd=0, even=0, tmp=0, check=0;

			for(int i=0; i<arr.length-1; i++){
				if(i%2==0){
					tmp = 2 * (arr[i]-'0');
					if(tmp>=10) tmp -= 9;
					odd += tmp;
				}else {
					even += (arr[i]-'0');
				}
			}


			check = (odd+even)%10;

			if(check>0) check = 10-check;

			if(check != (arr[15]-'0')) isValid = false;
		}


		if(isValid){
			if(card_Comp == 5) System.out.println("MASTER_CARD");
			else System.out.println("VISA");
		}else System.out.println("INVALID");

	}
}