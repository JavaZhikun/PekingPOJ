package offer;

public class MoreThanHalfNum
{
	//�ж�����������г�����������������û�г���һ�����
	public static boolean  checkMoreThanHalf(int[] number, int length, int theNumber){
		int times = 0;
		for(int i = 0; i<length; i++)
		{
			if(theNumber == number[i])
				times++;
		}
		boolean isMoreThanHalf = false;
		if(times*2>length)
		{
			isMoreThanHalf = true;
		}
		else 
			isMoreThanHalf =false;
		
		return isMoreThanHalf;
	}
	

	
    public static int moreThanHalfNum(int[] number){
    	int theNumber = number[0] ;
    	int count = 1;//���� 
    
    	for(int i = 1;i<  number.length;i++){//�ӵڶ�������ʼ
    		if(count==0){
    			//��������ֵ���ĵ�0����theNumber����ֵ�滻�����¿�ʼ
    			theNumber = number[i];
    			count =1;
    		}
    		if(number[i]==theNumber){
    			count++;          //ĳһ���������ظ���������1
    		}else{
    			count--;
    		}
    	}
    	
    	if(checkMoreThanHalf(number,number.length,theNumber)==false)
    	{
    		return 0;          //û�г���һ���������ʱ������0
    	}
    	
    	return theNumber;
    }
	
    public static void main(String[] args)
	{
		int[] array={1,2,2,1,1,2,2,2,3,3,4};
		System.out.println(moreThanHalfNum(array));
	}
    
}