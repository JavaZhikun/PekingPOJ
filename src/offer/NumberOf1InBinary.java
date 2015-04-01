package offer;

public class NumberOf1InBinary
{
	//����1����������0x1�������룬��Ϊ1�����ʾ���λΪ1��֮��������1λ���ٴ����룬�Ӷ�ͳ�Ƴ��ܹ��ж��ٸ�1
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
	
	//��Է���1�ڴ�������ʱ��������ѭ�������λ��1���������ƣ����Ǳ�������λ��Ȼ����Ϊ1���������������˷���2��
	//����2����������0x1���룬����Ϊ0����ʾ��λΪ1��֮��0x1�������λ�Ʋ��������ַ��������з����޷��ŽԿ�
	//ʱ�临�Ӷ�ΪO��32����32λ��������Ҫѭ��32�Ρ�
	static int numberOf1(int n)
	{
		int count = 0;
		int flag = 0x1;
		while(flag!=0){
			if((flag & n )!=0)
			count++;
			flag = flag<<1; //��������Ƶ�����32λ���ͻ��Ϊ0
		}
		return count;
	}
	
	//����3��������ϲ�Ľⷨ.
	//  n&(n-1)ÿ��һ�������Ĳ������Ϳ��Խ����ұߵ�1������
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
