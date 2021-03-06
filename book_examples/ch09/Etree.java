// 以鏈結串列實作二元運算樹

//節點類別的宣告
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
//二元搜尋樹類別宣告
class Binary_Search_Tree {
   public TreeNode rootNode; //二元樹的根節點
   //建構子:建立空的二元搜尋樹
   public Binary_Search_Tree() { rootNode=null; }
   //建構子:利用傳入一個陣列的參數來建立二元樹
   public Binary_Search_Tree(int[] data) {
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
         if (value<currentNode.value) { //符合這個判斷表示此節點在左子樹
            if(currentNode.left_Node==null) {
              currentNode.left_Node=new TreeNode(value);
              return;
            }
            else currentNode=currentNode.left_Node;
         }
         else { //符合這個判斷表示此節點在右子樹
            if(currentNode.right_Node==null) {
              currentNode.right_Node=new TreeNode(value);
              return;
            }
            else currentNode=currentNode.right_Node;
         }
       }
   }
}

class Expression_Tree extends Binary_Search_Tree{
   // 建構子
   public Expression_Tree(char[] information, int index) {
      // create方法可以將二元樹的陣列表示法轉換成鏈結表示法
      rootNode = create(information, index);
   }
   // create方法的程式內容
   public TreeNode create(char[] sequence,int index) {
      TreeNode tempNode;            
      if ( index >= sequence.length )   // 作為遞迴呼叫的出口條件
         return null;
      else  { 
         tempNode = new TreeNode((int)sequence[index]);
         // 建立左子樹
         tempNode.left_Node = create(sequence, 2*index);
         // 建立右子樹
         tempNode.right_Node = create(sequence, 2*index+1);
         return tempNode;
      }
   }
  // preOrder(前序走訪)方法的程式內容
   public void preOrder(TreeNode node) {
      if ( node != null ) {
         System.out.print((char)node.value);
         preOrder(node.left_Node);  
         preOrder(node.right_Node); 
      }
   }
   // inOrder(中序走訪)方法的程式內容
   public void inOrder(TreeNode node) {
      if ( node != null ) {
         inOrder(node.left_Node);  
         System.out.print((char)node.value);
         inOrder(node.right_Node); 
      }
   }
   // postOrder(後序走訪)方法的程式內容
   public void postOrder(TreeNode node) {
      if ( node != null ) {
         postOrder(node.left_Node);  
         postOrder(node.right_Node); 
         System.out.print((char)node.value);
      }
   }
   // 判斷運算式如何運算的方法宣告內容
   public int condition(char oprator, int num1, int num2) {
      switch ( oprator ) {
         case '*': return ( num1 * num2 ); // 乘法請回傳num1 * num2
         case '/': return ( num1 / num2 ); // 除法請回傳num1 / num2
         case '+': return ( num1 + num2 ); // 加法請回傳num1 + num2
         case '-': return ( num1 - num2 ); // 減法請回傳num1 - num2
         case '%': return ( num1 % num2 ); // 取餘數法請回傳num1 % num2
      }
      return -1;
   }
   // 傳入根節點,用來計算此二元運算樹的值
   public int answer(TreeNode node) {
      int firstnumber = 0;       
      int secondnumber = 0;      
      // 遞迴呼叫的出口條件
      if ( node.left_Node == null && node.right_Node == null )
        // 將節點的值轉換成數值後傳回
        return Character.getNumericValue((char)node.value);
      else {
        firstnumber = answer(node.left_Node);  // 計算左子樹運算式的值
        secondnumber = answer(node.right_Node); // 計算右子樹運算式的值
        return condition((char)node.value, firstnumber, secondnumber);
      }
   }
 }
public class Etree {
   public static void main(String[] args) {
      // 將二元運算樹以陣列的方式來宣告
      // 第一筆運算式
      char[] information1 = {' ','+','*','%','6','3','9','5' };
      // 第二筆運算式
      char[] information2 = {' ','+','+','+','*','%','/','*',
                            '1','2','3','2','6','3','2','2' };
      Expression_Tree exp1 = new Expression_Tree(information1, 1);
      System.out.println("====二元運算樹數值運算範例 1: ====");
      System.out.println("=================================");
      System.out.print("===轉換成中序運算式===:  ");
      exp1.inOrder(exp1.rootNode);     
      System.out.print("\n===轉換成前序運算式===:  ");
      exp1.preOrder(exp1.rootNode);    
      System.out.print("\n===轉換成後序運算式===:  ");
      exp1.postOrder(exp1.rootNode);   
      // 計算二元樹運算式的運算結果
      System.out.print("\n此二元運算樹,經過計算後所得到的結果值: ");
      System.out.println(exp1.answer(exp1.rootNode));
      // 建立第二棵二元搜尋樹物件
      Expression_Tree exp2 = new Expression_Tree(information2, 1);
      System.out.println();
      System.out.println("====二元運算樹數值運算範例 2: ====");
      System.out.println("=================================");
      System.out.print("===轉換成中序運算式===:  ");
      exp2.inOrder(exp2.rootNode);     
      System.out.print("\n===轉換成前序運算式===:  ");
      exp2.preOrder(exp2.rootNode);    
      System.out.print("\n===轉換成後序運算式===:  ");
      exp2.postOrder(exp2.rootNode);   
      // 計算二元樹運算式的運算結果
      System.out.print("\n此二元運算樹,經過計算後所得到的結果值: ");
      System.out.println(exp2.answer(exp2.rootNode));

   }
}
