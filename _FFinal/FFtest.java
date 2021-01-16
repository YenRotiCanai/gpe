import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class RoadsInTheNorth {
 static boolean[] visited;
 static ArrayList<edge>[] list;
 static int max, res;

 public static void dfs(int i, int cost) {
  visited[i] = true;
  if (cost > max) {
   max = cost;
   res = i;
  }
  for (edge x : list[i])
   if (!visited[x.i])
    dfs(x.i, cost + x.cost);
 }

 public static void main(String[] args) throws IOException {
  BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
  while (b.ready()) {
   list = new ArrayList[10000];
   for (int i = 0; i < 10000; i++) 
    list[i]=new ArrayList<edge>();
   visited = new boolean[10000];
   boolean[] found=new boolean[10000];
   while (b.ready()) {
    String s = b.readLine();
    if (s.equals(""))
     break;
    String[] temp = s.split(" ");
    int a = Integer.parseInt(temp[0]);
    int bb = Integer.parseInt(temp[1]);
    int c = Integer.parseInt(temp[2]);
    list[a - 1].add(new edge(bb-1, c));
    list[bb - 1].add(new edge(a-1, c));
    found[a-1]=found[bb-1]=true;
   }
   max=res=0;
   for (int i = 0; i < 10000; i++) 
    if(found[i]){
     dfs(i, 0);
     break;
    }
   max=0;
   visited=new boolean[10000];
   dfs(res, 0);
   System.out.println(max);
  }

 }

 static class edge {
  int i, cost;

  public edge(int i, int cost) {
   this.i = i;
   this.cost = cost;
  }
 }
}
