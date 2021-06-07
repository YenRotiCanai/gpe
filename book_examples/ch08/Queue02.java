// ��@�H�쵲��C�إߦ�C

import java.io.*;
class QueueNode                 // ��C�`�I���O
{
   int data;                    // �`�I���
   QueueNode next;              // ���V�U�@�Ӹ`�I
   //�غc�l
   public QueueNode(int data) {
       this.data=data;
       next=null;
   }
};

class Linked_List_Queue { //��C���O
   public QueueNode front; //��C���e�ݫ���
   public QueueNode rear;  //��C�����ݫ���

//�غc�l
   public Linked_List_Queue() { front=null; rear=null; }

//��kenqueue:��C��ƪ��s�J                          
public boolean enqueue(int value) {
   QueueNode node= new QueueNode(value); //�إ߸`�I
  //�ˬd�O�_���Ŧ�C
   if (rear==null)
      front=node; //�s�إߪ��`�I������1�Ӹ`�I
   else
      rear.next=node; //�N�`�I�[�J���C������
   rear=node; //�N��C�����ݫ��Ы��V�s�[�J���`�I
   return true;
}

//��kdequeue:��C��ƪ����X
public int dequeue() {
   int value;
//�ˬd��C�O�_���Ŧ�C
   if (!(front==null)) {
     if(front==rear) rear=null;
     value=front.data; //�N��C��ƨ��X
     front=front.next; //�N��C���e�ݫ��Ы��V�U�@��
     return value;
   }
   else return -1;
}
} //��C���O�ŧi����

public class Queue02 {
// �D�{��
   public static void main(String args[]) throws IOException {
   Linked_List_Queue queue =new Linked_List_Queue(); //�إߦ�C����
   int temp;
   System.out.println("�H�쵲��C�ӹ�@��C");
   System.out.println("====================================");
   System.out.println("�b��C�e�ݥ[�J��1����ơA����ƭȬ�1");
   queue.enqueue(1);
   System.out.println("�b��C�e�ݥ[�J��2����ơA����ƭȬ�3");
   queue.enqueue(3);
   System.out.println("�b��C�e�ݥ[�J��3����ơA����ƭȬ�5");
   queue.enqueue(5);
   System.out.println("�b��C�e�ݥ[�J��4����ơA����ƭȬ�7");
   queue.enqueue(7);
   System.out.println("�b��C�e�ݥ[�J��5����ơA����ƭȬ�9");
   queue.enqueue(9);
   System.out.println("====================================");
   while (true) {
      if (!(queue.front==null)) {
         temp=queue.dequeue();
         System.out.println("�q��C�e�ݨ̧Ǩ��X��������ƭȬ��G"+temp);
      }
      else
         break;
   }
   System.out.println();
  }
}