//  �A����(�Q���쵲��C)

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


public    class Rehash extends Object
{
final static int INDEXBOX=7;   //������̤j����
final static int MAXNUM=13;       //�̤j��ƭӼ�
static Node indextable[]=new Node[INDEXBOX]; //�ŧi�ʺA�}�C

   public static void main(String args[]) throws IOException
      {  
	int i;
	int index[]=new int[INDEXBOX];
	int data[]=new int[MAXNUM];
	Random rand=new Random();
	for(i=0;i<INDEXBOX;i++)         
 		indextable[i]=new Node(-1);	 //�M�������
	System.out.print("��l��ơG\n\t");
	for(i=0;i<MAXNUM;i++)       //�_�l��ƭ�
		{
			data[i]=(Math.abs(rand.nextInt(30)))+1;
			System.out.print("["+data[i]+"]");
			if(i%8==7)
				System.out.print("\n\t");
		}
	System.out.print("\n������G\n");
	for(i=0;i<MAXNUM;i++)
		Rehash.creat_table(data[i]);          //�إ������
	for(i=0;i<INDEXBOX;i++)
		Rehash.print_data(i);                 //�C�L�����
	System.out.print("\n");
      } 

   public static void creat_table(int val)              //�إ�������Ƶ{��
     {  
	Node newnode=new Node(val);
	int hash;
	hash=val%7;                       //�����ư��H7���l��
	Node current=indextable[hash];
	   if 
		(current.next==null)   indextable[hash].next=newnode;
	   else
		while(current.next!=null)  current=current.next;
	current.next=newnode;	//�N�`�I�[�b��C����
     }
   public static void print_data(int val)        //�C�L������Ƶ{��
     {  
	Node head;
	int i=0;
	head=indextable[val].next;  //�_�l����
	System.out.print("   "+val+"�G\t");   //���ަ�}
	while(head!=null)
	{  
		System.out.print("["+head.val+"]-");
		i++;
		if(i%8==7)              //�������
			System.out.print("\n\t");
		head=head.next;
	}
	System.out.print("\n");  //�M���̫�@��"-"�Ÿ�
    }
}