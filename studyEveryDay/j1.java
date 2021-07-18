import java.util.*;

class Main{
	public static void main(String[] Args){
		// Scanner sc = new Scanner(System.in);

		// int n = sc.nextInt();
		// System.out.println(n+10);

		car c1[] = new car[4];
		c1[0].setData("honda", "silver", 300, 817);
		c1[1].setData("toyota", "black", 320, 907);
		c1[2].setData("hyundai", "white", 200, 107);
		c1[3].setData("proton", "blue", 180, 510);

		for(int i=0; i<4; i++){
			System.out.println(c1[i].brand + " " + c1[i].color);
		}
	}
}

public class car{
    String brand;
    String color;
    int price;
    int date;

    public setData(String s1, String s2, int a, int b){
        this.brand = s1;
        this.color = s2;
        this.price = a;
        this.date = b;
    }

    public String getBrand(){ return brand; }
    public String getColor(){ return color; }
    public int getPrice(){ return price; }
    public int getDate(){ return date; }
}

