// �쵲��C�s�@���|

import java.io.*;

class Node //�쵲�`�I���ŧi
{
	int data;
	Node next;
	public Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}

class StackByLink 
{
	public Node front; //���V���|���ݪ�����
	public Node rear;  //���V���|���ݪ�����
   //���O��k�GisEmpty()
   //�P�_���|�p�G���Ű��|,�hfront==null;
	public boolean isEmpty()
	{
		return front==null;
	}
   //���O��k�Goutput_of_Stack()
   //�C�L���|���e
	public void output_of_Stack()
	{
		Node current=front;
		while(current!=null)
		{
		System.out.print("["+current.data+"]");
		current=current.next;
		}
		System.out.println();
	}
   //���O��k�Ginsert()
   //�b���|���ݥ[�J���
	public void insert(int data)
	{
		Node newNode=new Node(data);
		if(this.isEmpty())
		{
			front=newNode;
			rear=newNode;
		}
		else
		{
			rear.next=newNode;
			rear=newNode;
		}
	}
   //���O��k�Gpop()
   //�b���|���ݧR�����
	public void pop()
	{
		Node newNode;
		if(this.isEmpty())
		{
			System.out.print("===�ثe���Ű��|===\n");
			return;
		}
		newNode=front;
		if(newNode==rear) 
			{
			front=null;
			rear=null;
			System.out.print("===�ثe���Ű��|===\n");
			}
		else
		{
			while(newNode.next!=rear) 
				newNode=newNode.next;
			newNode.next=rear.next;
			rear=newNode;
		}

	}
}

class Stack03
{
   public static void main(String args[]) throws IOException
   {
		BufferedReader buf;
		buf=new BufferedReader(new InputStreamReader(System.in));
		StackByLink stack_by_linkedlist =new StackByLink();
		int choice=0;
                while(true)
		{
			System.out.print("(0)����(1)�b���|�[�J���(2)�u�X���|���:");
			choice=Integer.parseInt(buf.readLine());		
			if(choice==2)
			{
				stack_by_linkedlist.pop();
				System.out.println("��Ƽu�X����|���e:");
				stack_by_linkedlist.output_of_Stack();
			}
			else if(choice==1)
			{
				System.out.print("�п�J�n�[�J���|�����:");
				choice=Integer.parseInt(buf.readLine());
				stack_by_linkedlist.insert(choice);
				System.out.println("��ƥ[�J����|���e:");
				stack_by_linkedlist.output_of_Stack();
			}
			else if(choice==0)
				break;
			else
			{
				System.out.println("��J���~!!");
			}
		}
	}
}