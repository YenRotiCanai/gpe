// 使用雜湊法快速地建立及搜尋資料

import java.io.*;
import java.util.*;

class Node
{
	int val;
	Node next;
	public Node(int val)
	{
		this.val=val;
		this.next=null;
	}
}


public    class Search extends Object
{
final static int INDEXBOX=7;   //雜湊表最大元素
final static int MAXNUM=13;       //最大資料個數
static Node indextable[]=new Node[INDEXBOX]; //宣告動態陣列

   public static void main(String args[]) throws IOException
      {  
	int i,num;
	int index[]=new int[INDEXBOX];
	int data[]=new int[MAXNUM];
	Random rand=new Random();
	BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
	for(i=0;i<INDEXBOX;i++)         
		indextable[i]=new Node(-1);	 //清除雜湊表
	System.out.print("原始資料：\n\t");
	for(i=0;i<MAXNUM;i++)       //起始資料值
		{
			data[i]=(Math.abs(rand.nextInt(30)))+1;
			System.out.print("["+data[i]+"]");
			if(i%8==7)
				System.out.print("\n\t");
		}
	for(i=0;i<MAXNUM;i++)
		Search.creat_table(data[i]);          //建立雜湊表
	System.out.println();
	while(true)
	{  
		System.out.print("請輸入搜尋資料(1-30)，結束請輸入-1：");
		num=Integer.parseInt(keyin.readLine());
		if(num==-1)
			break;
		i=Search.findnum(num);
		if(i==0)
			System.out.print("#####沒有找到 "+num+" #####\n");
		else
			System.out.print("找到 "+num+"，共找了 "+i+" 次!\n");
	}
	System.out.print("\n雜湊表：\n");
	for(i=0;i<INDEXBOX;i++)
		Search.print_data(i);                 //列印雜湊表
	System.out.print("\n");
      } 

   public static void creat_table(int val)              //建立雜湊表副程式
     {  
	Node newnode=new Node(val);
	int hash;
	hash=val%7;                       //雜湊函數除以7取餘數
	Node current=indextable[hash];
	   if 
		(current.next==null)   indextable[hash].next=newnode;
	   else
		while(current.next!=null)  current=current.next;
	current.next=newnode;	//將節點加在串列
     }
   public static void print_data(int val)        //列印雜湊表副程式
     {  
	Node head;
	int i=0;
	head=indextable[val].next;  //起始指標
	System.out.print("   "+val+"：\t");   //索引位址
	while(head!=null)
	{  
		System.out.print("["+head.val+"]-");
		i++;
		if(i%8==7)              //控制長度
			System.out.print("\n\t");
		head=head.next;
	}
	System.out.print(" \n");            //清除最後一個"-"符號
      }

   public static int findnum(int num)     //雜湊搜尋副程式
     {  
	Node ptr;
	int i=0,hash;
	hash=num%7;
	ptr=indextable[hash].next;
	while(ptr!=null)
	{  
		i++;
		if(ptr.val==num)
			return i;
		else
			ptr=ptr.next;
	}
	return 0;
     }
}
