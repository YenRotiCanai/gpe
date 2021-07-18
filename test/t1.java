import java.util.*;

class Main{
	public static void main(String[] args){
		int multi[][] = new int[][]{
			{4,9,8},
			{7,5,2},
			{3,0,6},
		};

		for(int i=0; i<multi.length; i++){
			System.out.println(Arrays.toString(multi[i]));
		}
		System.out.println();

		int arrCol[][] = multi.clone();
		sortByCol(arrCol, 3);
		System.out.println("after col 3 sorting");
		for(int i=0; i<arrCol.length; i++){
			System.out.println(Arrays.toString(arrCol[i]));
		}
		System.out.println();

		int arrRow[][] = sortByRow(multi);
		System.out.println("after row sorting");
		for(int i=0; i<arrRow.length; i++){
			System.out.println(Arrays.toString(arrRow[i]));
		}
	}

	public static void sortByCol(int arr[][], int colNum){
		Arrays.sort(arr, new Comparator<int[]>(){
			public int compare(int first[], int second[]){
				if(first[colNum - 1] > second[colNum - 1]) return 1;
				else return -1;
			}
		});
	}

	static int[][] sortByRow(int arr[][]){
		for(int i=0; i<arr.length; i++){
			Arrays.sort(arr[i]);
		}
		return arr;
	}
}