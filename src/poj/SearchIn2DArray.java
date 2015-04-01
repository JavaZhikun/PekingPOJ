package poj;

import java.util.Scanner;

public class SearchIn2DArray
{
	public static int getNumberInArray(int[][] a, int n){
		for(int i = 0; i< a.length;i++)
		{
			for(int j = 0;j<a[i].length;j++)
			{
				if(n == a[i][j])
					return 1;
			}
		}
		return 0;
	}
	
	
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		while(true){
		int m = sc.nextInt();
		int n = sc.nextInt();
		int number =sc.nextInt();
		int[][] array = new int[m][n];
		for(int i =0; i<m;i++)
		{
			for(int j =0;j<n;j++)
			{
				array[i][j] = sc.nextInt();
			}
		}
		
		int result = getNumberInArray(array,number);
		if(result == 1)
		{
			System.out.println("Yes");
		}else
		{
			System.out.println("No");
		}
	}
		
		
	}
	

}
