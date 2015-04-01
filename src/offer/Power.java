package offer;

//��һ���������������������㣨�ݿ��ܴ�����������������0�������
public class Power
{
	static boolean invalidInput = false;
	static double power(double base,int exponent){
		
		
		//���ڵ���base��˵��Ҳ������������������0�����
		if(equal(base, 0.0)==true & exponent < 0)
		{
			invalidInput = true;
			return 0.0;
		}
		
		
		//��ָ�������Ǹ�����������д���
		int absExponent = Math.abs(exponent); //ָ���������߸�����ʱ�򣬾����������ֵ
		
		double result = powerWithUnsignedExponent(base,absExponent); //ָ��Ϊ��ʱ
		if(exponent < 0)            //ָ��Ϊ������ʱ�����䵹��
			result = 1/result;
		
		return result;
	}
	
	
	//���ں͸�����0�Ƚϣ�Ӧ���������0.0000001֮��
	static boolean equal(double a,double b){
		boolean flag = false;
		if((a-b)<0.0000001 ||(b-a)<0.0000001)
			flag = true;
		return flag;
		
	}
	
	static double powerWithUnsignedExponent(double base,int exponent){ //�Ǹ���
		
		if(exponent == 0)
			return 1;
		if(exponent ==1 )
			return base;
		
			double result = powerWithUnsignedExponent(base, exponent>>1);
			result *= result;  //ָ�����ƣ��൱����������ˣ�a^4 = a^2 * a^2��
				if((exponent & 0x1) ==1)  //���ָ��Ϊ���������ٳ���base
					result *= base;
		
		
	    return result;
		
	}
	
	public static void main(String[] args)
	{
		System.out.println(power(2,-2));
	}

}
