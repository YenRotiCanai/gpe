// �إߤG����

import java.io.*;
public    class Tree01
{
public static void main(String args[]) throws IOException

   {  
	int i,level;
	int data[]={6,3,5,9,7,8,4,2}; /*��l�}�C*/
	int btree[]=new int[16];
	for(i=0;i<16;i++) btree[i]=0;
	System.out.print("��l�}�C���e: \n");
	for(i=0;i<8;i++)
	System.out.print("["+data[i]+"] ");
	System.out.println();
	for(i=0;i<8;i++)                    /*���l�}�C�����ȳv�@���*/
	{  
		for(level=1;btree[level]!=0;)   /*�����ڤΰ}�C������*/
		{  
			if(data[i]>btree[level])    /*�p�G�}�C�����Ȥj���ڡA�h���k�l����*/
				level=level*2+1;
			else                        /*�p�G�}�C�����Ȥp��ε����ڡA�h�����l����*/
				level=level*2;
		}                               /*�p�G�l��`�I���Ȥ���0�A�h�A�P�}�C�����Ȥ���@��*/
		btree[level]=data[i];           /*��}�C�ȩ�J�G����*/
	}
	System.out.print("�G���𤺮e�G\n");
	for (i=1;i<16;i++)
		System.out.print("["+btree[i]+"] ");
	System.out.print("\n");
	
   }	
}