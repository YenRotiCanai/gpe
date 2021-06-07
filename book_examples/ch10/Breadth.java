// ���s��`�j�M�k(BFS) 

class Node {
   int x;
   Node next;
   public Node(int x) {
      this.x=x;
      this.next=null;
   }
}
class GraphLink {
   public Node first;
   public Node last;
   public boolean isEmpty() {
      return first==null;
   }
   public void print() {
      Node current=first;
      while(current!=null) {
         System.out.print("["+current.x+"]");
	 current=current.next;
      }
      System.out.println();
   }
   public void insert(int x) {
      Node newNode=new Node(x);
      if(this.isEmpty()) {
         first=newNode;
	 last=newNode;
      }
      else {
	 last.next=newNode;
	 last=newNode;
      }
   }
}

public class Breadth {	
   public static int run[]=new int[9];//�ΨӰO���U���I�O�_���X�L
   public static GraphLink Head[]=new GraphLink[9];	
   public final static int MAXSIZE=10; //�w�q��C���̤j�e�q	
   static int[] queue= new int[MAXSIZE];//��C�}�C���ŧi
   static int front=-1; //���V��C���e��
   static int rear=-1; //���V��C�����
   //��C��ƪ��s�J
   public static void enqueue(int value) {
      if(rear>=MAXSIZE) return;
      rear++;
      queue[rear]=value;
   }
   //��C��ƪ����X
   public static int dequeue() {
      if(front==rear) return -1;
      front++;
      return queue[front];
   }
   //�s���u���j�M�k
   public static void bfs(int current) {
      Node tempnode; //�{�ɪ��`�I����
      enqueue(current); //�N�Ĥ@�ӳ��I�s�J��C
      run[current]=1; //�N���X�L�����I�]�w��1
      System.out.print("["+current+"]"); //�L�X�Ө��X�L�����I
      while(front!=rear) { //�P�_�ثe�O�_���Ŧ�C
         current=dequeue(); //�N���I�q��C�����X
         tempnode=Head[current].first; //���O���ثe���I����m
         while(tempnode!=null) {
            if(run[tempnode.x]==0) {
               enqueue(tempnode.x);
               run[tempnode.x]=1; //�O���w���X�L
               System.out.print("["+tempnode.x+"]");
            }
	    tempnode=tempnode.next;
         }
      }
   }

   public static void main (String args[]) {
      int Data[][] =  //�ϧ���u�}�C�ŧi
      { {1,2},{2,1},{1,3},{3,1},{2,4},{4,2},{2,5},{5,2},{3,6},{6,3},
      {3,7},{7,3},{4,5},{5,4},{6,7},{7,6},{5,8},{8,5},{6,8},{8,6} };
      int DataNum;			
      int i,j;				
      System.out.println("�ϧΪ��F����C���e�G"); //�C�L�ϧΪ��F����C���e
      for( i=1 ; i<9 ; i++ ) { //�@���K�ӳ��I
	 run[i]=0; //�]�w�Ҧ����I���|�����X�L
	 Head[i]=new GraphLink();	
	 System.out.print("���I"+i+"=>");
	 for( j=0 ; j<20 ;j++) {
	    if(Data[j][0]==i) { //�p�G�_�I�M��C���۵��A�h�⳻�I�[�J��C
	       DataNum = Data[j][1];
	       Head[i].insert(DataNum);
	    }
	 }
	 Head[i].print();  //�C�L�ϧΪ��F����C���e
      }		
      System.out.println("�s���u�����X���I�G");   //�C�L�s���u�����X�����I
      bfs(1);
      System.out.println("");
   }
}