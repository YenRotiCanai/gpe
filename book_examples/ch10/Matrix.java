// �ϥά۾F�x�}�Ӫ��ܦ��V��

import java.io.*;
public    class Matrix
{
public static void main(String args[]) throws IOException
   {  
	int arr[][]=new int[5][5];  //�ŧi�x�}arr
	int i,j,tmpi,tmpj;     
	int [][] data={{1,2},{2,1},{2,3},{2,4},{4,3}};  //�ϧΦU�䪺�_�I�Ȥβ��I��
	for (i=0;i<5;i++)           //��x�}�M��0
		for (j=0;j<5;j++)
			arr[i][j]=0;
	for (i=0;i<5;i++)       //Ū���ϧθ��
		for (j=0;j<5;j++)   //��Jarr�x�}
		{  
			tmpi=data[i][0];     //tmpi���_�l���I
			tmpj=data[i][1];     //tmpj���פ�I
			arr[tmpi][tmpj]=1;   //���䪺�I��J1
		}
	System.out.print("���V�ϧίx�}�G\n");
	for (i=1;i<5;i++)
	{  
		for (j=1;j<5;j++)
	    System.out.print("["+arr[i][j]+"] ");   //�C�L�x�}���e
		System.out.print("\n");
	}
   }
}