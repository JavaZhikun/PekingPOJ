package poj;

public class LeetCode191
{
	public int reverseBits(int n)
	{
		final int SIZE = 32;
		int[] bit = new int[SIZE];
		for(int i =0; i <SIZE/2; i++)
		{
			int temp = bit[i];
			bit[i] = bit[SIZE-1-i];
			bit[SIZE-1-i] =temp;
		}
	}
	

}
