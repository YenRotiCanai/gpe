// �¦ձƧǪk

import java.io.*;

public class Shell extends Object
{
	int data[]=new int[8];
	int size=8;	
	
	public static void main(String args[])
	{ 		
		Shell test =  new Shell();
		test.inputarr();		
		System.out.print("�z��J����l�}�C�O�G");
		test.showdata();
		test.shell();
	}

	void inputarr()
	{
		int i=0;
		for (i=0;i<size;i++)
		{ 
			System.out.print("�п�J��"+(i+1)+"�Ӥ����G");
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
		int i;        //i�����y����
		int j;        //�Hj�өw����������
		int k=1;      //k�C�L�p��
		int tmp;      //tmp�ΨӼȦs���
		int jmp;      //�]�w���Z�첾�q
		jmp=size/2;
		while (jmp != 0)
		{  
			for (i=jmp ;i<size ;i++)
			{  
				tmp=data[i];
				j=i-jmp;
				while(j>=0 && tmp<data[j])  //���J�ƧǪk
				{  
					data[j+jmp] = data[j];
					j=j-jmp;
				}	
				data[jmp+j]=tmp;				
			}
			
			System.out.print("��"+ (k++) +"���ƧǡG");			
			showdata();
			jmp=jmp/2;    //����j���
		}
        }
}