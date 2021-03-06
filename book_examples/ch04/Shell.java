// 謝耳排序法

import java.io.*;

public class Shell extends Object
{
	int data[]=new int[8];
	int size=8;	
	
	public static void main(String args[])
	{ 		
		Shell test =  new Shell();
		test.inputarr();		
		System.out.print("您輸入的原始陣列是：");
		test.showdata();
		test.shell();
	}

	void inputarr()
	{
		int i=0;
		for (i=0;i<size;i++)
		{ 
			System.out.print("請輸入第"+(i+1)+"個元素：");
			try{				
				InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(isr);
				data[i]=Integer.parseInt(br.readLine());
			}catch(Exception e){}
		}
	}

	void showdata()
	{
		int i=0;		
		for (i=0;i<size;i++)
		{
			System.out.print(data[i]+" ");
		}
		System.out.print("\n");
	}
	
	void shell()
	{  
		int i;        //i為掃描次數
		int j;        //以j來定位比較的元素
		int k=1;      //k列印計數
		int tmp;      //tmp用來暫存資料
		int jmp;      //設定間距位移量
		jmp=size/2;
		while (jmp != 0)
		{  
			for (i=jmp ;i<size ;i++)
			{  
				tmp=data[i];
				j=i-jmp;
				while(j>=0 && tmp<data[j])  //插入排序法
				{  
					data[j+jmp] = data[j];
					j=j-jmp;
				}	
				data[jmp+j]=tmp;				
			}
			
			System.out.print("第"+ (k++) +"次排序：");			
			showdata();
			jmp=jmp/2;    //控制迴圈數
		}
        }
}
