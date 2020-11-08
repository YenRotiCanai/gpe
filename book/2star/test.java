import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main  {

	static int row, col;
	static String grid[];
	static boolean visited[][];

	public static boolean valid(int r, int c) {
		return ((r >= 0 && r < row) && (c >= 0 && c < col));
	}

	public static void floodFill(int r, int c) {
		if (!valid(r, c) || grid[r].charAt(c) != '@' || visited[r][c])
			return;
		visited[r][c] = true;
		floodFill(r + 1, c);
		floodFill(r - 1, c);
		floodFill(r, c + 1);
		floodFill(r, c - 1);
		floodFill(r + 1, c + 1);
		floodFill(r + 1, c - 1);
		floodFill(r - 1, c - 1);
		floodFill(r - 1, c + 1);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String temp;
		StringBuilder ans = new StringBuilder();
		while ((temp = in.readLine()) != null) {
			String[] x = temp.split(" ");
			row = Integer.parseInt(x[0]);
			col = Integer.parseInt(x[1]);
			grid = new String[row];
			visited = new boolean[row][col];
			if (row == 0)
				break;
			for (int i = 0; i < row; i++)
				grid[i] = in.readLine();
			int cnt = 0;
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					if (!visited[i][j] && grid[i].charAt(j) == '@') {
						cnt++;
						floodFill(i, j);
					}
				}
			}
			ans.append(cnt).append("\n");
		}
		System.out.print(ans.toString());
	}
}