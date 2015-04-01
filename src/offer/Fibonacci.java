package offer;

public class Fibonacci
{
	//����1����ͳ�ĵݹ���
//	public static int fibonacci(int n){
//		if(n == 0|| n ==1){
//			return 1;
//		}
//		else
//			return fibonacci(n-1) + fibonacci(n-2);
//	}
	
	
	//����2��ʱ�临�Ӷ�ΪO(n)����
	public static long fibonacci(int n){
		if(n==0 || n==1){
			return 1L;
		}
		long fibNMinusOne = 1;
		long fibNMinusTwo = 1;
		long fibN = 0;
		for(int i = 2;i <= n; i++){
			fibN = fibNMinusOne + fibNMinusTwo;
			fibNMinusTwo = fibNMinusOne;
			fibNMinusOne = fibN;
		}
		return fibN;
	}

	
	public static void main(String[] args)
	{
		long start = System.currentTimeMillis();
		long result = fibonacci(4);
		long end = System.currentTimeMillis();
		System.out.println(result);
		System.out.println(end - start);
	}

}
