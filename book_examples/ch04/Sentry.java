// ��}��w�ƧǪk

public class Sentry extends Object
{
	int data[]=new int[]{4,6,2,7,8,9};	//��l���

	public static void main(String args[])
	{		
		System.out.print("��}��w�ƧǪk\n��l��Ƭ��G");
		Sentry test=new Sentry();
		test.showdata();
		test.bubble();
	}
	
	public void showdata ()     //�Q�ΰj��C�L���
    {
	int i;
	for (i=0;i<6;i++)
	{
		System.out.print(data[i]+" ");
	}
	System.out.print("\n");
    }

    public void bubble ()
    {
	int i,j,tmp,flag;    	
	for(i=5;i>=0;i--)
	{
		flag=0;           //flag�ΨӧP�_�O�_������洫���ʧ@
		for (j=0;j<i;j++)
		{
			if (data[j+1]<data[j])
			{
				tmp=data[j];
				data[j]=data[j+1];
				data[j+1]=tmp;
				flag++;    //�p�G������L�洫�A�hflag����0
			}
		}
		if (flag==0)
		{
			break;
		}
			
			//�����槹�@�����y�N�P�_�O�_���L�洫�ʧ@�A�p�G�S���洫�L���
			//�A���ܦ��ɰ}�C�w�����ƧǡA�G�i�������X�j��
			
			System.out.print("��"+(6-i)+"���ƧǡG");
			for (j=0;j<6;j++)
			{
				System.out.print(data[j]+" ");
			}
			System.out.print("\n");
		}
		
	System.out.print("�Ƨǫᵲ�G���G");
	showdata ();
	}
}