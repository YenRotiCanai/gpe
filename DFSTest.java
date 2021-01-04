//http://www.hongyanliren.com/2017m03/38202.html

public class DFSTest {
    
    private char[] vertices; // 存储节点信息

    private int[][] arcs; // 存储边信息（邻接/相鄰矩阵）

    private int vexNum; // 图的节点数

    private boolean[] visited; // 记录节点是否已被遍历

    // 初始化
    public DFSTest(int n){
        vexNum = n;
        vertices = new char[n];
        arcs = new int[n][n];
        visited = new boolean[n];

        for(int i=0; i<vexNum; i++){
            for(int j=0; j<vexNum; j++){
                arcs[i][j] = 0;
            }
        }
    }

    // 添加边(无向图)
    public void addEdge(int i, int j){

        if(i == j) return;

        arcs[i][j] = 1;
        arcs[j][i] = 1;
    }

    public void setVertices(char[] vertices){
        this.vertices = vertices;
    }
}