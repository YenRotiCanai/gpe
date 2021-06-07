// �̤p�����X�i��

public class Span
{	
	public static int VERTS=6;
	public static int v[]=new int[VERTS+1];
	public static Node NewList = new Node();	
	public static int findmincost()
	{
		int minval=100;
		int retptr=0;
		int a=0;
		while(NewList.Next[a]!=-1)
		{
			if(NewList.val[a]<minval && NewList.find[a]==0)
			{
				minval=NewList.val[a];
				retptr=a;
			}
			a++;
		}
		NewList.find[retptr]=1;
		return retptr;
	}
	public static void mintree()
	{
		int i,result=0;
		int mceptr;
		int a=0;
		for(i=0;i<=VERTS;i++)
			v[i]=0;
		while(NewList.Next[a]!=-1)
		{
			mceptr=findmincost();
			v[NewList.from[mceptr]]++;
			v[NewList.to[mceptr]]++;
			if(v[NewList.from[mceptr]]>1 && v[NewList.to[mceptr]]>1)
			{
				v[NewList.from[mceptr]]--;
				v[NewList.to[mceptr]]--;
				result=1;
			}
			else
				result=0;
			if(result==0)
			{
				System.out.print("�_�l���I["+NewList.from[mceptr]+"]  �פ�I[");
				System.out.print(NewList.to[mceptr]+"]  ���|����["+NewList.val[mceptr]+"]");
				System.out.println("");			
			}
			a++;
		}
	}
	public static void main (String args[])
	{
		int Data[][] =			/*�ϧΰ}�C�ŧi*/

			{ {1,2,6},{1,6,12},{1,5,10},{2,3,3},{2,4,5},
		      {2,6,8},{3,4,7},{4,6,11},{4,5,9},{5,6,16} };
		int DataNum;			
		int fromNum;		
		int toNum;		
		int findNum;
		int Header = 0;			
		int FreeNode;			
		int i,j;			
		System.out.println("�إ߹ϧΦ�C�G");
  /*�C�L�ϧΪ��F����C���e*/
		for ( i=0 ; i<10 ; i++ )
		{
			for( j=1 ; j<=VERTS ;j++)
			{
				if(Data[i][0]==j)
				{
					fromNum = Data[i][0];
					toNum = Data[i][1];
					DataNum = Data[i][2];
					findNum=0;
					FreeNode = NewList.FindFree();
					NewList.Create(Header,FreeNode,DataNum,fromNum,toNum,findNum);
				}
			}
		}				
		NewList.PrintList(Header);
		System.out.println("�إ̤߳p�����X�i��");	
		mintree();
	}
}

class Node
{
	int MaxLength = 20;			// �w�q�쵲��C�̤j����
	int from[] = new int[MaxLength];	
	int to[] = new int[MaxLength];	
	int find[] = new int[MaxLength];	
	int val[] = new int[MaxLength];	
	int Next[] = new int[MaxLength];	// �쵲��C���U�@�Ӹ`�I��m
	
	public Node ()				// Node�غc�l
	{
		for ( int i = 0 ; i < MaxLength ; i++ )
			Next[i] = -2;		// -2���ܥ��θ`�I
	}
	
// ---------------------------------------------------
// �j�M�i�θ`�I��m
// ---------------------------------------------------	
	public int FindFree()
	{
		int	i;

		for ( i=0 ; i< MaxLength ; i++ )
			if ( Next[i] == -2 )
				break;
		return i;
	}

// ---------------------------------------------------
// �إ��쵲��C
// ---------------------------------------------------		
	public void Create(int Header,int FreeNode,int DataNum,int fromNum,int toNum,int findNum)
	{
		int Pointer;			// �{�b���`�I��m
	
		if ( Header == FreeNode )	// �s���쵲��C
		{	
			val[Header] = DataNum;	// �]�w��ƽs��
			from[Header]=fromNum;
			find[Header]=findNum;
			to[Header]=toNum;
			Next[Header] = -1;	// �N�U�Ӹ`�I����m�A-1���ܪŸ`�I
		}
		else
		{			
			Pointer = Header;	// �{�b���`�I�����`�I							
			val[FreeNode] = DataNum;// �]�w��ƽs��
			from[FreeNode]=fromNum;
			find[FreeNode]=findNum;
			to[FreeNode]=toNum;
						// �]�w��ƦW��
			Next[FreeNode] = -1;	// �N�U�Ӹ`�I����m�A-1���ܪŸ`�I
						// ��M�쵲��C����
			while ( Next[Pointer] != -1)
				Pointer = Next[Pointer];

						// �N�s�`�I��s�b���C����
			Next[Pointer] = FreeNode;	
		}
	}

// ---------------------------------------------------
// �L�X�쵲��C���
// ---------------------------------------------------		
	public void PrintList(int Header)
	{
		int	Pointer;		
		Pointer = Header;
		while ( Pointer != -1 )
		{
			System.out.print("�_�l���I["+from[Pointer]+"]  �פ�I[");
			System.out.print(to[Pointer]+"]  ���|����["+val[Pointer]+"]");
			System.out.println("");			
			Pointer = Next[Pointer];
		}
	}	
}