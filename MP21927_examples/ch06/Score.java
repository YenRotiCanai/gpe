// �إߤ��Ӿǥͦ��Z����V�쵲��C�A
// �è��X�C�@�Ӹ`�I�ӦC�L���Z

import java.io.*;

public class ch03_01 
{
   public static void main(String args[]) throws IOException
   {
	BufferedReader buf;
	buf=new BufferedReader(new InputStreamReader(System.in));
	int num;
	String name;
	int score;
	
	System.out.println("�п�J5���ǥ͸�ơG ");
	LinkedList list=new LinkedList();
	for (int i=1;i<6;i++)
	{
		System.out.print("�п�J�y���G ");
		num=Integer.parseInt(buf.readLine());
		System.out.print("�п�J�m�W�G ");
		name=buf.readLine();
		System.out.print("�п�J���Z�G ");
		score=Integer.parseInt(buf.readLine());
		list.insert(num,name,score);
		System.out.println("-------------");
	}
	System.out.println(" �� �� �� �Z ");
	System.out.println(" �y��  �m�W ���Z ===========");
	list.print();
    }
}