class Node {
    int x;
    Node next;

    public Node(int x){
        this.x = x;
        this.next = null;
    }
}

class GraphLink{
    public Node first, last;

    public boolean isEmpty(){
        return first == null;
    }

    public void print(){
        Node current = first;

        while(current!=null){
            System.out.print("["+current.x+"]");
            current = current.next;
        }

        System.out.println();
    }

    public void insert(int x){
        Node newNode = new Node(x);
        if(this.isEmpty()){
            first = newNode; last = newNode;
        }else{
            last.next = newNode;
            last = newNode;
        }
    }
}

public class Deep{
    public static int run[] = new int[9];
    public static GraphLink Head[] = new GraphLink[9];
    
    //深度優先走訪副程式
    public static void dfs(int current){
        run[current] = 1; //設定 1 證明他走過了
        System.out.print("["+current+"]");

        while((Head[current].first)!=null){

            //如果頂點還沒有走過的話，就呼叫 dfs 讓他走一次
            if(run[Head[current].first.x] == 0) dfs(Head[current].first.x);

            Head[current].first = Head[current].first.next;
        }
    }
}