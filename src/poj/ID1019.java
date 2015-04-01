package poj;

import java.util.Scanner;

public class ID1019
{
	public static int number(int position){
		int i = 0;
		int sum =0;
		int ans = 0;
		while(position>sum)
		{
			i++;
			sum = i*(i+1)/2;
		}
		i--;//此时刚好超过前i项和，故将i向前退一格
		ans = position - i*(i+1)/2;
		return ans;
		
	}
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int ncase = sc.nextInt();
		while(ncase-->0){
			int pos = sc.nextInt();
			System.out.println(number(pos));
		}	
	}

}

