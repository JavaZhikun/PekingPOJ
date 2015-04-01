package poj;

public class Leetcode192
{
	
	    // you need to treat n as an unsigned value
	    public static int hammingWeight(long n1) {
	    	long n = n1;
	        int sum = 0;
	        int count = 32;
	        while(n > 0&&count>0){
	            if((n&0x1)!=0){
	                sum++;
	            }
	            n = n>>1;
	            count--;
	        }
	        return sum;
	    }
	    
	    public static void main(String[] args)
		{
		     long n =2147483649L;
		     System.out.println(hammingWeight(n));
		}
	


}
