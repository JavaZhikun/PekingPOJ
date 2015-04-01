package offer;

import java.util.Scanner;

//二维数组中的查找
public class ID03
{
//	public static int[] search(int[][] a,int number){
//		int[] result=new int[3];
//		int flag = 0; //未找到标志位设为0
//		int col = a[0].length-1, row = 0;//
//		while(flag==0){
//			if(a[row][col]==number){
//				flag =1;
//			}else if(a[row][col]>number){
//				col--;//在左边区域
//			}else
//			{
//				row++;//在下边区域
//			}
//		}
//		result[0] = flag;
//		result[1] = row + 1;
//		result[2] = col + 1;
//		
//		
//		return result;
//	}
	
	//第二版，没有考虑到数组可能直接给了行和列，还有应该对行和列加限制条件，防止数组越界问题
	public static int[] search(int[][] a, int rows,int columns,int number){
		int[] result = new int[3];//保存flag和最终找到的行和列号
		int flag = 0;//未找到时的赋值
		if(a!=null && rows > 0&& columns > 0){
			int row = 0;
			int column = columns -1; //定位到右上角
			while(row < rows && column >=0)  //搜索的最终界限
			{
				if(a[row][column]== number){
					flag = 1;
					break;
				}else if(a[row][column] > number)
				{
					column--;//在左边
				}else
				{
					row++;//在下面
				}
			}
			result[0] = flag;
			result[1] = row+1;
			result[2] = column +1;
		}
		
		return result;
		
		
	}
	
	public static void main(String[] args)
	{
		int[] result = new int[3];
		int n = 0;
		int[][] array ={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		result = search(array,4,4,n);
		if(result[0]==1){
			System.out.println("Yes,Find it!");
			System.out.println("the position is in row: " + result[1] +" col:" +result[2]);
		}
		else
			System.out.println(" Not exit");
		
	}
	
	
	
	

}
