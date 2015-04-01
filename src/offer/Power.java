package offer;

//求一个浮点数的整数次幂运算（幂可能存在正数，负数或者0的情况）
public class Power
{
	static boolean invalidInput = false;
	static double power(double base,int exponent){
		
		
		//对于底数base来说，也有正数，负数，还有0的情况
		if(equal(base, 0.0)==true & exponent < 0)
		{
			invalidInput = true;
			return 0.0;
		}
		
		
		//对指数可能是负数的情况进行处理
		int absExponent = Math.abs(exponent); //指数正数或者负数的时候，均先求其绝对值
		
		double result = powerWithUnsignedExponent(base,absExponent); //指数为正时
		if(exponent < 0)            //指数为负数的时候，求其倒数
			result = 1/result;
		
		return result;
	}
	
	
	//对于和浮点数0比较，应该是相差在0.0000001之内
	static boolean equal(double a,double b){
		boolean flag = false;
		if((a-b)<0.0000001 ||(b-a)<0.0000001)
			flag = true;
		return flag;
		
	}
	
	static double powerWithUnsignedExponent(double base,int exponent){ //非负数
		
		if(exponent == 0)
			return 1;
		if(exponent ==1 )
			return base;
		
			double result = powerWithUnsignedExponent(base, exponent>>1);
			result *= result;  //指数右移，相当于是两数相乘（a^4 = a^2 * a^2）
				if((exponent & 0x1) ==1)  //如果指数为奇数，则再乘以base
					result *= base;
		
		
	    return result;
		
	}
	
	public static void main(String[] args)
	{
		System.out.println(power(2,-2));
	}

}
