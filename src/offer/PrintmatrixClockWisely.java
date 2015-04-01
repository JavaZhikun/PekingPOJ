package offer;

public class PrintmatrixClockWisely
{
	
	
	public static void printmatrixIncircle(int[][] matrix,int rows,int columns,int start){
		int endY = columns - 1 - start;
		int endX = rows - 1 - start;
		int number = 0;
		//从左到右打印一行
		for(int i = start; i <= endY; i++){
			 number = matrix[start][i];
			System.out.println(number);
		}
		
		//从上到下打印一列
		if(start < endX){
			for(int i = start + 1; i <= endX; i++ )
			{
				number = matrix[i][endY];
				System.out.println(number);
			}
		}
		
		//从右到左打印一行
		if(start < endX && start < endY -1){
			for(int i = endY - 1;i >= start; i--){
				number = matrix[endX][i];
				System.out.println(number);
			}
		}
		
		//从下到上打印一列
		if(start < endX -1 && start < endY - 1){
			for(int i = endX -1; i > start + 1; i--){
				number = matrix[i][start];
				System.out.println(number);
			}
		}
	}
	
	public static void printmatrixClockWisely(int[][] matrix,int rows,int columns){
		//检查边界条件
		if(matrix==null || rows < 0 ||columns < 0 )
			return ;
		
		int start = 0;
		while(columns > start*2 && rows > start*2){
			printmatrixIncircle(matrix, rows, columns, start);
			++start;
		}
	}
	
	public static void main(String[] args)
	{
		int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},};
		printmatrixClockWisely(matrix,3,4);
	}

}
