// 引線二元樹的建立與中序走訪

import java.io.*;
//引線二元樹中的節點宣告
class ThreadNode {
       int value;
       int left_Thread;
       int right_Thread;
       ThreadNode left_Node;
       ThreadNode right_Node;
       // TreeNode建構子
       public ThreadNode(int value) {
          this.value=value;
          this.left_Thread=0;
          this.right_Thread=0;
          this.left_Node=null;
          this.right_Node=null;
       }
} 
//引線二元樹的類別宣告
class Threaded_Binary_Tree{
   public ThreadNode rootNode; //引線二元樹的根節點

   //無傳入參數的建構子
   public Threaded_Binary_Tree() {
      rootNode=null;
   }

   //建構子:建立引線二元樹,傳入參數為一陣列
   //陣列中的第一筆資料是用來建立引線二元樹的樹根節點
   public Threaded_Binary_Tree(int data[]) {
      for(int i=0;i<data.length;i++)
         Add_Node_To_Tree(data[i]);
   }
   //將指定的值加入到二元引線樹
   void Add_Node_To_Tree(int value) {
      ThreadNode newnode=new ThreadNode(value);
      ThreadNode current;
      ThreadNode parent;
      ThreadNode previous=new ThreadNode(value);
      int pos;
      //設定引線二元樹的開頭節點
      if(rootNode==null) {
         rootNode=newnode;
         rootNode.left_Node=rootNode;
         rootNode.right_Node=null;
         rootNode.left_Thread=0;
         rootNode.right_Thread=1;
         return;
      }
      //設定開頭節點所指的節點
      current=rootNode.right_Node;
      if(current==null){
         rootNode.right_Node=newnode;
         newnode.left_Node=rootNode;
         newnode.right_Node=rootNode;
         return ;
      }
      parent=rootNode; //父節點是開頭節點
      pos=0; //設定二元樹中的行進方向
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
   //引線二元樹中序走訪
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
      System.out.println("引線二元樹經建立後,以中序追蹤能有排序的效果");
      System.out.println("除了第一個數字作為引線二元樹的開頭節點外");
      int[] data1={0,10,20,30,100,399,453,43,237,373,655};
      Threaded_Binary_Tree tree1=new Threaded_Binary_Tree(data1);
      System.out.println("====================================");
      System.out.println("範例 1 ");
      System.out.println("數字由小到大的排序順序結果為: ");
      tree1.print();
      int[] data2={0,101,118,87,12,765,65};
      Threaded_Binary_Tree tree2=new Threaded_Binary_Tree(data2);
      System.out.println("====================================");
      System.out.println("範例 2 ");
      System.out.println("數字由小到大的排序順序結果為: ");
      tree2.print();
      }
}
