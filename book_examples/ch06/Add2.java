// �h�����ۥ[

import java.io.*;

class Node 
{
	int coef;
	int exp;
	Node next;
	public Node(int coef,int exp)
	{
		this.coef=coef;
		this.exp=exp;
		this.next=null;
	}
}

class PolyLinkedList 
{
	public Node first;
	public Node last;
		
	public boolean isEmpty()
	{
		return first==null;
	}	

	public void create_link(int coef,int exp)
	{
		Node newNode=new Node(coef,exp);
		if(this.isEmpty())
		{
			first=newNode;
			last=newNode;
		}
		else
		{
			last.next=newNode;
			last=newNode;
		}
	}

	public void print_link()
	{
		Node current=first;
		while(current!=null)
		{
			if(current.exp==1 && current.coef!=0) // X^1�ɤ���ܫ���
				System.out.print(current.coef+"X + ");
			else if(current.exp!=0 && current.coef!=0)
				System.out.print(current.coef+"X^"+current.exp+" + ");
			else if(current.coef!=0)             // X^0�ɤ�����ܼ�
				System.out.print(current.coef);
		current=current.next;
		}
		System.out.println();
	}
	
	public PolyLinkedList sum_link(PolyLinkedList b)
	{
	int sum[]=new int[10];
	int i=0,maxnumber;
	PolyLinkedList tempLinkedList=new PolyLinkedList();
	PolyLinkedList a=new PolyLinkedList();
	int tempexp[]=new int[10];
	Node ptr;
	a=this;
	ptr=b.first;
	while(a.first!=null)                      //�P�_�h����1
	   {  
		b.first=ptr;                         // ���Ƥ��A��B������
		while(b.first!=null)
		{  
			if(a.first.exp==b.first.exp)          //���Ƭ۵��A�Y�Ƭۥ[
			{  
				sum[i]=a.first.coef+b.first.coef;
				tempexp[i]=a.first.exp;
				a.first=a.first.next;
				b.first=b.first.next;
				i++;
			}
			else if(b.first.exp > a.first.exp)     //B���Ƹ��j�A���w�Y�Ƶ�C
			{  
				sum[i]=b.first.coef;
				tempexp[i]=b.first.exp;
				b.first=b.first.next;
				i++;
				
			}
			else if(a.first.exp > b.first.exp)      //A���Ƹ��j�A���w�Y�Ƶ�C
			{  
			        sum[i]=a.first.coef;
				tempexp[i]=a.first.exp; 
				a.first=a.first.next;
				i++;
			}
			} // end of inner while loop
		}	// end of outer while loop
		maxnumber=i-1;
		for (int j=0;j<maxnumber+1;j++) tempLinkedList.create_link(sum[j],maxnumber-j);
		return tempLinkedList;
	} // end of sum_link
} // end of class PolyLinkedList 


public class Add2
{
   public static void main(String args[]) throws IOException
   {
	PolyLinkedList a=new PolyLinkedList();
	PolyLinkedList b=new PolyLinkedList();
	PolyLinkedList c=new PolyLinkedList();
	
	int data1[]={8,54,7,0,1,3,0,4,2};         //�h����A���Y��
	int data2[]={-2,6,0,0,0,5,6,8,6,9};         //�h����B���Y��
	System.out.print("��l�h�����G\nA=");

	for(int i=0;i<data1.length;i++)
		a.create_link(data1[i],data1.length-i-1); //�إߦh����A�A�Y�ƥ�3����

	for(int i=0;i<data2.length;i++)
		b.create_link(data2[i],data2.length-i-1); //�إߦh����B�A�Y�ƥ�3����

	a.print_link();                  //�C�L�h����A
	System.out.print("B=");
	b.print_link();                  //�C�L�h����B
	System.out.print("�h�����ۥ[���G�G\nC=");
	c=a.sum_link(b);                //C��A�BB�h�����ۥ[���G
	c.print_link();                  //�C�L�h����C
	
   }
}