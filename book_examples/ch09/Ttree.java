// �޽u�G���𪺫إ߻P���Ǩ��X

import java.io.*;
//�޽u�G���𤤪��`�I�ŧi
class ThreadNode {
       int value;
       int left_Thread;
       int right_Thread;
       ThreadNode left_Node;
       ThreadNode right_Node;
       // TreeNode�غc�l
       public ThreadNode(int value) {
          this.value=value;
          this.left_Thread=0;
          this.right_Thread=0;
          this.left_Node=null;
          this.right_Node=null;
       }
} 
//�޽u�G�������O�ŧi
class Threaded_Binary_Tree{
   public ThreadNode rootNode; //�޽u�G���𪺮ڸ`�I

   //�L�ǤJ�Ѽƪ��غc�l
   public Threaded_Binary_Tree() {
      rootNode=null;
   }

   //�غc�l:�إߤ޽u�G����,�ǤJ�ѼƬ��@�}�C
   //�}�C�����Ĥ@����ƬO�Ψӫإߤ޽u�G���𪺾�ڸ`�I
   public Threaded_Binary_Tree(int data[]) {
      for(int i=0;i<data.length;i++)
         Add_Node_To_Tree(data[i]);
   }
   //�N���w���ȥ[�J��G���޽u��
   void Add_Node_To_Tree(int value) {
      ThreadNode newnode=new ThreadNode(value);
      ThreadNode current;
      ThreadNode parent;
      ThreadNode previous=new ThreadNode(value);
      int pos;
      //�]�w�޽u�G���𪺶}�Y�`�I
      if(rootNode==null) {
         rootNode=newnode;
         rootNode.left_Node=rootNode;
         rootNode.right_Node=null;
         rootNode.left_Thread=0;
         rootNode.right_Thread=1;
         return;
      }
      //�]�w�}�Y�`�I�ҫ����`�I
      current=rootNode.right_Node;
      if(current==null){
         rootNode.right_Node=newnode;
         newnode.left_Node=rootNode;
         newnode.right_Node=rootNode;
         return ;
      }
      parent=rootNode; //���`�I�O�}�Y�`�I
      pos=0; //�]�w�G���𤤪���i��V
      while(current!=null) {
         if(current.value>value) {
            if(pos!=-1) {
               pos=-1;
               previous=parent;
            }
            parent=current;
            if(current.left_Thread==1)
               current=current.left_Node;
            else
               current=null;
         }
         else {
            if(pos!=1) {
               pos=1;
               previous=parent;
            }
            parent=current;
            if(current.right_Thread==1)
               current=current.right_Node;
            else
               current=null;
         }
      }
      if(parent.value>value) {
         parent.left_Thread=1;
         parent.left_Node=newnode;
         newnode.left_Node=previous;
         newnode.right_Node=parent;
      }
      else {
         parent.right_Thread=1;
         parent.right_Node=newnode;
         newnode.left_Node=parent;
         newnode.right_Node=previous;
      }
      return ;
   }
   //�޽u�G���𤤧Ǩ��X
   void print() {
      ThreadNode tempNode;
      tempNode=rootNode;
      do {
         if(tempNode.right_Thread==0)
            tempNode=tempNode.right_Node;
         else
         {
            tempNode=tempNode.right_Node;
            while(tempNode.left_Thread!=0)
               tempNode=tempNode.left_Node;
         }
         if(tempNode!=rootNode)
            System.out.println("["+tempNode.value+"]");
      } while(tempNode!=rootNode);
   } 
}

public class Ttree {
   public static void main(String[] args) throws IOException {
      System.out.println("�޽u�G����g�إ߫�,�H���ǰl�ܯ঳�ƧǪ��ĪG");
      System.out.println("���F�Ĥ@�ӼƦr�@���޽u�G���𪺶}�Y�`�I�~");
      int[] data1={0,10,20,30,100,399,453,43,237,373,655};
      Threaded_Binary_Tree tree1=new Threaded_Binary_Tree(data1);
      System.out.println("====================================");
      System.out.println("�d�� 1 ");
      System.out.println("�Ʀr�Ѥp��j���ƧǶ��ǵ��G��: ");
      tree1.print();
      int[] data2={0,101,118,87,12,765,65};
      Threaded_Binary_Tree tree2=new Threaded_Binary_Tree(data2);
      System.out.println("====================================");
      System.out.println("�d�� 2 ");
      System.out.println("�Ʀr�Ѥp��j���ƧǶ��ǵ��G��: ");
      tree2.print();
      }
}