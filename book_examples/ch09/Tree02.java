// 以鏈結串列實作二元樹

import java.io.*;
//二元樹節點類別宣告
class TreeNode {
       int value;
       TreeNode left_Node;
       TreeNode right_Node;
       // TreeNode建構子
       public TreeNode(int value) {
          this.value=value;
          this.left_Node=null;
          this.right_Node=null;
       }
    } 
//二元樹類別宣告
class BinaryTree {
   public TreeNode rootNode; //二元樹的根節點
   //建構子:利用傳入一個陣列的參數來建立二元樹
   public BinaryTree(int[] data) {
      for(int i=0;i<data.length;i++) 
         Add_Node_To_Tree(data[i]);
   }
   //將指定的值加入到二元樹中適當的節點
   void Add_Node_To_Tree(int value) {
      TreeNode currentNode=rootNode;
      if(rootNode==null) { //建立樹根
         rootNode=new TreeNode(value);
         return;
      }
      //建立二元樹
      while(true) {
         if (value<currentNode.value) { //在左子樹
            if(currentNode.left_Node==null) {
              currentNode.left_Node=new TreeNode(value);
              return;
            }
            else currentNode=currentNode.left_Node;
         }
         else { //在右子樹
            if(currentNode.right_Node==null) {
              currentNode.right_Node=new TreeNode(value);
              return;
            }
            else currentNode=currentNode.right_Node;
         }
       }
   }
}
public class Tree02 {   
   //主函式
   public static void main(String args[]) throws IOException {
      int ArraySize=10;
      int tempdata;
      int[] content=new int[ArraySize];
      BufferedReader keyin=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("請連續輸入"+ArraySize+"筆資料"); 
      for(int i=0;i<ArraySize;i++) {
      System.out.print("請輸入第"+(i+1)+"筆資料: ");       
      tempdata=Integer.parseInt(keyin.readLine());
      content[i]=tempdata;
      }
      new BinaryTree(content);
      System.out.println("===以鏈結串列方式建立二元樹,成功!!!===");
   }       
}
