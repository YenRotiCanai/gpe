// ��@��C��ƪ��s�J�M���X

import java.io.*;
public class Queue01
{
	public static int front=-1,rear=-1,max=20;
	public static int val;
	public static char ch;
	public static int queue[]=new int[max];
	public static void main(String args[]) throws IOException
   {
	String strM;
	int M=0;
	BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
	while(rear<max-1&& M!=3)
	{  
		System.out.print("[1]�s�J�@�Ӽƭ�[2]���X�@�Ӽƭ�[3]����: ");
		strM=keyin.readLine();
		M=Integer.parseInt(strM);
		switch(M)
		  {
			case 1:
				System.out.print("\n[�п�J�ƭ�]: ");
				strM=keyin.readLine();
				val=Integer.parseInt(strM);
				rear++;
				queue[rear]=val;
				break;
			case 2:
				if(rear>front)
				{  
					front++;
					System.out.print("\n[���X�ƭȬ�]: ["+queue[front]+"]"+"\n");
					queue[front]=0;
				}
				else
				{  
					System.out.print("\n[��C�w�g�ŤF]\n");
					break;
				}
				break;
			default:
				System.out.print("\n");
				break;
		  }
	}
	if(rear==max-1) System.out.print("[��C�w�g���F]\n");
	System.out.print("\n[�ثe��C�������]:");
	if (front>=rear)
	{
		System.out.print("�S��\n");
		System.out.print("[��C�w�g�ŤF]\n");
	}
	else
	{
		while (rear>front)
		{  
			front++;
			System.out.print("["+queue[front]+"]");
		}
		System.out.print("\n");
		}
   }

}