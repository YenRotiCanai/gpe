//https://stackoverflow.com/questions/12967896/converting-integers-to-roman-numerals-java

import java.util.*;

class Main{

	private final static TreeMap<Integer, String> romanMap = new TreeMap<Integer, String>();
	private final static TreeMap<Character, Integer> numberMap = new TreeMap<Character, Integer>();


	static{
		romanMap.put(1000, "M");
		romanMap.put(900, "CM");
		romanMap.put(500, "D");
		romanMap.put(400, "CD");
		romanMap.put(100, "C");
		romanMap.put(90, "XC");
		romanMap.put(50, "L");
		romanMap.put(40, "XL");
		romanMap.put(10, "X");
		romanMap.put(9, "IX");
		romanMap.put(5, "V");
		romanMap.put(4, "IV");
		romanMap.put(1, "I");

		numberMap.put('M', 1000);
		//numberMap.put("CM", 900);
		numberMap.put('D', 500);
		//numberMap.put("CD", 400);
		numberMap.put('C', 100);
		//numberMap.put("XC", 90);
		numberMap.put('L', 50);
		//numberMap.put("XL", 40);
		numberMap.put('X', 10);
		//numberMap.put("IX", 9);
		numberMap.put('V', 5);
		//numberMap.put("IV", 4);
		numberMap.put('I', 1);

	}

	public final static String toRoman(int n){
		/*
			m = map.floorKey(n) 取小於等於 n 的值
			如果 n 是 100，那 m 就是 m
			而如果 n 是 80， 那 m 就是 50
		*/
		int m = romanMap.floorKey(n);

		/*
			如果 n(原本的) 和 m( map 裡面的) 兩個一樣，就表示以及做到最後了
			直接回傳和 n 對應的字串
			可是，
			如果 n 和 m 不一樣，就表示還要繼續找出剩下的
			那就先把 m 的字串找出來，加上下一次迴圈的結果
			下一次帶入的值，是 n(原本的值) 減掉 m( map 裡面的值)後的結果
		*/
		if(n == m) return romanMap.get(n);
		else return romanMap.get(m) + toRoman(n - m);
	}

	public final static int toNumber(String s){
		int now = 0;
		int next = 0;
		int sum = 0;

		for(int i=0; i<s.length(); i++){
			if(i == s.length()-1){
				sum += numberMap.get(s.charAt(i));
				break;
			}

			now = numberMap.get(s.charAt(i));
			next = numberMap.get(s.charAt(i+1));

			if(now <= next){
				sum += now;
			}else{
				now -= next;
				sum += now;
				i++;
			}
		}

		return sum;
	}


	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
	
		while(sc.hasNext()){
			String str = sc.nextLine();
			
			int numAns = 0;
			String strAns = "";
			
			char numCheck = str.charAt(0);
			boolean isNum = false;

			if(numCheck >='0' && numCheck <='9') isNum = true;

			if(isNum){
				strAns = toRoman(Integer.parseInt(str));
				System.out.println(strAns);
			}
			else {
				StringBuilder sb = new StringBuilder(str);
				str = sb.reverse().toString();
				numAns = toNumber(str);
				System.out.println(numAns);
			}
		}
	}
}