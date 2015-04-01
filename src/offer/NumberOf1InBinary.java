package offer;

public class NumberOf1InBinary
{
	//方法1：将该数与0x1进行相与，若为1，则表示最低位为1，之后向右移1位，再次相与，从而统计出总共有多少个1
//	static int numberOf1(int n){
//		int count = 0;
//		while(n!= 0)
//		{
//			if((n & 0x1)==1)
//			count++;
//			n = n>>1;
//		}
//		return count;
//	}
//	
	
	//针对方法1在处理负数的时候陷入死循环（最高位的1不断向右移，但是本身的最高位依然保持为1）的情况，因此有了方法2。
	//方法2，将该数与0x1相与，若不为0，表示该位为1，之后将0x1向左进行位移操作。这种方法对于有符号无符号皆可
	//时间复杂度为O（32），32位的整数需要循环32次。
	static int numberOf1(int n)
	{
		int count = 0;
		int flag = 0x1;
		while(flag!=0){
			if((flag & n )!=0)
			count++;
			flag = flag<<1; //如果向左移到超过32位，就会变为0
		}
		return count;
	}
	
	//方法3：带来惊喜的解法.
	//  n&(n-1)每做一次这样的操作，就可以将最右边的1给消掉
	static int numberOfOne(int n){
		int count = 0;
		while(n!=0){
			 count++;
			n = (n & (n-1));
			  
		}
		return count;
	}
	
	public static void main(String[] args)
	{
		int number = Integer.MAX_VALUE;
		int result = numberOf1(number);
		int result2 = numberOfOne(number);
		System.out.println(result2);
	}

}
