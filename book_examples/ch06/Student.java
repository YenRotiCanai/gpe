// 利用鏈結串列來建立、刪除及列印學生成績

import java.util.*;
import java.io.*;
public class Student
{
   public static void main(String args[]) throws IOException
   {
	   BufferedReader buf;
	   Random rand=new Random();
	   buf=new BufferedReader(new InputStreamReader(System.in));
	   StuLinkedList list =new StuLinkedList();
	   int i,j,findword=0,data[][]=new int[12][10];
	   String name[]=new String[] {"Allen","Scott","Marry","Jon","Mark","Ricky","Lisa","Jasica","Hanson","Amy","Bob","Jack"};
	   System.out.println("座號成績座號成績座號成績座號成績\n ");
	   for (i=0;i<12;i++)
	   {
		   data[i][0]=i+1;
		   data[i][1]=(Math.abs(rand.nextInt(50)))+50;
		   list.insert(data[i][0],name[i],data[i][1]);
	   }
	   for (i=0;i<3;i++)
	   {
		   for(j=0;j<4;j++)
			   System.out.print("["+data[j*3+i][0]+"]  ["+data[j*3+i][1]+"]  ");
		   System.out.println();
	   }

	   while(true)
	   {
		   System.out.print("請輸入要刪除成績的座號，結束輸入-1： ");
		   findword=Integer.parseInt(buf.readLine());
		   if(findword==-1)
			   break;
		   else
		   {
			   Node current=new Node(list.first.data,list.first.names,list.first.np);
			   current.next=list.first.next;
			   while(current.data!=findword) current=current.next;
			   list.delete(current);
		   }
		   System.out.println("刪除後成績串列，請注意！要刪除的成績其座號必須在此串列中\n");
		   list.print();
	   }
    }
}
